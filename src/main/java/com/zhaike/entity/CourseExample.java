package com.zhaike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNull() {
            addCriterion("directionId is null");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNotNull() {
            addCriterion("directionId is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionidEqualTo(Integer value) {
            addCriterion("directionId =", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotEqualTo(Integer value) {
            addCriterion("directionId <>", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThan(Integer value) {
            addCriterion("directionId >", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("directionId >=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThan(Integer value) {
            addCriterion("directionId <", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThanOrEqualTo(Integer value) {
            addCriterion("directionId <=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidIn(List<Integer> values) {
            addCriterion("directionId in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotIn(List<Integer> values) {
            addCriterion("directionId not in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidBetween(Integer value1, Integer value2) {
            addCriterion("directionId between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("directionId not between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNull() {
            addCriterion("classifyId is null");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNotNull() {
            addCriterion("classifyId is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyidEqualTo(Integer value) {
            addCriterion("classifyId =", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotEqualTo(Integer value) {
            addCriterion("classifyId <>", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThan(Integer value) {
            addCriterion("classifyId >", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classifyId >=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThan(Integer value) {
            addCriterion("classifyId <", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThanOrEqualTo(Integer value) {
            addCriterion("classifyId <=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidIn(List<Integer> values) {
            addCriterion("classifyId in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotIn(List<Integer> values) {
            addCriterion("classifyId not in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidBetween(Integer value1, Integer value2) {
            addCriterion("classifyId between", value1, value2, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("classifyId not between", value1, value2, "classifyid");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeIsNull() {
            addCriterion("raleaseTime is null");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeIsNotNull() {
            addCriterion("raleaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeEqualTo(Date value) {
            addCriterion("raleaseTime =", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeNotEqualTo(Date value) {
            addCriterion("raleaseTime <>", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeGreaterThan(Date value) {
            addCriterion("raleaseTime >", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raleaseTime >=", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeLessThan(Date value) {
            addCriterion("raleaseTime <", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("raleaseTime <=", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeIn(List<Date> values) {
            addCriterion("raleaseTime in", values, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeNotIn(List<Date> values) {
            addCriterion("raleaseTime not in", values, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeBetween(Date value1, Date value2) {
            addCriterion("raleaseTime between", value1, value2, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("raleaseTime not between", value1, value2, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNull() {
            addCriterion("viewCount is null");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNotNull() {
            addCriterion("viewCount is not null");
            return (Criteria) this;
        }

        public Criteria andViewcountEqualTo(Integer value) {
            addCriterion("viewCount =", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotEqualTo(Integer value) {
            addCriterion("viewCount <>", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThan(Integer value) {
            addCriterion("viewCount >", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewCount >=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThan(Integer value) {
            addCriterion("viewCount <", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("viewCount <=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountIn(List<Integer> values) {
            addCriterion("viewCount in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotIn(List<Integer> values) {
            addCriterion("viewCount not in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountBetween(Integer value1, Integer value2) {
            addCriterion("viewCount between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewCount not between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andCoursecoverIsNull() {
            addCriterion("courseCover is null");
            return (Criteria) this;
        }

        public Criteria andCoursecoverIsNotNull() {
            addCriterion("courseCover is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecoverEqualTo(String value) {
            addCriterion("courseCover =", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverNotEqualTo(String value) {
            addCriterion("courseCover <>", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverGreaterThan(String value) {
            addCriterion("courseCover >", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverGreaterThanOrEqualTo(String value) {
            addCriterion("courseCover >=", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverLessThan(String value) {
            addCriterion("courseCover <", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverLessThanOrEqualTo(String value) {
            addCriterion("courseCover <=", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverLike(String value) {
            addCriterion("courseCover like", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverNotLike(String value) {
            addCriterion("courseCover not like", value, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverIn(List<String> values) {
            addCriterion("courseCover in", values, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverNotIn(List<String> values) {
            addCriterion("courseCover not in", values, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverBetween(String value1, String value2) {
            addCriterion("courseCover between", value1, value2, "coursecover");
            return (Criteria) this;
        }

        public Criteria andCoursecoverNotBetween(String value1, String value2) {
            addCriterion("courseCover not between", value1, value2, "coursecover");
            return (Criteria) this;
        }

        public Criteria andValiddayIsNull() {
            addCriterion("validDay is null");
            return (Criteria) this;
        }

        public Criteria andValiddayIsNotNull() {
            addCriterion("validDay is not null");
            return (Criteria) this;
        }

        public Criteria andValiddayEqualTo(String value) {
            addCriterion("validDay =", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotEqualTo(String value) {
            addCriterion("validDay <>", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayGreaterThan(String value) {
            addCriterion("validDay >", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayGreaterThanOrEqualTo(String value) {
            addCriterion("validDay >=", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayLessThan(String value) {
            addCriterion("validDay <", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayLessThanOrEqualTo(String value) {
            addCriterion("validDay <=", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayLike(String value) {
            addCriterion("validDay like", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotLike(String value) {
            addCriterion("validDay not like", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayIn(List<String> values) {
            addCriterion("validDay in", values, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotIn(List<String> values) {
            addCriterion("validDay not in", values, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayBetween(String value1, String value2) {
            addCriterion("validDay between", value1, value2, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotBetween(String value1, String value2) {
            addCriterion("validDay not between", value1, value2, "validday");
            return (Criteria) this;
        }

        public Criteria andLectureridIsNull() {
            addCriterion("lecturerId is null");
            return (Criteria) this;
        }

        public Criteria andLectureridIsNotNull() {
            addCriterion("lecturerId is not null");
            return (Criteria) this;
        }

        public Criteria andLectureridEqualTo(Integer value) {
            addCriterion("lecturerId =", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridNotEqualTo(Integer value) {
            addCriterion("lecturerId <>", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridGreaterThan(Integer value) {
            addCriterion("lecturerId >", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridGreaterThanOrEqualTo(Integer value) {
            addCriterion("lecturerId >=", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridLessThan(Integer value) {
            addCriterion("lecturerId <", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridLessThanOrEqualTo(Integer value) {
            addCriterion("lecturerId <=", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridIn(List<Integer> values) {
            addCriterion("lecturerId in", values, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridNotIn(List<Integer> values) {
            addCriterion("lecturerId not in", values, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridBetween(Integer value1, Integer value2) {
            addCriterion("lecturerId between", value1, value2, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridNotBetween(Integer value1, Integer value2) {
            addCriterion("lecturerId not between", value1, value2, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(String value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(String value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(String value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(String value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(String value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(String value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLike(String value) {
            addCriterion("free like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotLike(String value) {
            addCriterion("free not like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<String> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<String> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(String value1, String value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(String value1, String value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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