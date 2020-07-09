from gensim.models.doc2vec import Doc2Vec
from gensim.models.doc2vec import TaggedDocument


def generate_train_x(whole_texts):
    x_train = []
    for i, text in enumerate(whole_texts):
        document = TaggedDocument(text, tags=[i])
        x_train.append(document)
    return x_train


def train(x_train, size=300):
    model = Doc2Vec(x_train, min_count=1, window=3,
                    size=size, sample=1e-3, negative=5)
    model.train(x_train, total_examples=model.corpus_count, epochs=10)
    return model
