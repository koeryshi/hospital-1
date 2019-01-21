package com.ujiuye.zhuyuan.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BehospitalinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BehospitalinfoExample() {
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

        public Criteria andBhidIsNull() {
            addCriterion("bhId is null");
            return (Criteria) this;
        }

        public Criteria andBhidIsNotNull() {
            addCriterion("bhId is not null");
            return (Criteria) this;
        }

        public Criteria andBhidEqualTo(Integer value) {
            addCriterion("bhId =", value, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidNotEqualTo(Integer value) {
            addCriterion("bhId <>", value, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidGreaterThan(Integer value) {
            addCriterion("bhId >", value, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bhId >=", value, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidLessThan(Integer value) {
            addCriterion("bhId <", value, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidLessThanOrEqualTo(Integer value) {
            addCriterion("bhId <=", value, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidIn(List<Integer> values) {
            addCriterion("bhId in", values, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidNotIn(List<Integer> values) {
            addCriterion("bhId not in", values, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidBetween(Integer value1, Integer value2) {
            addCriterion("bhId between", value1, value2, "bhid");
            return (Criteria) this;
        }

        public Criteria andBhidNotBetween(Integer value1, Integer value2) {
            addCriterion("bhId not between", value1, value2, "bhid");
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

        public Criteria andBehpbedIsNull() {
            addCriterion("beHpBed is null");
            return (Criteria) this;
        }

        public Criteria andBehpbedIsNotNull() {
            addCriterion("beHpBed is not null");
            return (Criteria) this;
        }

        public Criteria andBehpbedEqualTo(String value) {
            addCriterion("beHpBed =", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedNotEqualTo(String value) {
            addCriterion("beHpBed <>", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedGreaterThan(String value) {
            addCriterion("beHpBed >", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedGreaterThanOrEqualTo(String value) {
            addCriterion("beHpBed >=", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedLessThan(String value) {
            addCriterion("beHpBed <", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedLessThanOrEqualTo(String value) {
            addCriterion("beHpBed <=", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedLike(String value) {
            addCriterion("beHpBed like", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedNotLike(String value) {
            addCriterion("beHpBed not like", value, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedIn(List<String> values) {
            addCriterion("beHpBed in", values, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedNotIn(List<String> values) {
            addCriterion("beHpBed not in", values, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedBetween(String value1, String value2) {
            addCriterion("beHpBed between", value1, value2, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpbedNotBetween(String value1, String value2) {
            addCriterion("beHpBed not between", value1, value2, "behpbed");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyIsNull() {
            addCriterion("beHpMoney is null");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyIsNotNull() {
            addCriterion("beHpMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyEqualTo(Double value) {
            addCriterion("beHpMoney =", value, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyNotEqualTo(Double value) {
            addCriterion("beHpMoney <>", value, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyGreaterThan(Double value) {
            addCriterion("beHpMoney >", value, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("beHpMoney >=", value, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyLessThan(Double value) {
            addCriterion("beHpMoney <", value, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyLessThanOrEqualTo(Double value) {
            addCriterion("beHpMoney <=", value, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyIn(List<Double> values) {
            addCriterion("beHpMoney in", values, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyNotIn(List<Double> values) {
            addCriterion("beHpMoney not in", values, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyBetween(Double value1, Double value2) {
            addCriterion("beHpMoney between", value1, value2, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpmoneyNotBetween(Double value1, Double value2) {
            addCriterion("beHpMoney not between", value1, value2, "behpmoney");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdIsNull() {
            addCriterion("beHp_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdIsNotNull() {
            addCriterion("beHp_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdEqualTo(Integer value) {
            addCriterion("beHp_doc_id =", value, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdNotEqualTo(Integer value) {
            addCriterion("beHp_doc_id <>", value, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdGreaterThan(Integer value) {
            addCriterion("beHp_doc_id >", value, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beHp_doc_id >=", value, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdLessThan(Integer value) {
            addCriterion("beHp_doc_id <", value, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("beHp_doc_id <=", value, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdIn(List<Integer> values) {
            addCriterion("beHp_doc_id in", values, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdNotIn(List<Integer> values) {
            addCriterion("beHp_doc_id not in", values, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdBetween(Integer value1, Integer value2) {
            addCriterion("beHp_doc_id between", value1, value2, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beHp_doc_id not between", value1, value2, "behpDocId");
            return (Criteria) this;
        }

        public Criteria andBehpdateIsNull() {
            addCriterion("beHpDate is null");
            return (Criteria) this;
        }

        public Criteria andBehpdateIsNotNull() {
            addCriterion("beHpDate is not null");
            return (Criteria) this;
        }

        public Criteria andBehpdateEqualTo(Date value) {
            addCriterionForJDBCDate("beHpDate =", value, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("beHpDate <>", value, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("beHpDate >", value, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beHpDate >=", value, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateLessThan(Date value) {
            addCriterionForJDBCDate("beHpDate <", value, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beHpDate <=", value, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateIn(List<Date> values) {
            addCriterionForJDBCDate("beHpDate in", values, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("beHpDate not in", values, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beHpDate between", value1, value2, "behpdate");
            return (Criteria) this;
        }

        public Criteria andBehpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beHpDate not between", value1, value2, "behpdate");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdIsNull() {
            addCriterion("heHp_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdIsNotNull() {
            addCriterion("heHp_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdEqualTo(Integer value) {
            addCriterion("heHp_depart_id =", value, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdNotEqualTo(Integer value) {
            addCriterion("heHp_depart_id <>", value, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdGreaterThan(Integer value) {
            addCriterion("heHp_depart_id >", value, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("heHp_depart_id >=", value, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdLessThan(Integer value) {
            addCriterion("heHp_depart_id <", value, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdLessThanOrEqualTo(Integer value) {
            addCriterion("heHp_depart_id <=", value, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdIn(List<Integer> values) {
            addCriterion("heHp_depart_id in", values, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdNotIn(List<Integer> values) {
            addCriterion("heHp_depart_id not in", values, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdBetween(Integer value1, Integer value2) {
            addCriterion("heHp_depart_id between", value1, value2, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andHehpDepartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("heHp_depart_id not between", value1, value2, "hehpDepartId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdIsNull() {
            addCriterion("beHp_state_id is null");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdIsNotNull() {
            addCriterion("beHp_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdEqualTo(Integer value) {
            addCriterion("beHp_state_id =", value, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdNotEqualTo(Integer value) {
            addCriterion("beHp_state_id <>", value, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdGreaterThan(Integer value) {
            addCriterion("beHp_state_id >", value, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beHp_state_id >=", value, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdLessThan(Integer value) {
            addCriterion("beHp_state_id <", value, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("beHp_state_id <=", value, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdIn(List<Integer> values) {
            addCriterion("beHp_state_id in", values, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdNotIn(List<Integer> values) {
            addCriterion("beHp_state_id not in", values, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdBetween(Integer value1, Integer value2) {
            addCriterion("beHp_state_id between", value1, value2, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andBehpStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beHp_state_id not between", value1, value2, "behpStateId");
            return (Criteria) this;
        }

        public Criteria andHehpdelIsNull() {
            addCriterion("heHpDel is null");
            return (Criteria) this;
        }

        public Criteria andHehpdelIsNotNull() {
            addCriterion("heHpDel is not null");
            return (Criteria) this;
        }

        public Criteria andHehpdelEqualTo(Integer value) {
            addCriterion("heHpDel =", value, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelNotEqualTo(Integer value) {
            addCriterion("heHpDel <>", value, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelGreaterThan(Integer value) {
            addCriterion("heHpDel >", value, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("heHpDel >=", value, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelLessThan(Integer value) {
            addCriterion("heHpDel <", value, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelLessThanOrEqualTo(Integer value) {
            addCriterion("heHpDel <=", value, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelIn(List<Integer> values) {
            addCriterion("heHpDel in", values, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelNotIn(List<Integer> values) {
            addCriterion("heHpDel not in", values, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelBetween(Integer value1, Integer value2) {
            addCriterion("heHpDel between", value1, value2, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andHehpdelNotBetween(Integer value1, Integer value2) {
            addCriterion("heHpDel not between", value1, value2, "hehpdel");
            return (Criteria) this;
        }

        public Criteria andBehpillnessIsNull() {
            addCriterion("beHpIllness is null");
            return (Criteria) this;
        }

        public Criteria andBehpillnessIsNotNull() {
            addCriterion("beHpIllness is not null");
            return (Criteria) this;
        }

        public Criteria andBehpillnessEqualTo(String value) {
            addCriterion("beHpIllness =", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessNotEqualTo(String value) {
            addCriterion("beHpIllness <>", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessGreaterThan(String value) {
            addCriterion("beHpIllness >", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessGreaterThanOrEqualTo(String value) {
            addCriterion("beHpIllness >=", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessLessThan(String value) {
            addCriterion("beHpIllness <", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessLessThanOrEqualTo(String value) {
            addCriterion("beHpIllness <=", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessLike(String value) {
            addCriterion("beHpIllness like", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessNotLike(String value) {
            addCriterion("beHpIllness not like", value, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessIn(List<String> values) {
            addCriterion("beHpIllness in", values, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessNotIn(List<String> values) {
            addCriterion("beHpIllness not in", values, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessBetween(String value1, String value2) {
            addCriterion("beHpIllness between", value1, value2, "behpillness");
            return (Criteria) this;
        }

        public Criteria andBehpillnessNotBetween(String value1, String value2) {
            addCriterion("beHpIllness not between", value1, value2, "behpillness");
            return (Criteria) this;
        }

        public Criteria andHehpnurseIsNull() {
            addCriterion("heHpNurse is null");
            return (Criteria) this;
        }

        public Criteria andHehpnurseIsNotNull() {
            addCriterion("heHpNurse is not null");
            return (Criteria) this;
        }

        public Criteria andHehpnurseEqualTo(String value) {
            addCriterion("heHpNurse =", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseNotEqualTo(String value) {
            addCriterion("heHpNurse <>", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseGreaterThan(String value) {
            addCriterion("heHpNurse >", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseGreaterThanOrEqualTo(String value) {
            addCriterion("heHpNurse >=", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseLessThan(String value) {
            addCriterion("heHpNurse <", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseLessThanOrEqualTo(String value) {
            addCriterion("heHpNurse <=", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseLike(String value) {
            addCriterion("heHpNurse like", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseNotLike(String value) {
            addCriterion("heHpNurse not like", value, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseIn(List<String> values) {
            addCriterion("heHpNurse in", values, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseNotIn(List<String> values) {
            addCriterion("heHpNurse not in", values, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseBetween(String value1, String value2) {
            addCriterion("heHpNurse between", value1, value2, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andHehpnurseNotBetween(String value1, String value2) {
            addCriterion("heHpNurse not between", value1, value2, "hehpnurse");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdIsNull() {
            addCriterion("beHp_hosR_id is null");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdIsNotNull() {
            addCriterion("beHp_hosR_id is not null");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdEqualTo(Integer value) {
            addCriterion("beHp_hosR_id =", value, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdNotEqualTo(Integer value) {
            addCriterion("beHp_hosR_id <>", value, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdGreaterThan(Integer value) {
            addCriterion("beHp_hosR_id >", value, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beHp_hosR_id >=", value, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdLessThan(Integer value) {
            addCriterion("beHp_hosR_id <", value, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdLessThanOrEqualTo(Integer value) {
            addCriterion("beHp_hosR_id <=", value, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdIn(List<Integer> values) {
            addCriterion("beHp_hosR_id in", values, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdNotIn(List<Integer> values) {
            addCriterion("beHp_hosR_id not in", values, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdBetween(Integer value1, Integer value2) {
            addCriterion("beHp_hosR_id between", value1, value2, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpHosrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beHp_hosR_id not between", value1, value2, "behpHosrId");
            return (Criteria) this;
        }

        public Criteria andBehpTcidIsNull() {
            addCriterion("beHp_tcid is null");
            return (Criteria) this;
        }

        public Criteria andBehpTcidIsNotNull() {
            addCriterion("beHp_tcid is not null");
            return (Criteria) this;
        }

        public Criteria andBehpTcidEqualTo(Integer value) {
            addCriterion("beHp_tcid =", value, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidNotEqualTo(Integer value) {
            addCriterion("beHp_tcid <>", value, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidGreaterThan(Integer value) {
            addCriterion("beHp_tcid >", value, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("beHp_tcid >=", value, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidLessThan(Integer value) {
            addCriterion("beHp_tcid <", value, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidLessThanOrEqualTo(Integer value) {
            addCriterion("beHp_tcid <=", value, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidIn(List<Integer> values) {
            addCriterion("beHp_tcid in", values, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidNotIn(List<Integer> values) {
            addCriterion("beHp_tcid not in", values, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidBetween(Integer value1, Integer value2) {
            addCriterion("beHp_tcid between", value1, value2, "behpTcid");
            return (Criteria) this;
        }

        public Criteria andBehpTcidNotBetween(Integer value1, Integer value2) {
            addCriterion("beHp_tcid not between", value1, value2, "behpTcid");
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