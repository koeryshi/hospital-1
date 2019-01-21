package com.ujiuye.guahao.bean;

import java.util.ArrayList;
import java.util.List;

public class EducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationExample() {
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

        public Criteria andEduidIsNull() {
            addCriterion("eduId is null");
            return (Criteria) this;
        }

        public Criteria andEduidIsNotNull() {
            addCriterion("eduId is not null");
            return (Criteria) this;
        }

        public Criteria andEduidEqualTo(Integer value) {
            addCriterion("eduId =", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotEqualTo(Integer value) {
            addCriterion("eduId <>", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidGreaterThan(Integer value) {
            addCriterion("eduId >", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eduId >=", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidLessThan(Integer value) {
            addCriterion("eduId <", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidLessThanOrEqualTo(Integer value) {
            addCriterion("eduId <=", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidIn(List<Integer> values) {
            addCriterion("eduId in", values, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotIn(List<Integer> values) {
            addCriterion("eduId not in", values, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidBetween(Integer value1, Integer value2) {
            addCriterion("eduId between", value1, value2, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotBetween(Integer value1, Integer value2) {
            addCriterion("eduId not between", value1, value2, "eduid");
            return (Criteria) this;
        }

        public Criteria andEdunameIsNull() {
            addCriterion("eduName is null");
            return (Criteria) this;
        }

        public Criteria andEdunameIsNotNull() {
            addCriterion("eduName is not null");
            return (Criteria) this;
        }

        public Criteria andEdunameEqualTo(String value) {
            addCriterion("eduName =", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotEqualTo(String value) {
            addCriterion("eduName <>", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameGreaterThan(String value) {
            addCriterion("eduName >", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameGreaterThanOrEqualTo(String value) {
            addCriterion("eduName >=", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLessThan(String value) {
            addCriterion("eduName <", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLessThanOrEqualTo(String value) {
            addCriterion("eduName <=", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLike(String value) {
            addCriterion("eduName like", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotLike(String value) {
            addCriterion("eduName not like", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameIn(List<String> values) {
            addCriterion("eduName in", values, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotIn(List<String> values) {
            addCriterion("eduName not in", values, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameBetween(String value1, String value2) {
            addCriterion("eduName between", value1, value2, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotBetween(String value1, String value2) {
            addCriterion("eduName not between", value1, value2, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdudelIsNull() {
            addCriterion("eduDel is null");
            return (Criteria) this;
        }

        public Criteria andEdudelIsNotNull() {
            addCriterion("eduDel is not null");
            return (Criteria) this;
        }

        public Criteria andEdudelEqualTo(Integer value) {
            addCriterion("eduDel =", value, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelNotEqualTo(Integer value) {
            addCriterion("eduDel <>", value, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelGreaterThan(Integer value) {
            addCriterion("eduDel >", value, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelGreaterThanOrEqualTo(Integer value) {
            addCriterion("eduDel >=", value, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelLessThan(Integer value) {
            addCriterion("eduDel <", value, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelLessThanOrEqualTo(Integer value) {
            addCriterion("eduDel <=", value, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelIn(List<Integer> values) {
            addCriterion("eduDel in", values, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelNotIn(List<Integer> values) {
            addCriterion("eduDel not in", values, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelBetween(Integer value1, Integer value2) {
            addCriterion("eduDel between", value1, value2, "edudel");
            return (Criteria) this;
        }

        public Criteria andEdudelNotBetween(Integer value1, Integer value2) {
            addCriterion("eduDel not between", value1, value2, "edudel");
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