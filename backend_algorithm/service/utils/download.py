from service.utils import operate_db
from service.utils import text_clean
import pandas as pd
import numpy as np
import time


def process_topic(x):
    if x[0] == '[':
        topics = eval(x)
        return ' '.join(topics)
    else:
        return ' '.join(x.split(','))


def process_time(x):
    x = x.replace('  ', ' ')
    if '/' in x:
        x = x.replace('/', '-')
    dates = x.split(' ')
    if len(dates) == 1:
        x = x + ' 00:00:00'
    else:
        meta_times = dates[1].split(':')
        new_times = []
        for i in range(3):
            if i < len(meta_times) and meta_times[i] != '':
                new_times.append(f"{meta_times[i]}")
            else:
                new_times.append("00")
        x = dates[0] + " "+':'.join(new_times)
    date = time.strptime(x, '%Y-%m-%d %H:%M:%S')

    return int(time.mktime(date))


def download_news(save_path='./data'):
    select_columns = [
        'news_id', 'news_title', 'news_up_time',
        'news_text', 'news_abstract', 'news_topics',
        'news_media_id', 'news_media_name', 'news_country']
    rows = operate_db.select_news(select_columns)
    df = pd.DataFrame(rows, columns=select_columns)

    # process text
    df['news_title'] = df['news_title'].apply(
        lambda x: ' '.join(text_clean.clean(x)))
    df['news_text'] = df['news_text'].apply(
        lambda x: ' '.join(text_clean.clean(x)))
    df['news_abstract'] = df['news_abstract'].apply(
        lambda x: ' '.join(text_clean.clean(x)))

    df = df[df['news_text'].apply(lambda x: len(x) > 60)]

    # process topics
    df['news_topics'] = df['news_topics'].apply(process_topic)

    # process times
    df['news_up_time'] = df['news_up_time'].apply(process_time)

    # 删去为数据为空的行
    df.replace(to_replace=r'^\s*$', value=np.nan, regex=True, inplace=True)
    df.replace(to_replace='null', value=np.nan, regex=True, inplace=True)
    df = df.dropna()

    df.to_csv(f'{save_path}/news_info.csv', index=False, header=True)


def download_events(save_path='./data'):
    select_columns = ['event_id', 'event_vec']
    rows = operate_db.select_events(select_columns)
    df = pd.DataFrame(rows, columns=select_columns)

    # 删去为数据为空的行
    df.replace(to_replace=r'^\s*$', value=np.nan, regex=True, inplace=True)
    df.replace(to_replace='null', value=np.nan, regex=True, inplace=True)
    df = df.dropna()

    df.to_csv(f'{save_path}/events_info.csv', index=False, header=True)
