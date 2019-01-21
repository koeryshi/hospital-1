package com.ujiuye.shoufei.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargeprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeprojectExample() {
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

        public Criteria andCmidIsNull() {
            addCriterion("cmId is null");
            return (Criteria) this;
        }

        public Criteria andCmidIsNotNull() {
            addCriterion("cmId is not null");
            return (Criteria) this;
        }

        public Criteria andCmidEqualTo(Integer value) {
            addCriterion("cmId =", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotEqualTo(Integer value) {
            addCriterion("cmId <>", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThan(Integer value) {
            addCriterion("cmId >", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmId >=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThan(Integer value) {
            addCriterion("cmId <", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThanOrEqualTo(Integer value) {
            addCriterion("cmId <=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidIn(List<Integer> values) {
            addCriterion("cmId in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotIn(List<Integer> values) {
            addCriterion("cmId not in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidBetween(Integer value1, Integer value2) {
            addCriterion("cmId between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotBetween(Integer value1, Integer value2) {
            addCriterion("cmId not between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmnameIsNull() {
            addCriterion("cmName is null");
            return (Criteria) this;
        }

        public Criteria andCmnameIsNotNull() {
            addCriterion("cmName is not null");
            return (Criteria) this;
        }

        public Criteria andCmnameEqualTo(String value) {
            addCriterion("cmName =", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameNotEqualTo(String value) {
            addCriterion("cmName <>", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameGreaterThan(String value) {
            addCriterion("cmName >", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameGreaterThanOrEqualTo(String value) {
            addCriterion("cmName >=", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameLessThan(String value) {
            addCriterion("cmName <", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameLessThanOrEqualTo(String value) {
            addCriterion("cmName <=", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameLike(String value) {
            addCriterion("cmName like", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameNotLike(String value) {
            addCriterion("cmName not like", value, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameIn(List<String> values) {
            addCriterion("cmName in", values, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameNotIn(List<String> values) {
            addCriterion("cmName not in", values, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameBetween(String value1, String value2) {
            addCriterion("cmName between", value1, value2, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmnameNotBetween(String value1, String value2) {
            addCriterion("cmName not between", value1, value2, "cmname");
            return (Criteria) this;
        }

        public Criteria andCmmoneyIsNull() {
            addCriterion("cmMoney is null");
            return (Criteria) this;
        }

        public Criteria andCmmoneyIsNotNull() {
            addCriterion("cmMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCmmoneyEqualTo(Double value) {
            addCriterion("cmMoney =", value, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyNotEqualTo(Double value) {
            addCriterion("cmMoney <>", value, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyGreaterThan(Double value) {
            addCriterion("cmMoney >", value, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cmMoney >=", value, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyLessThan(Double value) {
            addCriterion("cmMoney <", value, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyLessThanOrEqualTo(Double value) {
            addCriterion("cmMoney <=", value, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyIn(List<Double> values) {
            addCriterion("cmMoney in", values, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyNotIn(List<Double> values) {
            addCriterion("cmMoney not in", values, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyBetween(Double value1, Double value2) {
            addCriterion("cmMoney between", value1, value2, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmmoneyNotBetween(Double value1, Double value2) {
            addCriterion("cmMoney not between", value1, value2, "cmmoney");
            return (Criteria) this;
        }

        public Criteria andCmdateIsNull() {
            addCriterion("cmDate is null");
            return (Criteria) this;
        }

        public Criteria andCmdateIsNotNull() {
            addCriterion("cmDate is not null");
            return (Criteria) this;
        }

        public Criteria andCmdateEqualTo(Date value) {
            addCriterion("cmDate =", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateNotEqualTo(Date value) {
            addCriterion("cmDate <>", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateGreaterThan(Date value) {
            addCriterion("cmDate >", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cmDate >=", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateLessThan(Date value) {
            addCriterion("cmDate <", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateLessThanOrEqualTo(Date value) {
            addCriterion("cmDate <=", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateIn(List<Date> values) {
            addCriterion("cmDate in", values, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateNotIn(List<Date> values) {
            addCriterion("cmDate not in", values, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateBetween(Date value1, Date value2) {
            addCriterion("cmDate between", value1, value2, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateNotBetween(Date value1, Date value2) {
            addCriterion("cmDate not between", value1, value2, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdelIsNull() {
            addCriterion("cmDel is null");
            return (Criteria) this;
        }

        public Criteria andCmdelIsNotNull() {
            addCriterion("cmDel is not null");
            return (Criteria) this;
        }

        public Criteria andCmdelEqualTo(Integer value) {
            addCriterion("cmDel =", value, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelNotEqualTo(Integer value) {
            addCriterion("cmDel <>", value, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelGreaterThan(Integer value) {
            addCriterion("cmDel >", value, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmDel >=", value, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelLessThan(Integer value) {
            addCriterion("cmDel <", value, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelLessThanOrEqualTo(Integer value) {
            addCriterion("cmDel <=", value, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelIn(List<Integer> values) {
            addCriterion("cmDel in", values, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelNotIn(List<Integer> values) {
            addCriterion("cmDel not in", values, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelBetween(Integer value1, Integer value2) {
            addCriterion("cmDel between", value1, value2, "cmdel");
            return (Criteria) this;
        }

        public Criteria andCmdelNotBetween(Integer value1, Integer value2) {
            addCriterion("cmDel not between", value1, value2, "cmdel");
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