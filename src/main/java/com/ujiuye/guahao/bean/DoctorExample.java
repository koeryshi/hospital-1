package com.ujiuye.guahao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("dId is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("dId is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("dId =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("dId <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("dId >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dId >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("dId <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("dId <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("dId in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("dId not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("dId between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("dId not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dName is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dName is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dName =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dName <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dName >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dName >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dName <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dName <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dName like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dName not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dName in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dName not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dName between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dName not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDidcardIsNull() {
            addCriterion("dIdcard is null");
            return (Criteria) this;
        }

        public Criteria andDidcardIsNotNull() {
            addCriterion("dIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andDidcardEqualTo(String value) {
            addCriterion("dIdcard =", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardNotEqualTo(String value) {
            addCriterion("dIdcard <>", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardGreaterThan(String value) {
            addCriterion("dIdcard >", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardGreaterThanOrEqualTo(String value) {
            addCriterion("dIdcard >=", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardLessThan(String value) {
            addCriterion("dIdcard <", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardLessThanOrEqualTo(String value) {
            addCriterion("dIdcard <=", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardLike(String value) {
            addCriterion("dIdcard like", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardNotLike(String value) {
            addCriterion("dIdcard not like", value, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardIn(List<String> values) {
            addCriterion("dIdcard in", values, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardNotIn(List<String> values) {
            addCriterion("dIdcard not in", values, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardBetween(String value1, String value2) {
            addCriterion("dIdcard between", value1, value2, "didcard");
            return (Criteria) this;
        }

        public Criteria andDidcardNotBetween(String value1, String value2) {
            addCriterion("dIdcard not between", value1, value2, "didcard");
            return (Criteria) this;
        }

        public Criteria andDphoneIsNull() {
            addCriterion("dPhone is null");
            return (Criteria) this;
        }

        public Criteria andDphoneIsNotNull() {
            addCriterion("dPhone is not null");
            return (Criteria) this;
        }

        public Criteria andDphoneEqualTo(String value) {
            addCriterion("dPhone =", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotEqualTo(String value) {
            addCriterion("dPhone <>", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneGreaterThan(String value) {
            addCriterion("dPhone >", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneGreaterThanOrEqualTo(String value) {
            addCriterion("dPhone >=", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLessThan(String value) {
            addCriterion("dPhone <", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLessThanOrEqualTo(String value) {
            addCriterion("dPhone <=", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLike(String value) {
            addCriterion("dPhone like", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotLike(String value) {
            addCriterion("dPhone not like", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneIn(List<String> values) {
            addCriterion("dPhone in", values, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotIn(List<String> values) {
            addCriterion("dPhone not in", values, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneBetween(String value1, String value2) {
            addCriterion("dPhone between", value1, value2, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotBetween(String value1, String value2) {
            addCriterion("dPhone not between", value1, value2, "dphone");
            return (Criteria) this;
        }

        public Criteria andDtellIsNull() {
            addCriterion("dTell is null");
            return (Criteria) this;
        }

        public Criteria andDtellIsNotNull() {
            addCriterion("dTell is not null");
            return (Criteria) this;
        }

        public Criteria andDtellEqualTo(String value) {
            addCriterion("dTell =", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellNotEqualTo(String value) {
            addCriterion("dTell <>", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellGreaterThan(String value) {
            addCriterion("dTell >", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellGreaterThanOrEqualTo(String value) {
            addCriterion("dTell >=", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellLessThan(String value) {
            addCriterion("dTell <", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellLessThanOrEqualTo(String value) {
            addCriterion("dTell <=", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellLike(String value) {
            addCriterion("dTell like", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellNotLike(String value) {
            addCriterion("dTell not like", value, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellIn(List<String> values) {
            addCriterion("dTell in", values, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellNotIn(List<String> values) {
            addCriterion("dTell not in", values, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellBetween(String value1, String value2) {
            addCriterion("dTell between", value1, value2, "dtell");
            return (Criteria) this;
        }

        public Criteria andDtellNotBetween(String value1, String value2) {
            addCriterion("dTell not between", value1, value2, "dtell");
            return (Criteria) this;
        }

        public Criteria andDsexIsNull() {
            addCriterion("dSex is null");
            return (Criteria) this;
        }

        public Criteria andDsexIsNotNull() {
            addCriterion("dSex is not null");
            return (Criteria) this;
        }

        public Criteria andDsexEqualTo(Integer value) {
            addCriterion("dSex =", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotEqualTo(Integer value) {
            addCriterion("dSex <>", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThan(Integer value) {
            addCriterion("dSex >", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("dSex >=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThan(Integer value) {
            addCriterion("dSex <", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThanOrEqualTo(Integer value) {
            addCriterion("dSex <=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexIn(List<Integer> values) {
            addCriterion("dSex in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotIn(List<Integer> values) {
            addCriterion("dSex not in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexBetween(Integer value1, Integer value2) {
            addCriterion("dSex between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotBetween(Integer value1, Integer value2) {
            addCriterion("dSex not between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDageIsNull() {
            addCriterion("dAge is null");
            return (Criteria) this;
        }

        public Criteria andDageIsNotNull() {
            addCriterion("dAge is not null");
            return (Criteria) this;
        }

        public Criteria andDageEqualTo(Integer value) {
            addCriterion("dAge =", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotEqualTo(Integer value) {
            addCriterion("dAge <>", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThan(Integer value) {
            addCriterion("dAge >", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThanOrEqualTo(Integer value) {
            addCriterion("dAge >=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThan(Integer value) {
            addCriterion("dAge <", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThanOrEqualTo(Integer value) {
            addCriterion("dAge <=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageIn(List<Integer> values) {
            addCriterion("dAge in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotIn(List<Integer> values) {
            addCriterion("dAge not in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageBetween(Integer value1, Integer value2) {
            addCriterion("dAge between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotBetween(Integer value1, Integer value2) {
            addCriterion("dAge not between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andDbirthIsNull() {
            addCriterion("dBirth is null");
            return (Criteria) this;
        }

        public Criteria andDbirthIsNotNull() {
            addCriterion("dBirth is not null");
            return (Criteria) this;
        }

        public Criteria andDbirthEqualTo(Date value) {
            addCriterionForJDBCDate("dBirth =", value, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("dBirth <>", value, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("dBirth >", value, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dBirth >=", value, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthLessThan(Date value) {
            addCriterionForJDBCDate("dBirth <", value, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dBirth <=", value, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthIn(List<Date> values) {
            addCriterionForJDBCDate("dBirth in", values, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("dBirth not in", values, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dBirth between", value1, value2, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dBirth not between", value1, value2, "dbirth");
            return (Criteria) this;
        }

        public Criteria andDemailIsNull() {
            addCriterion("dEmail is null");
            return (Criteria) this;
        }

        public Criteria andDemailIsNotNull() {
            addCriterion("dEmail is not null");
            return (Criteria) this;
        }

        public Criteria andDemailEqualTo(String value) {
            addCriterion("dEmail =", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotEqualTo(String value) {
            addCriterion("dEmail <>", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailGreaterThan(String value) {
            addCriterion("dEmail >", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailGreaterThanOrEqualTo(String value) {
            addCriterion("dEmail >=", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLessThan(String value) {
            addCriterion("dEmail <", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLessThanOrEqualTo(String value) {
            addCriterion("dEmail <=", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLike(String value) {
            addCriterion("dEmail like", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotLike(String value) {
            addCriterion("dEmail not like", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailIn(List<String> values) {
            addCriterion("dEmail in", values, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotIn(List<String> values) {
            addCriterion("dEmail not in", values, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailBetween(String value1, String value2) {
            addCriterion("dEmail between", value1, value2, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotBetween(String value1, String value2) {
            addCriterion("dEmail not between", value1, value2, "demail");
            return (Criteria) this;
        }

        public Criteria andDinnerdateIsNull() {
            addCriterion("dInnerDate is null");
            return (Criteria) this;
        }

        public Criteria andDinnerdateIsNotNull() {
            addCriterion("dInnerDate is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerdateEqualTo(Date value) {
            addCriterionForJDBCDate("dInnerDate =", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dInnerDate <>", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateGreaterThan(Date value) {
            addCriterionForJDBCDate("dInnerDate >", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dInnerDate >=", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateLessThan(Date value) {
            addCriterionForJDBCDate("dInnerDate <", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dInnerDate <=", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateIn(List<Date> values) {
            addCriterionForJDBCDate("dInnerDate in", values, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dInnerDate not in", values, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dInnerDate between", value1, value2, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dInnerDate not between", value1, value2, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDremarkIsNull() {
            addCriterion("dRemark is null");
            return (Criteria) this;
        }

        public Criteria andDremarkIsNotNull() {
            addCriterion("dRemark is not null");
            return (Criteria) this;
        }

        public Criteria andDremarkEqualTo(String value) {
            addCriterion("dRemark =", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkNotEqualTo(String value) {
            addCriterion("dRemark <>", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkGreaterThan(String value) {
            addCriterion("dRemark >", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkGreaterThanOrEqualTo(String value) {
            addCriterion("dRemark >=", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkLessThan(String value) {
            addCriterion("dRemark <", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkLessThanOrEqualTo(String value) {
            addCriterion("dRemark <=", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkLike(String value) {
            addCriterion("dRemark like", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkNotLike(String value) {
            addCriterion("dRemark not like", value, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkIn(List<String> values) {
            addCriterion("dRemark in", values, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkNotIn(List<String> values) {
            addCriterion("dRemark not in", values, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkBetween(String value1, String value2) {
            addCriterion("dRemark between", value1, value2, "dremark");
            return (Criteria) this;
        }

        public Criteria andDremarkNotBetween(String value1, String value2) {
            addCriterion("dRemark not between", value1, value2, "dremark");
            return (Criteria) this;
        }

        public Criteria andDdelIsNull() {
            addCriterion("dDel is null");
            return (Criteria) this;
        }

        public Criteria andDdelIsNotNull() {
            addCriterion("dDel is not null");
            return (Criteria) this;
        }

        public Criteria andDdelEqualTo(Integer value) {
            addCriterion("dDel =", value, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelNotEqualTo(Integer value) {
            addCriterion("dDel <>", value, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelGreaterThan(Integer value) {
            addCriterion("dDel >", value, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dDel >=", value, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelLessThan(Integer value) {
            addCriterion("dDel <", value, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelLessThanOrEqualTo(Integer value) {
            addCriterion("dDel <=", value, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelIn(List<Integer> values) {
            addCriterion("dDel in", values, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelNotIn(List<Integer> values) {
            addCriterion("dDel not in", values, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelBetween(Integer value1, Integer value2) {
            addCriterion("dDel between", value1, value2, "ddel");
            return (Criteria) this;
        }

        public Criteria andDdelNotBetween(Integer value1, Integer value2) {
            addCriterion("dDel not between", value1, value2, "ddel");
            return (Criteria) this;
        }

        public Criteria andDDepartIdIsNull() {
            addCriterion("d_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDDepartIdIsNotNull() {
            addCriterion("d_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDDepartIdEqualTo(Integer value) {
            addCriterion("d_depart_id =", value, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdNotEqualTo(Integer value) {
            addCriterion("d_depart_id <>", value, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdGreaterThan(Integer value) {
            addCriterion("d_depart_id >", value, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_depart_id >=", value, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdLessThan(Integer value) {
            addCriterion("d_depart_id <", value, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_depart_id <=", value, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdIn(List<Integer> values) {
            addCriterion("d_depart_id in", values, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdNotIn(List<Integer> values) {
            addCriterion("d_depart_id not in", values, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdBetween(Integer value1, Integer value2) {
            addCriterion("d_depart_id between", value1, value2, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDDepartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_depart_id not between", value1, value2, "dDepartId");
            return (Criteria) this;
        }

        public Criteria andDEduIdIsNull() {
            addCriterion("d_edu_id is null");
            return (Criteria) this;
        }

        public Criteria andDEduIdIsNotNull() {
            addCriterion("d_edu_id is not null");
            return (Criteria) this;
        }

        public Criteria andDEduIdEqualTo(Integer value) {
            addCriterion("d_edu_id =", value, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdNotEqualTo(Integer value) {
            addCriterion("d_edu_id <>", value, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdGreaterThan(Integer value) {
            addCriterion("d_edu_id >", value, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_edu_id >=", value, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdLessThan(Integer value) {
            addCriterion("d_edu_id <", value, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_edu_id <=", value, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdIn(List<Integer> values) {
            addCriterion("d_edu_id in", values, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdNotIn(List<Integer> values) {
            addCriterion("d_edu_id not in", values, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdBetween(Integer value1, Integer value2) {
            addCriterion("d_edu_id between", value1, value2, "dEduId");
            return (Criteria) this;
        }

        public Criteria andDEduIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_edu_id not between", value1, value2, "dEduId");
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