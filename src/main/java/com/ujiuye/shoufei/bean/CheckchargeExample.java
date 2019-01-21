package com.ujiuye.shoufei.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckchargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckchargeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCcidIsNull() {
            addCriterion("ccId is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccId is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(Integer value) {
            addCriterion("ccId =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(Integer value) {
            addCriterion("ccId <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(Integer value) {
            addCriterion("ccId >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccId >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(Integer value) {
            addCriterion("ccId <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(Integer value) {
            addCriterion("ccId <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<Integer> values) {
            addCriterion("ccId in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<Integer> values) {
            addCriterion("ccId not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(Integer value1, Integer value2) {
            addCriterion("ccId between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ccId not between", value1, value2, "ccid");
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

        public Criteria andCcmoneyIsNull() {
            addCriterion("ccMoney is null");
            return (Criteria) this;
        }

        public Criteria andCcmoneyIsNotNull() {
            addCriterion("ccMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCcmoneyEqualTo(Double value) {
            addCriterion("ccMoney =", value, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyNotEqualTo(Double value) {
            addCriterion("ccMoney <>", value, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyGreaterThan(Double value) {
            addCriterion("ccMoney >", value, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ccMoney >=", value, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyLessThan(Double value) {
            addCriterion("ccMoney <", value, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ccMoney <=", value, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyIn(List<Double> values) {
            addCriterion("ccMoney in", values, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyNotIn(List<Double> values) {
            addCriterion("ccMoney not in", values, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyBetween(Double value1, Double value2) {
            addCriterion("ccMoney between", value1, value2, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCcmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ccMoney not between", value1, value2, "ccmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyIsNull() {
            addCriterion("ccLastMoney is null");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyIsNotNull() {
            addCriterion("ccLastMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyEqualTo(Double value) {
            addCriterion("ccLastMoney =", value, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyNotEqualTo(Double value) {
            addCriterion("ccLastMoney <>", value, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyGreaterThan(Double value) {
            addCriterion("ccLastMoney >", value, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ccLastMoney >=", value, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyLessThan(Double value) {
            addCriterion("ccLastMoney <", value, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ccLastMoney <=", value, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyIn(List<Double> values) {
            addCriterion("ccLastMoney in", values, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyNotIn(List<Double> values) {
            addCriterion("ccLastMoney not in", values, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyBetween(Double value1, Double value2) {
            addCriterion("ccLastMoney between", value1, value2, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCclastmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ccLastMoney not between", value1, value2, "cclastmoney");
            return (Criteria) this;
        }

        public Criteria andCcdelIsNull() {
            addCriterion("ccDel is null");
            return (Criteria) this;
        }

        public Criteria andCcdelIsNotNull() {
            addCriterion("ccDel is not null");
            return (Criteria) this;
        }

        public Criteria andCcdelEqualTo(Integer value) {
            addCriterion("ccDel =", value, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelNotEqualTo(Integer value) {
            addCriterion("ccDel <>", value, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelGreaterThan(Integer value) {
            addCriterion("ccDel >", value, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccDel >=", value, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelLessThan(Integer value) {
            addCriterion("ccDel <", value, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelLessThanOrEqualTo(Integer value) {
            addCriterion("ccDel <=", value, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelIn(List<Integer> values) {
            addCriterion("ccDel in", values, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelNotIn(List<Integer> values) {
            addCriterion("ccDel not in", values, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelBetween(Integer value1, Integer value2) {
            addCriterion("ccDel between", value1, value2, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcdelNotBetween(Integer value1, Integer value2) {
            addCriterion("ccDel not between", value1, value2, "ccdel");
            return (Criteria) this;
        }

        public Criteria andCcCpIdIsNull() {
            addCriterion("cc_cp_id is null");
            return (Criteria) this;
        }

        public Criteria andCcCpIdIsNotNull() {
            addCriterion("cc_cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcCpIdEqualTo(Integer value) {
            addCriterion("cc_cp_id =", value, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdNotEqualTo(Integer value) {
            addCriterion("cc_cp_id <>", value, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdGreaterThan(Integer value) {
            addCriterion("cc_cp_id >", value, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_cp_id >=", value, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdLessThan(Integer value) {
            addCriterion("cc_cp_id <", value, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdLessThanOrEqualTo(Integer value) {
            addCriterion("cc_cp_id <=", value, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdIn(List<Integer> values) {
            addCriterion("cc_cp_id in", values, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdNotIn(List<Integer> values) {
            addCriterion("cc_cp_id not in", values, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdBetween(Integer value1, Integer value2) {
            addCriterion("cc_cp_id between", value1, value2, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcCpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_cp_id not between", value1, value2, "ccCpId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdIsNull() {
            addCriterion("cc_tc_id is null");
            return (Criteria) this;
        }

        public Criteria andCcTcIdIsNotNull() {
            addCriterion("cc_tc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcTcIdEqualTo(Integer value) {
            addCriterion("cc_tc_id =", value, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdNotEqualTo(Integer value) {
            addCriterion("cc_tc_id <>", value, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdGreaterThan(Integer value) {
            addCriterion("cc_tc_id >", value, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_tc_id >=", value, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdLessThan(Integer value) {
            addCriterion("cc_tc_id <", value, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdLessThanOrEqualTo(Integer value) {
            addCriterion("cc_tc_id <=", value, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdIn(List<Integer> values) {
            addCriterion("cc_tc_id in", values, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdNotIn(List<Integer> values) {
            addCriterion("cc_tc_id not in", values, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdBetween(Integer value1, Integer value2) {
            addCriterion("cc_tc_id between", value1, value2, "ccTcId");
            return (Criteria) this;
        }

        public Criteria andCcTcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_tc_id not between", value1, value2, "ccTcId");
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
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
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