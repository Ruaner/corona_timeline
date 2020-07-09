from sklearn.feature_extraction.text import CountVectorizer, TfidfTransformer
import numpy as np
from gensim.models import KeyedVectors


# TF/IDF关键词抽取函数
def tfidf(texts):
    # 转换格式
    whole_text = []
    for text in texts:
        whole_text.append(text)

    vectorizer = CountVectorizer()
    word_frequence = vectorizer.fit_transform(whole_text)
    # 维度: word_num
    words = vectorizer.get_feature_names()

    transformer = TfidfTransformer()
    tfidf = transformer.fit_transform(word_frequence)
    # 维度: text_num * word_num
    weight = tfidf.toarray()

    return words, weight


# 关键词list转换为词向量函数
def keyword2vec(words, weight, w2vmodel):
    # 维度: text_num * keyword_num * embed_dim
    texts_embed = []

    # 对每个新闻，取十个关键词表示一个新闻
    for i in range(len(weight)):

        indexs = np.argsort(-weight[i])[:10]
        select_words = [words[idx]
                        for idx in indexs if words[idx] in w2vmodel.vocab.keys()]
        # 维度: keyword_num * embed_dim
        text_embed = w2vmodel[select_words]

        texts_embed.append(text_embed)

    return texts_embed
