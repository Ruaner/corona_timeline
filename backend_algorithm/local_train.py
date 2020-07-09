
import base64

# 本地训练
import numpy as np
import pandas as pd
import os
import pickle
from gensim.models.doc2vec import Doc2Vec
from scipy.spatial.distance import cdist

from service.utils import operate_db
from service.utils.download import download_events, download_news
from service.utils.expand_keywords import generate_similar_keywords
from service.utils.generate_keywords import tfidf

download_news('./data')

'''
    新闻语料(模型训练语料)
'''
print("准备新闻语料")
news_info = pd.read_csv('./data/news_info.csv')

if len(news_info) == 0:
    print("没有新增新闻数据")
    exit(0)

news_info['texts'] = news_info.apply(
    lambda x: x['news_title']+" "+x['news_text']+" "+x['news_topics'], axis=1)
texts = news_info['texts'].tolist()
words, weights = tfidf(texts)

'''
    大类别语料
'''
print("处理大类别语料")
# topic1: Reopen and rework
topics_1 = ['reopen', 'rework', 'jobs', 'unemployment',
            'backward', 'economy', 'factory', 'resume']
# topic2: Politician speak
topics_2 = ['minister', 'president', 'governor',
            'administration', 'reform', 'politician', 'china']
# topic3: Expert interpret
topics_3 = ['dr.', 'doctor', 'fda', 'who', 'cdc', 'expert']
# topic4: Scientific progress
topics_4 = ['vaccine', 'medicine', 'science', 'progress',
            'detection', 'origin', 'clinical', 'specimen']
# topic5: Advice and support
topics_5 = ['mask', 'alcohol', 'advice', 'support', 'stay', 'wash',
            'hand', 'eye', 'nose', 'mouth', 'touch', 'handwashing', 'soap']
# topic6: World cases
topics_6 = ['rise', 'cases', 'live', 'surge',
            'increase', 'pandemic', 'number', 'expand']
topics = [topics_1, topics_2, topics_3, topics_4, topics_5, topics_6]
topic_texts = generate_similar_keywords(topics, words)


'''
    加载doc2vec
'''
print("加载doc2vec")
with open('./doc2vec/doc2vec.pkl', 'rb') as f:
    doc2vec_model = pickle.load(f)


doc2vec_model: Doc2Vec

'''
    1.大类划分
'''
print("大类划分")
# 生成向量矩阵
topic_texts_vecs = []
for i in range(len(topic_texts)):
    tmp_vec = doc2vec_model.infer_vector(doc_words=list(
        topic_texts[i]), alpha=0.025, steps=500).reshape(1, -1)
    topic_texts_vecs.append(tmp_vec)
topic_texts_vecs = np.concatenate(topic_texts_vecs)
new_texts_vecs = []
for i in range(len(texts)):
    tmp_vec = doc2vec_model.infer_vector(doc_words=list(
        texts[i]), alpha=0.025, steps=500).reshape(1, -1)
    new_texts_vecs.append(tmp_vec)
new_texts_vecs = np.concatenate(new_texts_vecs)
# 对每个新闻计算每种topic的得分
# text_num * topic_num 得分矩阵
texts_size = len(texts)
topic_size = len(topic_texts)
classify_scores = np.zeros((texts_size, topic_size))
for i in range(texts_size):
    for j in range(topic_size):
        # 距离越小越好
        distances = cdist(new_texts_vecs[i].reshape(
            1, -1), topic_texts_vecs[j].reshape(1, -1), metric='cosine')
        classify_scores[i][j] = distances
# 根据得分矩阵获取新闻类别
texts_cates = np.argmin(classify_scores, axis=1)
# 拼接到news_info
news_info['news_cate'] = pd.DataFrame(texts_cates)
texts_ids = news_info['news_id'].tolist()
# 写入新闻类别ID到数据库
operate_db.update_news_cates(texts_cates, texts_ids)


'''
    2.新闻事件划分
'''
print("新闻事件划分")
event_ids = []
for _, row in news_info.iterrows():

    # 每遍历一次要下载更新一次事件表
    download_events('./data')
    print("处理有效事件语料")
    events_info = pd.read_csv('./data/events_info.csv')
    events_texts = events_info['event_vec'].tolist()

    text = row['news_title']+" "+row['news_text']+" "+row['news_topics']
    text_vec = doc2vec_model.infer_vector(doc_words=list(
        text), alpha=0.025, steps=500).reshape(1, -1)

    if len(events_texts) == 0:
        e_id = operate_db.insert_event(row, text_vec)
        event_ids.append(e_id)
    else:
        max_score = [0, 100]
        for _, event in events_info.iterrows():
            event_vec_text = base64.b64decode(eval(event['event_vec']), b'@#')
            event_vec = np.fromstring(
                event_vec_text, dtype=np.float32).reshape(1, -1)
            distances = cdist(text_vec, event_vec, metric='cosine')
            if distances < max_score[1]:
                # 更新得分
                max_score[0] = event['event_id']
                max_score[1] = distances
        # 判断阈值
        if max_score[1] > 0.5:
            e_id = operate_db.insert_event(row, text_vec)
            event_ids.append(e_id)
        else:
            operate_db.update_event(row, max_score[0])
            event_ids.append(max_score[0])
text_ids = news_info['news_id'].tolist()
operate_db.update_news_events(event_ids, text_ids)


'''
    3.新闻情感划分
'''

# 调用 bert 进行类别生成
# 对 news_info.csv 读取生成答案
os.system("python bert/main.py --mode test")
# 读取生成结果
bert_df = pd.read_csv('bert/output/bert_result.csv',
                      names=['news_id', 'attis_cate', 'attis_score'])

# 0 left 1 cental 2 right
news_info['attis_cate'] = 3
news_info['attis_score'] = 0.0
for idx, row in news_info.iterrows():
    if row['news_media_name'] == 'CNN':
        news_info['attis_cate'][idx] = 0
        news_info['attis_score'][idx] = 0.5
    elif row['news_media_name'] == 'Foxnews':
        news_info['attis_cate'][idx] = 2
        news_info['attis_score'][idx] = 0.75
    elif row['news_media_name'] == 'BBC':
        news_info['attis_cate'][idx] = 1
        news_info['attis_score'][idx] = 0.6
    elif row['news_media_name'] == 'USnews':
        news_info['attis_cate'][idx] = 1
        news_info['attis_score'][idx] = 0.2
    elif row['news_media_name'] == 'CGTN':
        news_info['attis_cate'][idx] = 1
        news_info['attis_score'][idx] = 0.6
    elif row['news_media_name'] == 'Thetimes':
        news_info['attis_cate'][idx] = 2
        news_info['attis_score'][idx] = 0.2
    elif row['news_media_name'] == 'Xinhua':
        news_info['attis_cate'][idx] = 1
        news_info['attis_score'][idx] = 0.6

# 模型得分融合
for idx, row in news_info.iterrows():
    news_id = row['news_id']
    bert_row = bert_df[bert_df['news_id'] == news_id].iloc[0]
    if row['attis_cate'] == bert_row['attis_cate']:
        news_info['attis_score'][idx] = row['attis_score'] * 0.2 + bert_row['attis_score'] * 0.8
    elif row['attis_cate'] != bert_row['attis_cate']:
        news_info['attis_score'][idx] = row['attis_score'] * 0.6 + bert_row['attis_score'] * 0.4

text_ids = news_info['news_id'].tolist()
attis_cates = news_info['attis_cate'].tolist()
attis_scores = news_info['attis_score'].tolist()
operate_db.update_news_attis(attis_cates, attis_scores, text_ids)
