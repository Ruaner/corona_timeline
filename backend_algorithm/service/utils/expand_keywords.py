from typing import Set
from nltk.corpus import wordnet
from typing import List
from gensim.models import KeyedVectors
from .text_clean import clean

# 获取已经训练好的外部词向量
# w2vmodel = KeyedVectors.load_word2vec_format('data/wiki-news-300d-1M.vec')

# 对大类别的关键词进行同义词拓展


# 获取同义词函数
def find_synsets_in_wordnet(word: str) -> Set[str]:
    """find synsets in WordNet

    Args:
        word (str): the word which will get sysnsets

    Retrun:
        words (Set[str]): the similar words for the input word
    """
    synsets = wordnet.synsets(
        word, pos=[wordnet.NOUN, wordnet.ADJ, wordnet.VERB])
    words = set()
    words.add(word)
    for synset in synsets:
        lemma_words = synset.lemma_names()
        for lemma_word in lemma_words:
            words.add(lemma_word)

    # CAREFUL: the words will contain some invaild words, you need to clean them!
    return words


# 对大类别关键词list生成扩展后的关键词（文档）list
def generate_similar_keywords(topics: List[str],
                              words: List[str]) -> List[list]:
    w2vmodel = KeyedVectors.load_word2vec_format('data/wiki-news-300d-1M.vec')
    topic_texts = []
    for i in range(len(topics)):
        topic_words = set()

        # 获取同义词
        for topic_word in topics[i]:
            topic_words |= find_synsets_in_wordnet(topic_word)

        # 删除不在words中的词语
        temp_set = set()
        for word in topic_words:
            if word in words:
                temp_set.add(word)
        topic_words = temp_set

        # embedding相似词
        temp_set = set()
        for word in topic_words:
            items = w2vmodel.most_similar(word)
            for similar_word, prob in items:
                temp_set.add(similar_word)

        pre_topic_words = ' '.join(temp_set)
        pre_topic_words = clean(pre_topic_words)
        topic_words = list(set(pre_topic_words))

        topic_texts.append(topic_words)

    return topic_texts
