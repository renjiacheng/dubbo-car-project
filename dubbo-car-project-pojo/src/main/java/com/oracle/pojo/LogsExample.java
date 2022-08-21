package com.oracle.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogsExample() {
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

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andLogmethodIsNull() {
            addCriterion("logMethod is null");
            return (Criteria) this;
        }

        public Criteria andLogmethodIsNotNull() {
            addCriterion("logMethod is not null");
            return (Criteria) this;
        }

        public Criteria andLogmethodEqualTo(String value) {
            addCriterion("logMethod =", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodNotEqualTo(String value) {
            addCriterion("logMethod <>", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodGreaterThan(String value) {
            addCriterion("logMethod >", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodGreaterThanOrEqualTo(String value) {
            addCriterion("logMethod >=", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodLessThan(String value) {
            addCriterion("logMethod <", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodLessThanOrEqualTo(String value) {
            addCriterion("logMethod <=", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodLike(String value) {
            addCriterion("logMethod like", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodNotLike(String value) {
            addCriterion("logMethod not like", value, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodIn(List<String> values) {
            addCriterion("logMethod in", values, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodNotIn(List<String> values) {
            addCriterion("logMethod not in", values, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodBetween(String value1, String value2) {
            addCriterion("logMethod between", value1, value2, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogmethodNotBetween(String value1, String value2) {
            addCriterion("logMethod not between", value1, value2, "logmethod");
            return (Criteria) this;
        }

        public Criteria andLogargsIsNull() {
            addCriterion("logargs is null");
            return (Criteria) this;
        }

        public Criteria andLogargsIsNotNull() {
            addCriterion("logargs is not null");
            return (Criteria) this;
        }

        public Criteria andLogargsEqualTo(String value) {
            addCriterion("logargs =", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsNotEqualTo(String value) {
            addCriterion("logargs <>", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsGreaterThan(String value) {
            addCriterion("logargs >", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsGreaterThanOrEqualTo(String value) {
            addCriterion("logargs >=", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsLessThan(String value) {
            addCriterion("logargs <", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsLessThanOrEqualTo(String value) {
            addCriterion("logargs <=", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsLike(String value) {
            addCriterion("logargs like", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsNotLike(String value) {
            addCriterion("logargs not like", value, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsIn(List<String> values) {
            addCriterion("logargs in", values, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsNotIn(List<String> values) {
            addCriterion("logargs not in", values, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsBetween(String value1, String value2) {
            addCriterion("logargs between", value1, value2, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogargsNotBetween(String value1, String value2) {
            addCriterion("logargs not between", value1, value2, "logargs");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNull() {
            addCriterion("logType is null");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNotNull() {
            addCriterion("logType is not null");
            return (Criteria) this;
        }

        public Criteria andLogtypeEqualTo(String value) {
            addCriterion("logType =", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotEqualTo(String value) {
            addCriterion("logType <>", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThan(String value) {
            addCriterion("logType >", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("logType >=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThan(String value) {
            addCriterion("logType <", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThanOrEqualTo(String value) {
            addCriterion("logType <=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLike(String value) {
            addCriterion("logType like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotLike(String value) {
            addCriterion("logType not like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeIn(List<String> values) {
            addCriterion("logType in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotIn(List<String> values) {
            addCriterion("logType not in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeBetween(String value1, String value2) {
            addCriterion("logType between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotBetween(String value1, String value2) {
            addCriterion("logType not between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogipIsNull() {
            addCriterion("logip is null");
            return (Criteria) this;
        }

        public Criteria andLogipIsNotNull() {
            addCriterion("logip is not null");
            return (Criteria) this;
        }

        public Criteria andLogipEqualTo(String value) {
            addCriterion("logip =", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipNotEqualTo(String value) {
            addCriterion("logip <>", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipGreaterThan(String value) {
            addCriterion("logip >", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipGreaterThanOrEqualTo(String value) {
            addCriterion("logip >=", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipLessThan(String value) {
            addCriterion("logip <", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipLessThanOrEqualTo(String value) {
            addCriterion("logip <=", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipLike(String value) {
            addCriterion("logip like", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipNotLike(String value) {
            addCriterion("logip not like", value, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipIn(List<String> values) {
            addCriterion("logip in", values, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipNotIn(List<String> values) {
            addCriterion("logip not in", values, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipBetween(String value1, String value2) {
            addCriterion("logip between", value1, value2, "logip");
            return (Criteria) this;
        }

        public Criteria andLogipNotBetween(String value1, String value2) {
            addCriterion("logip not between", value1, value2, "logip");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNull() {
            addCriterion("runtime is null");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNotNull() {
            addCriterion("runtime is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimeEqualTo(Float value) {
            addCriterion("runtime =", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotEqualTo(Float value) {
            addCriterion("runtime <>", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThan(Float value) {
            addCriterion("runtime >", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThanOrEqualTo(Float value) {
            addCriterion("runtime >=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThan(Float value) {
            addCriterion("runtime <", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThanOrEqualTo(Float value) {
            addCriterion("runtime <=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIn(List<Float> values) {
            addCriterion("runtime in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotIn(List<Float> values) {
            addCriterion("runtime not in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeBetween(Float value1, Float value2) {
            addCriterion("runtime between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotBetween(Float value1, Float value2) {
            addCriterion("runtime not between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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