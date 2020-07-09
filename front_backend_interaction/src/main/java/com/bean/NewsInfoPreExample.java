package com.bean;

import java.util.ArrayList;
import java.util.List;

public class NewsInfoPreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsInfoPreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeIsNull() {
            addCriterion("news_up_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeIsNotNull() {
            addCriterion("news_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeEqualTo(String value) {
            addCriterion("news_up_time =", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeNotEqualTo(String value) {
            addCriterion("news_up_time <>", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeGreaterThan(String value) {
            addCriterion("news_up_time >", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeGreaterThanOrEqualTo(String value) {
            addCriterion("news_up_time >=", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeLessThan(String value) {
            addCriterion("news_up_time <", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeLessThanOrEqualTo(String value) {
            addCriterion("news_up_time <=", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeLike(String value) {
            addCriterion("news_up_time like", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeNotLike(String value) {
            addCriterion("news_up_time not like", value, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeIn(List<String> values) {
            addCriterion("news_up_time in", values, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeNotIn(List<String> values) {
            addCriterion("news_up_time not in", values, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeBetween(String value1, String value2) {
            addCriterion("news_up_time between", value1, value2, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsUpTimeNotBetween(String value1, String value2) {
            addCriterion("news_up_time not between", value1, value2, "newsUpTime");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameIsNull() {
            addCriterion("news_media_name is null");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameIsNotNull() {
            addCriterion("news_media_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameEqualTo(String value) {
            addCriterion("news_media_name =", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameNotEqualTo(String value) {
            addCriterion("news_media_name <>", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameGreaterThan(String value) {
            addCriterion("news_media_name >", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameGreaterThanOrEqualTo(String value) {
            addCriterion("news_media_name >=", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameLessThan(String value) {
            addCriterion("news_media_name <", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameLessThanOrEqualTo(String value) {
            addCriterion("news_media_name <=", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameLike(String value) {
            addCriterion("news_media_name like", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameNotLike(String value) {
            addCriterion("news_media_name not like", value, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameIn(List<String> values) {
            addCriterion("news_media_name in", values, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameNotIn(List<String> values) {
            addCriterion("news_media_name not in", values, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameBetween(String value1, String value2) {
            addCriterion("news_media_name between", value1, value2, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsMediaNameNotBetween(String value1, String value2) {
            addCriterion("news_media_name not between", value1, value2, "newsMediaName");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsIsNull() {
            addCriterion("news_topics is null");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsIsNotNull() {
            addCriterion("news_topics is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsEqualTo(String value) {
            addCriterion("news_topics =", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsNotEqualTo(String value) {
            addCriterion("news_topics <>", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsGreaterThan(String value) {
            addCriterion("news_topics >", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsGreaterThanOrEqualTo(String value) {
            addCriterion("news_topics >=", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsLessThan(String value) {
            addCriterion("news_topics <", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsLessThanOrEqualTo(String value) {
            addCriterion("news_topics <=", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsLike(String value) {
            addCriterion("news_topics like", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsNotLike(String value) {
            addCriterion("news_topics not like", value, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsIn(List<String> values) {
            addCriterion("news_topics in", values, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsNotIn(List<String> values) {
            addCriterion("news_topics not in", values, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsBetween(String value1, String value2) {
            addCriterion("news_topics between", value1, value2, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsTopicsNotBetween(String value1, String value2) {
            addCriterion("news_topics not between", value1, value2, "newsTopics");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdIsNull() {
            addCriterion("news_media_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdIsNotNull() {
            addCriterion("news_media_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdEqualTo(Integer value) {
            addCriterion("news_media_id =", value, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdNotEqualTo(Integer value) {
            addCriterion("news_media_id <>", value, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdGreaterThan(Integer value) {
            addCriterion("news_media_id >", value, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_media_id >=", value, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdLessThan(Integer value) {
            addCriterion("news_media_id <", value, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_media_id <=", value, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdIn(List<Integer> values) {
            addCriterion("news_media_id in", values, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdNotIn(List<Integer> values) {
            addCriterion("news_media_id not in", values, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdBetween(Integer value1, Integer value2) {
            addCriterion("news_media_id between", value1, value2, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsMediaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_media_id not between", value1, value2, "newsMediaId");
            return (Criteria) this;
        }

        public Criteria andNewsCountryIsNull() {
            addCriterion("news_country is null");
            return (Criteria) this;
        }

        public Criteria andNewsCountryIsNotNull() {
            addCriterion("news_country is not null");
            return (Criteria) this;
        }

        public Criteria andNewsCountryEqualTo(String value) {
            addCriterion("news_country =", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryNotEqualTo(String value) {
            addCriterion("news_country <>", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryGreaterThan(String value) {
            addCriterion("news_country >", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryGreaterThanOrEqualTo(String value) {
            addCriterion("news_country >=", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryLessThan(String value) {
            addCriterion("news_country <", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryLessThanOrEqualTo(String value) {
            addCriterion("news_country <=", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryLike(String value) {
            addCriterion("news_country like", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryNotLike(String value) {
            addCriterion("news_country not like", value, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryIn(List<String> values) {
            addCriterion("news_country in", values, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryNotIn(List<String> values) {
            addCriterion("news_country not in", values, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryBetween(String value1, String value2) {
            addCriterion("news_country between", value1, value2, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCountryNotBetween(String value1, String value2) {
            addCriterion("news_country not between", value1, value2, "newsCountry");
            return (Criteria) this;
        }

        public Criteria andNewsCateIsNull() {
            addCriterion("news_cate is null");
            return (Criteria) this;
        }

        public Criteria andNewsCateIsNotNull() {
            addCriterion("news_cate is not null");
            return (Criteria) this;
        }

        public Criteria andNewsCateEqualTo(String value) {
            addCriterion("news_cate =", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateNotEqualTo(String value) {
            addCriterion("news_cate <>", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateGreaterThan(String value) {
            addCriterion("news_cate >", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateGreaterThanOrEqualTo(String value) {
            addCriterion("news_cate >=", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateLessThan(String value) {
            addCriterion("news_cate <", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateLessThanOrEqualTo(String value) {
            addCriterion("news_cate <=", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateLike(String value) {
            addCriterion("news_cate like", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateNotLike(String value) {
            addCriterion("news_cate not like", value, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateIn(List<String> values) {
            addCriterion("news_cate in", values, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateNotIn(List<String> values) {
            addCriterion("news_cate not in", values, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateBetween(String value1, String value2) {
            addCriterion("news_cate between", value1, value2, "newsCate");
            return (Criteria) this;
        }

        public Criteria andNewsCateNotBetween(String value1, String value2) {
            addCriterion("news_cate not between", value1, value2, "newsCate");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("event_id like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("event_id not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeIsNull() {
            addCriterion("news_attitude is null");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeIsNotNull() {
            addCriterion("news_attitude is not null");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeEqualTo(Integer value) {
            addCriterion("news_attitude =", value, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeNotEqualTo(Integer value) {
            addCriterion("news_attitude <>", value, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeGreaterThan(Integer value) {
            addCriterion("news_attitude >", value, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_attitude >=", value, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeLessThan(Integer value) {
            addCriterion("news_attitude <", value, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeLessThanOrEqualTo(Integer value) {
            addCriterion("news_attitude <=", value, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeIn(List<Integer> values) {
            addCriterion("news_attitude in", values, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeNotIn(List<Integer> values) {
            addCriterion("news_attitude not in", values, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeBetween(Integer value1, Integer value2) {
            addCriterion("news_attitude between", value1, value2, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("news_attitude not between", value1, value2, "newsAttitude");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreIsNull() {
            addCriterion("news_atti_score is null");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreIsNotNull() {
            addCriterion("news_atti_score is not null");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreEqualTo(Float value) {
            addCriterion("news_atti_score =", value, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreNotEqualTo(Float value) {
            addCriterion("news_atti_score <>", value, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreGreaterThan(Float value) {
            addCriterion("news_atti_score >", value, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("news_atti_score >=", value, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreLessThan(Float value) {
            addCriterion("news_atti_score <", value, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreLessThanOrEqualTo(Float value) {
            addCriterion("news_atti_score <=", value, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreIn(List<Float> values) {
            addCriterion("news_atti_score in", values, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreNotIn(List<Float> values) {
            addCriterion("news_atti_score not in", values, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreBetween(Float value1, Float value2) {
            addCriterion("news_atti_score between", value1, value2, "newsAttiScore");
            return (Criteria) this;
        }

        public Criteria andNewsAttiScoreNotBetween(Float value1, Float value2) {
            addCriterion("news_atti_score not between", value1, value2, "newsAttiScore");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}