import string

from nltk import pos_tag, word_tokenize
from nltk.corpus import stopwords, wordnet
from nltk.stem import WordNetLemmatizer


# 词型还原
def get_wordnet_pos(treebank_tag):
    if treebank_tag.startswith('J'):
        return wordnet.ADJ
    elif treebank_tag.startswith('V'):
        return wordnet.VERB
    elif treebank_tag.startswith('N'):
        return wordnet.NOUN
    elif treebank_tag.startswith('R'):
        return wordnet.ADV
    else:
        return None


def lemmatize_sentence(sentence):
    res = []
    lemmatizer = WordNetLemmatizer()
    for word, pos in pos_tag(word_tokenize(sentence)):
        wordnet_pos = get_wordnet_pos(pos) or wordnet.NOUN
        res.append(lemmatizer.lemmatize(word, pos=wordnet_pos))

    return res


# 清洗函数
def clean(doc):
    cleanDoc = []
    doc = doc.lower()

    # 清洗换行符
    doc = doc.replace('\n', '')
    doc = doc.replace('\r', '')

    for c in set(string.punctuation):
        doc = doc.replace(c, '')
    for c in set(string.digits):
        doc = doc.replace(c, '')
    stop = set(stopwords.words('english'))
    doc = " ".join([i for i in doc.split() if i not in stop])
    doc = lemmatize_sentence(doc)
    for word in doc:
        if len(word) >= 3 and wordnet.synsets(word):
            cleanDoc.append(word)

    return cleanDoc
