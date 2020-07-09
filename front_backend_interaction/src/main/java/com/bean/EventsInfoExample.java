package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsInfoExample() {
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

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Integer value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Integer value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Integer value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Integer value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Integer value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Integer> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Integer> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Integer value1, Integer value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventCateIsNull() {
            addCriterion("event_cate is null");
            return (Criteria) this;
        }

        public Criteria andEventCateIsNotNull() {
            addCriterion("event_cate is not null");
            return (Criteria) this;
        }

        public Criteria andEventCateEqualTo(Integer value) {
            addCriterion("event_cate =", value, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateNotEqualTo(Integer value) {
            addCriterion("event_cate <>", value, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateGreaterThan(Integer value) {
            addCriterion("event_cate >", value, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_cate >=", value, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateLessThan(Integer value) {
            addCriterion("event_cate <", value, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateLessThanOrEqualTo(Integer value) {
            addCriterion("event_cate <=", value, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateIn(List<Integer> values) {
            addCriterion("event_cate in", values, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateNotIn(List<Integer> values) {
            addCriterion("event_cate not in", values, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateBetween(Integer value1, Integer value2) {
            addCriterion("event_cate between", value1, value2, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventCateNotBetween(Integer value1, Integer value2) {
            addCriterion("event_cate not between", value1, value2, "eventCate");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNull() {
            addCriterion("event_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNotNull() {
            addCriterion("event_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeEqualTo(Date value) {
            addCriterion("event_start_time =", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotEqualTo(Date value) {
            addCriterion("event_start_time <>", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThan(Date value) {
            addCriterion("event_start_time >", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_start_time >=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThan(Date value) {
            addCriterion("event_start_time <", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_start_time <=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIn(List<Date> values) {
            addCriterion("event_start_time in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotIn(List<Date> values) {
            addCriterion("event_start_time not in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeBetween(Date value1, Date value2) {
            addCriterion("event_start_time between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_start_time not between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventCountryIsNull() {
            addCriterion("event_country is null");
            return (Criteria) this;
        }

        public Criteria andEventCountryIsNotNull() {
            addCriterion("event_country is not null");
            return (Criteria) this;
        }

        public Criteria andEventCountryEqualTo(String value) {
            addCriterion("event_country =", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryNotEqualTo(String value) {
            addCriterion("event_country <>", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryGreaterThan(String value) {
            addCriterion("event_country >", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryGreaterThanOrEqualTo(String value) {
            addCriterion("event_country >=", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryLessThan(String value) {
            addCriterion("event_country <", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryLessThanOrEqualTo(String value) {
            addCriterion("event_country <=", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryLike(String value) {
            addCriterion("event_country like", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryNotLike(String value) {
            addCriterion("event_country not like", value, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryIn(List<String> values) {
            addCriterion("event_country in", values, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryNotIn(List<String> values) {
            addCriterion("event_country not in", values, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryBetween(String value1, String value2) {
            addCriterion("event_country between", value1, value2, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventCountryNotBetween(String value1, String value2) {
            addCriterion("event_country not between", value1, value2, "eventCountry");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeIsNull() {
            addCriterion("event_update_time is null");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeIsNotNull() {
            addCriterion("event_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeEqualTo(Date value) {
            addCriterion("event_update_time =", value, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeNotEqualTo(Date value) {
            addCriterion("event_update_time <>", value, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeGreaterThan(Date value) {
            addCriterion("event_update_time >", value, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_update_time >=", value, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeLessThan(Date value) {
            addCriterion("event_update_time <", value, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_update_time <=", value, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeIn(List<Date> values) {
            addCriterion("event_update_time in", values, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeNotIn(List<Date> values) {
            addCriterion("event_update_time not in", values, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("event_update_time between", value1, value2, "eventUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEventUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_update_time not between", value1, value2, "eventUpdateTime");
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