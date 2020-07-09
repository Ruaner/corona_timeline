import pymysql
import time
import base64


def connect_db():
    return pymysql.connect(host='39.97.176.70',
                           port=3306,
                           user='root',
                           password='password',
                           database='test_timeline')


# 查询未处理的新闻
def select_news(select_columns):
    sql = f"""
        SELECT {','.join(select_columns)}
    FROM
        news_info 
    WHERE news_cate IS NULL and news_up_time is not NULL
    ORDER BY
        news_up_time ASC;
    """
    con = connect_db()
    cur = con.cursor()
    cur.execute(sql)
    rows = cur.fetchall()
    rows = list(rows)
    cur.close()
    con.close()

    return rows


# 查询事件表(24小时内仍在更新的事件)
def select_events(select_columns):
    sql = f"""
        SELECT {','.join(select_columns)} 
    FROM
        events_info 
    WHERE
        TIMESTAMPDIFF( HOUR, event_update_time, NOW() );
    """
    con = connect_db()
    cur = con.cursor()
    cur.execute(sql)
    rows = cur.fetchall()
    rows = list(rows)
    cur.close()
    con.close()

    return rows


# 事件表-修改
def update_event(row, event_id):
    event_time = row['news_up_time']
    # 转换为localtime
    time_local = time.localtime(event_time)
    # 转换为新的时间格式
    event_update_time = time.strftime("%Y-%m-%d %H:%M:%S", time_local)

    con = connect_db()
    cur = con.cursor()
    sql = f"""
        UPDATE events_info
        SET
            event_update_time = "{event_update_time}"
        WHERE
            event_id = {event_id};
    """
    cur.execute(sql)
    con.commit()
    cur.close()
    con.close()


# 事件表-新增
def insert_event(row, text_vec):
    event_update_time = row['news_up_time']
    # 转换为localtime
    time_local = time.localtime(event_update_time)
    # 转换为新的时间格式
    event_start_time = time.strftime("%Y-%m-%d %H:%M:%S", time_local)

    encode_text_vec = base64.b64encode(text_vec, b'@#')

    con = connect_db()
    cur = con.cursor()

    sql = f"""
        SELECT news_title,news_abstract 
    FROM 
        news_info
    WHERE
        news_id = {row['news_id']};
    """
    cur.execute(sql)
    need = cur.fetchall()
    event_title = need[0][0].replace("\"", "\\\"")
    event_abstract = need[0][1].replace("\"", "\\\"")

    sql = """
        SELECT MAX(event_id) FROM events_info;
    """
    cur.execute(sql)
    flag = cur.fetchall()[0][0]
    event_id = flag+1 if flag != None else 1

    sql = f"""
    INSERT INTO events_info(
        event_id, event_title, event_cate, event_start_time,
        event_country, event_dis, event_update_time, event_vec)
    VALUES(
        {event_id}, "{event_title}", {row['news_cate']+1}, 
        "{event_start_time}", "{row['news_country']}",
        "{event_abstract}", 
        "{event_start_time}", "{encode_text_vec}");
    """
    try:
        cur.execute(sql)
    except:
        print(sql)
        raise ValueError
    con.commit()
    cur.close()
    con.close()
    return event_id


# 修改新闻表-存储新闻分类结果
def update_news_cates(texts_cates, texts_ids):
    con = connect_db()
    cur = con.cursor()
    for cate, idx in zip(texts_cates, texts_ids):
        sql = f"""
        UPDATE  news_info
        SET
            news_cate = {cate+1} 
        WHERE
            news_id = {idx};
        """

        cur.execute(sql)
    con.commit()
    cur.close()
    con.close()


# 修改新闻表-存储新闻所属事件
def update_news_events(events_ids, texts_ids):
    con = connect_db()
    cur = con.cursor()
    for event, idx in zip(events_ids, texts_ids):
        sql = f"""
        UPDATE  news_info
        SET
            event_id = {event} 
        WHERE
            news_id = {idx};
        """
        cur.execute(sql)
    con.commit()
    cur.close()
    con.close()


# 修改新闻表-存储新闻派别
def update_news_attis(atti_cates, atti_scores, texts_ids):
    con = connect_db()
    cur = con.cursor()
    for atti_cate, atti_score, idx in zip(atti_cates, atti_scores, texts_ids):
        sql = f"""
        UPDATE news_info
        SET
            news_attitude = {atti_cate},
            news_atti_score = {atti_score}
        WHERE
            news_id = {idx};
        """
        cur.execute(sql)
    con.commit()
    cur.close()
    con.close()
