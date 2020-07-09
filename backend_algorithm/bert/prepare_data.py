import pymysql
import pandas as pd
from text_clean import clean

conn = pymysql.connect(host='39.97.176.70',
                       port=3306,
                       user='root',
                       password='password',
                       database='test_timeline')


sql = f"""
        SELECT news_text, news_attitude
    FROM
        news_info
    WHERE news_attitude is not NULL;
    """

cur = conn.cursor()
cur.execute(sql)

rows = cur.fetchall()
rows = list(rows)
cur.close()
conn.close()

df = pd.DataFrame(rows, columns=['news_text', 'label'])
df['news_text'] = df['news_text'].apply(lambda x: ' '.join(clean(x)))
df = df[df['news_text'].apply(lambda x: len(x) > 61)]
df.reset_index()

df.to_csv('data/train_set.csv', index=False)
