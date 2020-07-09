import pandas as pd
from generate_keywords import tfidf
from doc2vec import generate_train_x, train
import pickle

# 加载数据
news_info = pd.read_csv('data/news_info.csv')
news_info['texts'] = news_info.apply(
    lambda x: x['news_title']+" "+x['news_text']+" "+x['news_topics'], axis=1)
texts = news_info['texts'].tolist()
words, weights = tfidf(texts)

# 模型训练
x_train = generate_train_x(texts)
doc2vec_model = train(x_train)

# 保存模型
with open('doc2vec/doc2vec.pkl', 'wb') as f:
    pickle.dump(doc2vec_model, f)
