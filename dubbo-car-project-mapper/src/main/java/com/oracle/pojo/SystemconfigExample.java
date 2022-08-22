package com.oracle.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemconfigExample() {
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

        public Criteria andConfignameIsNull() {
            addCriterion("configname is null");
            return (Criteria) this;
        }

        public Criteria andConfignameIsNotNull() {
            addCriterion("configname is not null");
            return (Criteria) this;
        }

        public Criteria andConfignameEqualTo(String value) {
            addCriterion("configname =", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotEqualTo(String value) {
            addCriterion("configname <>", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameGreaterThan(String value) {
            addCriterion("configname >", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameGreaterThanOrEqualTo(String value) {
            addCriterion("configname >=", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameLessThan(String value) {
            addCriterion("configname <", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameLessThanOrEqualTo(String value) {
            addCriterion("configname <=", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameLike(String value) {
            addCriterion("configname like", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotLike(String value) {
            addCriterion("configname not like", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameIn(List<String> values) {
            addCriterion("configname in", values, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotIn(List<String> values) {
            addCriterion("configname not in", values, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameBetween(String value1, String value2) {
            addCriterion("configname between", value1, value2, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotBetween(String value1, String value2) {
            addCriterion("configname not between", value1, value2, "configname");
            return (Criteria) this;
        }

        public Criteria andConfigvalueIsNull() {
            addCriterion("configvalue is null");
            return (Criteria) this;
        }

        public Criteria andConfigvalueIsNotNull() {
            addCriterion("configvalue is not null");
            return (Criteria) this;
        }

        public Criteria andConfigvalueEqualTo(Integer value) {
            addCriterion("configvalue =", value, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueNotEqualTo(Integer value) {
            addCriterion("configvalue <>", value, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueGreaterThan(Integer value) {
            addCriterion("configvalue >", value, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("configvalue >=", value, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueLessThan(Integer value) {
            addCriterion("configvalue <", value, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueLessThanOrEqualTo(Integer value) {
            addCriterion("configvalue <=", value, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueIn(List<Integer> values) {
            addCriterion("configvalue in", values, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueNotIn(List<Integer> values) {
            addCriterion("configvalue not in", values, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueBetween(Integer value1, Integer value2) {
            addCriterion("configvalue between", value1, value2, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("configvalue not between", value1, value2, "configvalue");
            return (Criteria) this;
        }

        public Criteria andConfigdescIsNull() {
            addCriterion("configdesc is null");
            return (Criteria) this;
        }

        public Criteria andConfigdescIsNotNull() {
            addCriterion("configdesc is not null");
            return (Criteria) this;
        }

        public Criteria andConfigdescEqualTo(String value) {
            addCriterion("configdesc =", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescNotEqualTo(String value) {
            addCriterion("configdesc <>", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescGreaterThan(String value) {
            addCriterion("configdesc >", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescGreaterThanOrEqualTo(String value) {
            addCriterion("configdesc >=", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescLessThan(String value) {
            addCriterion("configdesc <", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescLessThanOrEqualTo(String value) {
            addCriterion("configdesc <=", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescLike(String value) {
            addCriterion("configdesc like", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescNotLike(String value) {
            addCriterion("configdesc not like", value, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescIn(List<String> values) {
            addCriterion("configdesc in", values, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescNotIn(List<String> values) {
            addCriterion("configdesc not in", values, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescBetween(String value1, String value2) {
            addCriterion("configdesc between", value1, value2, "configdesc");
            return (Criteria) this;
        }

        public Criteria andConfigdescNotBetween(String value1, String value2) {
            addCriterion("configdesc not between", value1, value2, "configdesc");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifydate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifydate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifydate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifydate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifydate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifydate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifydate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifydate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifydate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifydate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifydate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIsNull() {
            addCriterion("defaultvalue is null");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIsNotNull() {
            addCriterion("defaultvalue is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueEqualTo(String value) {
            addCriterion("defaultvalue =", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotEqualTo(String value) {
            addCriterion("defaultvalue <>", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueGreaterThan(String value) {
            addCriterion("defaultvalue >", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueGreaterThanOrEqualTo(String value) {
            addCriterion("defaultvalue >=", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLessThan(String value) {
            addCriterion("defaultvalue <", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLessThanOrEqualTo(String value) {
            addCriterion("defaultvalue <=", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLike(String value) {
            addCriterion("defaultvalue like", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotLike(String value) {
            addCriterion("defaultvalue not like", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIn(List<String> values) {
            addCriterion("defaultvalue in", values, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotIn(List<String> values) {
            addCriterion("defaultvalue not in", values, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueBetween(String value1, String value2) {
            addCriterion("defaultvalue between", value1, value2, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotBetween(String value1, String value2) {
            addCriterion("defaultvalue not between", value1, value2, "defaultvalue");
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