package com.ujiuye.zhuyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class TotalchargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalchargeExample() {
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

        public Criteria andTcidIsNull() {
            addCriterion("tcId is null");
            return (Criteria) this;
        }

        public Criteria andTcidIsNotNull() {
            addCriterion("tcId is not null");
            return (Criteria) this;
        }

        public Criteria andTcidEqualTo(Integer value) {
            addCriterion("tcId =", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotEqualTo(Integer value) {
            addCriterion("tcId <>", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThan(Integer value) {
            addCriterion("tcId >", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcId >=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThan(Integer value) {
            addCriterion("tcId <", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThanOrEqualTo(Integer value) {
            addCriterion("tcId <=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidIn(List<Integer> values) {
            addCriterion("tcId in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotIn(List<Integer> values) {
            addCriterion("tcId not in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidBetween(Integer value1, Integer value2) {
            addCriterion("tcId between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotBetween(Integer value1, Integer value2) {
            addCriterion("tcId not between", value1, value2, "tcid");
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

        public Criteria andTcmoneyIsNull() {
            addCriterion("tcMoney is null");
            return (Criteria) this;
        }

        public Criteria andTcmoneyIsNotNull() {
            addCriterion("tcMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTcmoneyEqualTo(Double value) {
            addCriterion("tcMoney =", value, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyNotEqualTo(Double value) {
            addCriterion("tcMoney <>", value, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyGreaterThan(Double value) {
            addCriterion("tcMoney >", value, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tcMoney >=", value, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyLessThan(Double value) {
            addCriterion("tcMoney <", value, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyLessThanOrEqualTo(Double value) {
            addCriterion("tcMoney <=", value, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyIn(List<Double> values) {
            addCriterion("tcMoney in", values, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyNotIn(List<Double> values) {
            addCriterion("tcMoney not in", values, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyBetween(Double value1, Double value2) {
            addCriterion("tcMoney between", value1, value2, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcmoneyNotBetween(Double value1, Double value2) {
            addCriterion("tcMoney not between", value1, value2, "tcmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyIsNull() {
            addCriterion("tcdrugMoney is null");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyIsNotNull() {
            addCriterion("tcdrugMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyEqualTo(Double value) {
            addCriterion("tcdrugMoney =", value, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyNotEqualTo(Double value) {
            addCriterion("tcdrugMoney <>", value, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyGreaterThan(Double value) {
            addCriterion("tcdrugMoney >", value, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tcdrugMoney >=", value, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyLessThan(Double value) {
            addCriterion("tcdrugMoney <", value, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyLessThanOrEqualTo(Double value) {
            addCriterion("tcdrugMoney <=", value, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyIn(List<Double> values) {
            addCriterion("tcdrugMoney in", values, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyNotIn(List<Double> values) {
            addCriterion("tcdrugMoney not in", values, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyBetween(Double value1, Double value2) {
            addCriterion("tcdrugMoney between", value1, value2, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTcdrugmoneyNotBetween(Double value1, Double value2) {
            addCriterion("tcdrugMoney not between", value1, value2, "tcdrugmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyIsNull() {
            addCriterion("tcCheckMoney is null");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyIsNotNull() {
            addCriterion("tcCheckMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyEqualTo(Double value) {
            addCriterion("tcCheckMoney =", value, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyNotEqualTo(Double value) {
            addCriterion("tcCheckMoney <>", value, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyGreaterThan(Double value) {
            addCriterion("tcCheckMoney >", value, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tcCheckMoney >=", value, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyLessThan(Double value) {
            addCriterion("tcCheckMoney <", value, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyLessThanOrEqualTo(Double value) {
            addCriterion("tcCheckMoney <=", value, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyIn(List<Double> values) {
            addCriterion("tcCheckMoney in", values, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyNotIn(List<Double> values) {
            addCriterion("tcCheckMoney not in", values, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyBetween(Double value1, Double value2) {
            addCriterion("tcCheckMoney between", value1, value2, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTccheckmoneyNotBetween(Double value1, Double value2) {
            addCriterion("tcCheckMoney not between", value1, value2, "tccheckmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyIsNull() {
            addCriterion("tcLastMoney is null");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyIsNotNull() {
            addCriterion("tcLastMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyEqualTo(Double value) {
            addCriterion("tcLastMoney =", value, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyNotEqualTo(Double value) {
            addCriterion("tcLastMoney <>", value, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyGreaterThan(Double value) {
            addCriterion("tcLastMoney >", value, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tcLastMoney >=", value, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyLessThan(Double value) {
            addCriterion("tcLastMoney <", value, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyLessThanOrEqualTo(Double value) {
            addCriterion("tcLastMoney <=", value, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyIn(List<Double> values) {
            addCriterion("tcLastMoney in", values, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyNotIn(List<Double> values) {
            addCriterion("tcLastMoney not in", values, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyBetween(Double value1, Double value2) {
            addCriterion("tcLastMoney between", value1, value2, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTclastmoneyNotBetween(Double value1, Double value2) {
            addCriterion("tcLastMoney not between", value1, value2, "tclastmoney");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateIsNull() {
            addCriterion("tcBalanceState is null");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateIsNotNull() {
            addCriterion("tcBalanceState is not null");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateEqualTo(Integer value) {
            addCriterion("tcBalanceState =", value, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateNotEqualTo(Integer value) {
            addCriterion("tcBalanceState <>", value, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateGreaterThan(Integer value) {
            addCriterion("tcBalanceState >", value, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcBalanceState >=", value, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateLessThan(Integer value) {
            addCriterion("tcBalanceState <", value, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateLessThanOrEqualTo(Integer value) {
            addCriterion("tcBalanceState <=", value, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateIn(List<Integer> values) {
            addCriterion("tcBalanceState in", values, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateNotIn(List<Integer> values) {
            addCriterion("tcBalanceState not in", values, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateBetween(Integer value1, Integer value2) {
            addCriterion("tcBalanceState between", value1, value2, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcbalancestateNotBetween(Integer value1, Integer value2) {
            addCriterion("tcBalanceState not between", value1, value2, "tcbalancestate");
            return (Criteria) this;
        }

        public Criteria andTcdelIsNull() {
            addCriterion("tcDel is null");
            return (Criteria) this;
        }

        public Criteria andTcdelIsNotNull() {
            addCriterion("tcDel is not null");
            return (Criteria) this;
        }

        public Criteria andTcdelEqualTo(Integer value) {
            addCriterion("tcDel =", value, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelNotEqualTo(Integer value) {
            addCriterion("tcDel <>", value, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelGreaterThan(Integer value) {
            addCriterion("tcDel >", value, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcDel >=", value, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelLessThan(Integer value) {
            addCriterion("tcDel <", value, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelLessThanOrEqualTo(Integer value) {
            addCriterion("tcDel <=", value, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelIn(List<Integer> values) {
            addCriterion("tcDel in", values, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelNotIn(List<Integer> values) {
            addCriterion("tcDel not in", values, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelBetween(Integer value1, Integer value2) {
            addCriterion("tcDel between", value1, value2, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcdelNotBetween(Integer value1, Integer value2) {
            addCriterion("tcDel not between", value1, value2, "tcdel");
            return (Criteria) this;
        }

        public Criteria andTcStateIdIsNull() {
            addCriterion("tc_state_id is null");
            return (Criteria) this;
        }

        public Criteria andTcStateIdIsNotNull() {
            addCriterion("tc_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcStateIdEqualTo(Integer value) {
            addCriterion("tc_state_id =", value, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdNotEqualTo(Integer value) {
            addCriterion("tc_state_id <>", value, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdGreaterThan(Integer value) {
            addCriterion("tc_state_id >", value, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_state_id >=", value, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdLessThan(Integer value) {
            addCriterion("tc_state_id <", value, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("tc_state_id <=", value, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdIn(List<Integer> values) {
            addCriterion("tc_state_id in", values, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdNotIn(List<Integer> values) {
            addCriterion("tc_state_id not in", values, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdBetween(Integer value1, Integer value2) {
            addCriterion("tc_state_id between", value1, value2, "tcStateId");
            return (Criteria) this;
        }

        public Criteria andTcStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_state_id not between", value1, value2, "tcStateId");
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