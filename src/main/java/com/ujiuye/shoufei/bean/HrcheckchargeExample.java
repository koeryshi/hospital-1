package com.ujiuye.shoufei.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HrcheckchargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrcheckchargeExample() {
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

        public Criteria andCuidIsNull() {
            addCriterion("cuId is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuId is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(Integer value) {
            addCriterion("cuId =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(Integer value) {
            addCriterion("cuId <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(Integer value) {
            addCriterion("cuId >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuId >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(Integer value) {
            addCriterion("cuId <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(Integer value) {
            addCriterion("cuId <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<Integer> values) {
            addCriterion("cuId in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<Integer> values) {
            addCriterion("cuId not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(Integer value1, Integer value2) {
            addCriterion("cuId between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(Integer value1, Integer value2) {
            addCriterion("cuId not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andBehpidIsNull() {
            addCriterion("beHpId is null");
            return (Criteria) this;
        }

        public Criteria andBehpidIsNotNull() {
            addCriterion("beHpId is not null");
            return (Criteria) this;
        }

        public Criteria andBehpidEqualTo(String value) {
            addCriterion("beHpId =", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidNotEqualTo(String value) {
            addCriterion("beHpId <>", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidGreaterThan(String value) {
            addCriterion("beHpId >", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidGreaterThanOrEqualTo(String value) {
            addCriterion("beHpId >=", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidLessThan(String value) {
            addCriterion("beHpId <", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidLessThanOrEqualTo(String value) {
            addCriterion("beHpId <=", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidLike(String value) {
            addCriterion("beHpId like", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidNotLike(String value) {
            addCriterion("beHpId not like", value, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidIn(List<String> values) {
            addCriterion("beHpId in", values, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidNotIn(List<String> values) {
            addCriterion("beHpId not in", values, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidBetween(String value1, String value2) {
            addCriterion("beHpId between", value1, value2, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpidNotBetween(String value1, String value2) {
            addCriterion("beHpId not between", value1, value2, "behpid");
            return (Criteria) this;
        }

        public Criteria andBehpnameIsNull() {
            addCriterion("beHpName is null");
            return (Criteria) this;
        }

        public Criteria andBehpnameIsNotNull() {
            addCriterion("beHpName is not null");
            return (Criteria) this;
        }

        public Criteria andBehpnameEqualTo(String value) {
            addCriterion("beHpName =", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameNotEqualTo(String value) {
            addCriterion("beHpName <>", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameGreaterThan(String value) {
            addCriterion("beHpName >", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameGreaterThanOrEqualTo(String value) {
            addCriterion("beHpName >=", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameLessThan(String value) {
            addCriterion("beHpName <", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameLessThanOrEqualTo(String value) {
            addCriterion("beHpName <=", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameLike(String value) {
            addCriterion("beHpName like", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameNotLike(String value) {
            addCriterion("beHpName not like", value, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameIn(List<String> values) {
            addCriterion("beHpName in", values, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameNotIn(List<String> values) {
            addCriterion("beHpName not in", values, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameBetween(String value1, String value2) {
            addCriterion("beHpName between", value1, value2, "behpname");
            return (Criteria) this;
        }

        public Criteria andBehpnameNotBetween(String value1, String value2) {
            addCriterion("beHpName not between", value1, value2, "behpname");
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

        public Criteria andHccdelIsNull() {
            addCriterion("hccDel is null");
            return (Criteria) this;
        }

        public Criteria andHccdelIsNotNull() {
            addCriterion("hccDel is not null");
            return (Criteria) this;
        }

        public Criteria andHccdelEqualTo(Integer value) {
            addCriterion("hccDel =", value, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelNotEqualTo(Integer value) {
            addCriterion("hccDel <>", value, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelGreaterThan(Integer value) {
            addCriterion("hccDel >", value, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hccDel >=", value, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelLessThan(Integer value) {
            addCriterion("hccDel <", value, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelLessThanOrEqualTo(Integer value) {
            addCriterion("hccDel <=", value, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelIn(List<Integer> values) {
            addCriterion("hccDel in", values, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelNotIn(List<Integer> values) {
            addCriterion("hccDel not in", values, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelBetween(Integer value1, Integer value2) {
            addCriterion("hccDel between", value1, value2, "hccdel");
            return (Criteria) this;
        }

        public Criteria andHccdelNotBetween(Integer value1, Integer value2) {
            addCriterion("hccDel not between", value1, value2, "hccdel");
            return (Criteria) this;
        }

        public Criteria andCmstateIsNull() {
            addCriterion("cmState is null");
            return (Criteria) this;
        }

        public Criteria andCmstateIsNotNull() {
            addCriterion("cmState is not null");
            return (Criteria) this;
        }

        public Criteria andCmstateEqualTo(Integer value) {
            addCriterion("cmState =", value, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateNotEqualTo(Integer value) {
            addCriterion("cmState <>", value, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateGreaterThan(Integer value) {
            addCriterion("cmState >", value, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmState >=", value, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateLessThan(Integer value) {
            addCriterion("cmState <", value, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateLessThanOrEqualTo(Integer value) {
            addCriterion("cmState <=", value, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateIn(List<Integer> values) {
            addCriterion("cmState in", values, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateNotIn(List<Integer> values) {
            addCriterion("cmState not in", values, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateBetween(Integer value1, Integer value2) {
            addCriterion("cmState between", value1, value2, "cmstate");
            return (Criteria) this;
        }

        public Criteria andCmstateNotBetween(Integer value1, Integer value2) {
            addCriterion("cmState not between", value1, value2, "cmstate");
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