package com.ujiuye.guahao.bean;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartidIsNull() {
            addCriterion("departId is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("departId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(Integer value) {
            addCriterion("departId =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(Integer value) {
            addCriterion("departId <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(Integer value) {
            addCriterion("departId >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departId >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(Integer value) {
            addCriterion("departId <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(Integer value) {
            addCriterion("departId <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<Integer> values) {
            addCriterion("departId in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<Integer> values) {
            addCriterion("departId not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(Integer value1, Integer value2) {
            addCriterion("departId between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(Integer value1, Integer value2) {
            addCriterion("departId not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNull() {
            addCriterion("departName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("departName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("departName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("departName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("departName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("departName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("departName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("departName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("departName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("departName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("departName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("departName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("departName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("departName not between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartdelIsNull() {
            addCriterion("departDel is null");
            return (Criteria) this;
        }

        public Criteria andDepartdelIsNotNull() {
            addCriterion("departDel is not null");
            return (Criteria) this;
        }

        public Criteria andDepartdelEqualTo(Integer value) {
            addCriterion("departDel =", value, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelNotEqualTo(Integer value) {
            addCriterion("departDel <>", value, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelGreaterThan(Integer value) {
            addCriterion("departDel >", value, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("departDel >=", value, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelLessThan(Integer value) {
            addCriterion("departDel <", value, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelLessThanOrEqualTo(Integer value) {
            addCriterion("departDel <=", value, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelIn(List<Integer> values) {
            addCriterion("departDel in", values, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelNotIn(List<Integer> values) {
            addCriterion("departDel not in", values, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelBetween(Integer value1, Integer value2) {
            addCriterion("departDel between", value1, value2, "departdel");
            return (Criteria) this;
        }

        public Criteria andDepartdelNotBetween(Integer value1, Integer value2) {
            addCriterion("departDel not between", value1, value2, "departdel");
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