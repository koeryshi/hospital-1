package com.ujiuye.fayao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SendmedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendmedicineExample() {
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

        public Criteria andSendmedidIsNull() {
            addCriterion("sendMedId is null");
            return (Criteria) this;
        }

        public Criteria andSendmedidIsNotNull() {
            addCriterion("sendMedId is not null");
            return (Criteria) this;
        }

        public Criteria andSendmedidEqualTo(Integer value) {
            addCriterion("sendMedId =", value, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidNotEqualTo(Integer value) {
            addCriterion("sendMedId <>", value, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidGreaterThan(Integer value) {
            addCriterion("sendMedId >", value, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendMedId >=", value, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidLessThan(Integer value) {
            addCriterion("sendMedId <", value, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidLessThanOrEqualTo(Integer value) {
            addCriterion("sendMedId <=", value, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidIn(List<Integer> values) {
            addCriterion("sendMedId in", values, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidNotIn(List<Integer> values) {
            addCriterion("sendMedId not in", values, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidBetween(Integer value1, Integer value2) {
            addCriterion("sendMedId between", value1, value2, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andSendmedidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendMedId not between", value1, value2, "sendmedid");
            return (Criteria) this;
        }

        public Criteria andHehpidIsNull() {
            addCriterion("heHpId is null");
            return (Criteria) this;
        }

        public Criteria andHehpidIsNotNull() {
            addCriterion("heHpId is not null");
            return (Criteria) this;
        }

        public Criteria andHehpidEqualTo(String value) {
            addCriterion("heHpId =", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidNotEqualTo(String value) {
            addCriterion("heHpId <>", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidGreaterThan(String value) {
            addCriterion("heHpId >", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidGreaterThanOrEqualTo(String value) {
            addCriterion("heHpId >=", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidLessThan(String value) {
            addCriterion("heHpId <", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidLessThanOrEqualTo(String value) {
            addCriterion("heHpId <=", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidLike(String value) {
            addCriterion("heHpId like", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidNotLike(String value) {
            addCriterion("heHpId not like", value, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidIn(List<String> values) {
            addCriterion("heHpId in", values, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidNotIn(List<String> values) {
            addCriterion("heHpId not in", values, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidBetween(String value1, String value2) {
            addCriterion("heHpId between", value1, value2, "hehpid");
            return (Criteria) this;
        }

        public Criteria andHehpidNotBetween(String value1, String value2) {
            addCriterion("heHpId not between", value1, value2, "hehpid");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumIsNull() {
            addCriterion("smDrugNum is null");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumIsNotNull() {
            addCriterion("smDrugNum is not null");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumEqualTo(Integer value) {
            addCriterion("smDrugNum =", value, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumNotEqualTo(Integer value) {
            addCriterion("smDrugNum <>", value, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumGreaterThan(Integer value) {
            addCriterion("smDrugNum >", value, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("smDrugNum >=", value, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumLessThan(Integer value) {
            addCriterion("smDrugNum <", value, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumLessThanOrEqualTo(Integer value) {
            addCriterion("smDrugNum <=", value, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumIn(List<Integer> values) {
            addCriterion("smDrugNum in", values, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumNotIn(List<Integer> values) {
            addCriterion("smDrugNum not in", values, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumBetween(Integer value1, Integer value2) {
            addCriterion("smDrugNum between", value1, value2, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmdrugnumNotBetween(Integer value1, Integer value2) {
            addCriterion("smDrugNum not between", value1, value2, "smdrugnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumIsNull() {
            addCriterion("smSendNum is null");
            return (Criteria) this;
        }

        public Criteria andSmsendnumIsNotNull() {
            addCriterion("smSendNum is not null");
            return (Criteria) this;
        }

        public Criteria andSmsendnumEqualTo(Integer value) {
            addCriterion("smSendNum =", value, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumNotEqualTo(Integer value) {
            addCriterion("smSendNum <>", value, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumGreaterThan(Integer value) {
            addCriterion("smSendNum >", value, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("smSendNum >=", value, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumLessThan(Integer value) {
            addCriterion("smSendNum <", value, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumLessThanOrEqualTo(Integer value) {
            addCriterion("smSendNum <=", value, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumIn(List<Integer> values) {
            addCriterion("smSendNum in", values, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumNotIn(List<Integer> values) {
            addCriterion("smSendNum not in", values, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumBetween(Integer value1, Integer value2) {
            addCriterion("smSendNum between", value1, value2, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmsendnumNotBetween(Integer value1, Integer value2) {
            addCriterion("smSendNum not between", value1, value2, "smsendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumIsNull() {
            addCriterion("smNoSendNum is null");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumIsNotNull() {
            addCriterion("smNoSendNum is not null");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumEqualTo(Integer value) {
            addCriterion("smNoSendNum =", value, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumNotEqualTo(Integer value) {
            addCriterion("smNoSendNum <>", value, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumGreaterThan(Integer value) {
            addCriterion("smNoSendNum >", value, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("smNoSendNum >=", value, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumLessThan(Integer value) {
            addCriterion("smNoSendNum <", value, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumLessThanOrEqualTo(Integer value) {
            addCriterion("smNoSendNum <=", value, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumIn(List<Integer> values) {
            addCriterion("smNoSendNum in", values, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumNotIn(List<Integer> values) {
            addCriterion("smNoSendNum not in", values, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumBetween(Integer value1, Integer value2) {
            addCriterion("smNoSendNum between", value1, value2, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmnosendnumNotBetween(Integer value1, Integer value2) {
            addCriterion("smNoSendNum not between", value1, value2, "smnosendnum");
            return (Criteria) this;
        }

        public Criteria andSmsenddateIsNull() {
            addCriterion("smSendDate is null");
            return (Criteria) this;
        }

        public Criteria andSmsenddateIsNotNull() {
            addCriterion("smSendDate is not null");
            return (Criteria) this;
        }

        public Criteria andSmsenddateEqualTo(Date value) {
            addCriterionForJDBCDate("smSendDate =", value, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("smSendDate <>", value, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("smSendDate >", value, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smSendDate >=", value, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateLessThan(Date value) {
            addCriterionForJDBCDate("smSendDate <", value, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smSendDate <=", value, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateIn(List<Date> values) {
            addCriterionForJDBCDate("smSendDate in", values, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("smSendDate not in", values, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smSendDate between", value1, value2, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmsenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smSendDate not between", value1, value2, "smsenddate");
            return (Criteria) this;
        }

        public Criteria andSmdelIsNull() {
            addCriterion("smDel is null");
            return (Criteria) this;
        }

        public Criteria andSmdelIsNotNull() {
            addCriterion("smDel is not null");
            return (Criteria) this;
        }

        public Criteria andSmdelEqualTo(Integer value) {
            addCriterion("smDel =", value, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelNotEqualTo(Integer value) {
            addCriterion("smDel <>", value, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelGreaterThan(Integer value) {
            addCriterion("smDel >", value, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("smDel >=", value, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelLessThan(Integer value) {
            addCriterion("smDel <", value, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelLessThanOrEqualTo(Integer value) {
            addCriterion("smDel <=", value, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelIn(List<Integer> values) {
            addCriterion("smDel in", values, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelNotIn(List<Integer> values) {
            addCriterion("smDel not in", values, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelBetween(Integer value1, Integer value2) {
            addCriterion("smDel between", value1, value2, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmdelNotBetween(Integer value1, Integer value2) {
            addCriterion("smDel not between", value1, value2, "smdel");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdIsNull() {
            addCriterion("sm_drug_id is null");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdIsNotNull() {
            addCriterion("sm_drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdEqualTo(Integer value) {
            addCriterion("sm_drug_id =", value, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdNotEqualTo(Integer value) {
            addCriterion("sm_drug_id <>", value, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdGreaterThan(Integer value) {
            addCriterion("sm_drug_id >", value, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_drug_id >=", value, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdLessThan(Integer value) {
            addCriterion("sm_drug_id <", value, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_drug_id <=", value, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdIn(List<Integer> values) {
            addCriterion("sm_drug_id in", values, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdNotIn(List<Integer> values) {
            addCriterion("sm_drug_id not in", values, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_drug_id between", value1, value2, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmDrugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_drug_id not between", value1, value2, "smDrugId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdIsNull() {
            addCriterion("sm_tc_id is null");
            return (Criteria) this;
        }

        public Criteria andSmTcIdIsNotNull() {
            addCriterion("sm_tc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmTcIdEqualTo(Integer value) {
            addCriterion("sm_tc_id =", value, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdNotEqualTo(Integer value) {
            addCriterion("sm_tc_id <>", value, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdGreaterThan(Integer value) {
            addCriterion("sm_tc_id >", value, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_tc_id >=", value, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdLessThan(Integer value) {
            addCriterion("sm_tc_id <", value, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_tc_id <=", value, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdIn(List<Integer> values) {
            addCriterion("sm_tc_id in", values, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdNotIn(List<Integer> values) {
            addCriterion("sm_tc_id not in", values, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_tc_id between", value1, value2, "smTcId");
            return (Criteria) this;
        }

        public Criteria andSmTcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_tc_id not between", value1, value2, "smTcId");
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