package com.ujiuye.guahao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HosregisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HosregisterExample() {
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

        public Criteria andHosridIsNull() {
            addCriterion("hosRId is null");
            return (Criteria) this;
        }

        public Criteria andHosridIsNotNull() {
            addCriterion("hosRId is not null");
            return (Criteria) this;
        }

        public Criteria andHosridEqualTo(Integer value) {
            addCriterion("hosRId =", value, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridNotEqualTo(Integer value) {
            addCriterion("hosRId <>", value, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridGreaterThan(Integer value) {
            addCriterion("hosRId >", value, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosRId >=", value, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridLessThan(Integer value) {
            addCriterion("hosRId <", value, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridLessThanOrEqualTo(Integer value) {
            addCriterion("hosRId <=", value, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridIn(List<Integer> values) {
            addCriterion("hosRId in", values, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridNotIn(List<Integer> values) {
            addCriterion("hosRId not in", values, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridBetween(Integer value1, Integer value2) {
            addCriterion("hosRId between", value1, value2, "hosrid");
            return (Criteria) this;
        }

        public Criteria andHosridNotBetween(Integer value1, Integer value2) {
            addCriterion("hosRId not between", value1, value2, "hosrid");
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

        public Criteria andHosrdateIsNull() {
            addCriterion("hosRDate is null");
            return (Criteria) this;
        }

        public Criteria andHosrdateIsNotNull() {
            addCriterion("hosRDate is not null");
            return (Criteria) this;
        }

        public Criteria andHosrdateEqualTo(Date value) {
            addCriterionForJDBCDate("hosRDate =", value, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hosRDate <>", value, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateGreaterThan(Date value) {
            addCriterionForJDBCDate("hosRDate >", value, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hosRDate >=", value, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateLessThan(Date value) {
            addCriterionForJDBCDate("hosRDate <", value, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hosRDate <=", value, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateIn(List<Date> values) {
            addCriterionForJDBCDate("hosRDate in", values, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hosRDate not in", values, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hosRDate between", value1, value2, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hosRDate not between", value1, value2, "hosrdate");
            return (Criteria) this;
        }

        public Criteria andHosrnameIsNull() {
            addCriterion("hosRName is null");
            return (Criteria) this;
        }

        public Criteria andHosrnameIsNotNull() {
            addCriterion("hosRName is not null");
            return (Criteria) this;
        }

        public Criteria andHosrnameEqualTo(String value) {
            addCriterion("hosRName =", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameNotEqualTo(String value) {
            addCriterion("hosRName <>", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameGreaterThan(String value) {
            addCriterion("hosRName >", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameGreaterThanOrEqualTo(String value) {
            addCriterion("hosRName >=", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameLessThan(String value) {
            addCriterion("hosRName <", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameLessThanOrEqualTo(String value) {
            addCriterion("hosRName <=", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameLike(String value) {
            addCriterion("hosRName like", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameNotLike(String value) {
            addCriterion("hosRName not like", value, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameIn(List<String> values) {
            addCriterion("hosRName in", values, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameNotIn(List<String> values) {
            addCriterion("hosRName not in", values, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameBetween(String value1, String value2) {
            addCriterion("hosRName between", value1, value2, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosrnameNotBetween(String value1, String value2) {
            addCriterion("hosRName not between", value1, value2, "hosrname");
            return (Criteria) this;
        }

        public Criteria andHosridcardIsNull() {
            addCriterion("hosRidcard is null");
            return (Criteria) this;
        }

        public Criteria andHosridcardIsNotNull() {
            addCriterion("hosRidcard is not null");
            return (Criteria) this;
        }

        public Criteria andHosridcardEqualTo(String value) {
            addCriterion("hosRidcard =", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardNotEqualTo(String value) {
            addCriterion("hosRidcard <>", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardGreaterThan(String value) {
            addCriterion("hosRidcard >", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardGreaterThanOrEqualTo(String value) {
            addCriterion("hosRidcard >=", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardLessThan(String value) {
            addCriterion("hosRidcard <", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardLessThanOrEqualTo(String value) {
            addCriterion("hosRidcard <=", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardLike(String value) {
            addCriterion("hosRidcard like", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardNotLike(String value) {
            addCriterion("hosRidcard not like", value, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardIn(List<String> values) {
            addCriterion("hosRidcard in", values, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardNotIn(List<String> values) {
            addCriterion("hosRidcard not in", values, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardBetween(String value1, String value2) {
            addCriterion("hosRidcard between", value1, value2, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosridcardNotBetween(String value1, String value2) {
            addCriterion("hosRidcard not between", value1, value2, "hosridcard");
            return (Criteria) this;
        }

        public Criteria andHosrssnumIsNull() {
            addCriterion("hosRSSNum is null");
            return (Criteria) this;
        }

        public Criteria andHosrssnumIsNotNull() {
            addCriterion("hosRSSNum is not null");
            return (Criteria) this;
        }

        public Criteria andHosrssnumEqualTo(String value) {
            addCriterion("hosRSSNum =", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumNotEqualTo(String value) {
            addCriterion("hosRSSNum <>", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumGreaterThan(String value) {
            addCriterion("hosRSSNum >", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumGreaterThanOrEqualTo(String value) {
            addCriterion("hosRSSNum >=", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumLessThan(String value) {
            addCriterion("hosRSSNum <", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumLessThanOrEqualTo(String value) {
            addCriterion("hosRSSNum <=", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumLike(String value) {
            addCriterion("hosRSSNum like", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumNotLike(String value) {
            addCriterion("hosRSSNum not like", value, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumIn(List<String> values) {
            addCriterion("hosRSSNum in", values, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumNotIn(List<String> values) {
            addCriterion("hosRSSNum not in", values, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumBetween(String value1, String value2) {
            addCriterion("hosRSSNum between", value1, value2, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrssnumNotBetween(String value1, String value2) {
            addCriterion("hosRSSNum not between", value1, value2, "hosrssnum");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyIsNull() {
            addCriterion("hosRMoney is null");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyIsNotNull() {
            addCriterion("hosRMoney is not null");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyEqualTo(Double value) {
            addCriterion("hosRMoney =", value, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyNotEqualTo(Double value) {
            addCriterion("hosRMoney <>", value, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyGreaterThan(Double value) {
            addCriterion("hosRMoney >", value, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("hosRMoney >=", value, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyLessThan(Double value) {
            addCriterion("hosRMoney <", value, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyLessThanOrEqualTo(Double value) {
            addCriterion("hosRMoney <=", value, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyIn(List<Double> values) {
            addCriterion("hosRMoney in", values, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyNotIn(List<Double> values) {
            addCriterion("hosRMoney not in", values, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyBetween(Double value1, Double value2) {
            addCriterion("hosRMoney between", value1, value2, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrmoneyNotBetween(Double value1, Double value2) {
            addCriterion("hosRMoney not between", value1, value2, "hosrmoney");
            return (Criteria) this;
        }

        public Criteria andHosrphoneIsNull() {
            addCriterion("hosRphone is null");
            return (Criteria) this;
        }

        public Criteria andHosrphoneIsNotNull() {
            addCriterion("hosRphone is not null");
            return (Criteria) this;
        }

        public Criteria andHosrphoneEqualTo(String value) {
            addCriterion("hosRphone =", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneNotEqualTo(String value) {
            addCriterion("hosRphone <>", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneGreaterThan(String value) {
            addCriterion("hosRphone >", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneGreaterThanOrEqualTo(String value) {
            addCriterion("hosRphone >=", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneLessThan(String value) {
            addCriterion("hosRphone <", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneLessThanOrEqualTo(String value) {
            addCriterion("hosRphone <=", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneLike(String value) {
            addCriterion("hosRphone like", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneNotLike(String value) {
            addCriterion("hosRphone not like", value, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneIn(List<String> values) {
            addCriterion("hosRphone in", values, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneNotIn(List<String> values) {
            addCriterion("hosRphone not in", values, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneBetween(String value1, String value2) {
            addCriterion("hosRphone between", value1, value2, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrphoneNotBetween(String value1, String value2) {
            addCriterion("hosRphone not between", value1, value2, "hosrphone");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceIsNull() {
            addCriterion("hosRselfPrice is null");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceIsNotNull() {
            addCriterion("hosRselfPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceEqualTo(Integer value) {
            addCriterion("hosRselfPrice =", value, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceNotEqualTo(Integer value) {
            addCriterion("hosRselfPrice <>", value, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceGreaterThan(Integer value) {
            addCriterion("hosRselfPrice >", value, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosRselfPrice >=", value, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceLessThan(Integer value) {
            addCriterion("hosRselfPrice <", value, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceLessThanOrEqualTo(Integer value) {
            addCriterion("hosRselfPrice <=", value, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceIn(List<Integer> values) {
            addCriterion("hosRselfPrice in", values, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceNotIn(List<Integer> values) {
            addCriterion("hosRselfPrice not in", values, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceBetween(Integer value1, Integer value2) {
            addCriterion("hosRselfPrice between", value1, value2, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrselfpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hosRselfPrice not between", value1, value2, "hosrselfprice");
            return (Criteria) this;
        }

        public Criteria andHosrsexIsNull() {
            addCriterion("hosRsex is null");
            return (Criteria) this;
        }

        public Criteria andHosrsexIsNotNull() {
            addCriterion("hosRsex is not null");
            return (Criteria) this;
        }

        public Criteria andHosrsexEqualTo(Integer value) {
            addCriterion("hosRsex =", value, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexNotEqualTo(Integer value) {
            addCriterion("hosRsex <>", value, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexGreaterThan(Integer value) {
            addCriterion("hosRsex >", value, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosRsex >=", value, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexLessThan(Integer value) {
            addCriterion("hosRsex <", value, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexLessThanOrEqualTo(Integer value) {
            addCriterion("hosRsex <=", value, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexIn(List<Integer> values) {
            addCriterion("hosRsex in", values, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexNotIn(List<Integer> values) {
            addCriterion("hosRsex not in", values, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexBetween(Integer value1, Integer value2) {
            addCriterion("hosRsex between", value1, value2, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrsexNotBetween(Integer value1, Integer value2) {
            addCriterion("hosRsex not between", value1, value2, "hosrsex");
            return (Criteria) this;
        }

        public Criteria andHosrageIsNull() {
            addCriterion("hosRage is null");
            return (Criteria) this;
        }

        public Criteria andHosrageIsNotNull() {
            addCriterion("hosRage is not null");
            return (Criteria) this;
        }

        public Criteria andHosrageEqualTo(Integer value) {
            addCriterion("hosRage =", value, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageNotEqualTo(Integer value) {
            addCriterion("hosRage <>", value, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageGreaterThan(Integer value) {
            addCriterion("hosRage >", value, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosRage >=", value, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageLessThan(Integer value) {
            addCriterion("hosRage <", value, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageLessThanOrEqualTo(Integer value) {
            addCriterion("hosRage <=", value, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageIn(List<Integer> values) {
            addCriterion("hosRage in", values, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageNotIn(List<Integer> values) {
            addCriterion("hosRage not in", values, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageBetween(Integer value1, Integer value2) {
            addCriterion("hosRage between", value1, value2, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrageNotBetween(Integer value1, Integer value2) {
            addCriterion("hosRage not between", value1, value2, "hosrage");
            return (Criteria) this;
        }

        public Criteria andHosrjobIsNull() {
            addCriterion("hosRjob is null");
            return (Criteria) this;
        }

        public Criteria andHosrjobIsNotNull() {
            addCriterion("hosRjob is not null");
            return (Criteria) this;
        }

        public Criteria andHosrjobEqualTo(String value) {
            addCriterion("hosRjob =", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobNotEqualTo(String value) {
            addCriterion("hosRjob <>", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobGreaterThan(String value) {
            addCriterion("hosRjob >", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobGreaterThanOrEqualTo(String value) {
            addCriterion("hosRjob >=", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobLessThan(String value) {
            addCriterion("hosRjob <", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobLessThanOrEqualTo(String value) {
            addCriterion("hosRjob <=", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobLike(String value) {
            addCriterion("hosRjob like", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobNotLike(String value) {
            addCriterion("hosRjob not like", value, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobIn(List<String> values) {
            addCriterion("hosRjob in", values, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobNotIn(List<String> values) {
            addCriterion("hosRjob not in", values, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobBetween(String value1, String value2) {
            addCriterion("hosRjob between", value1, value2, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrjobNotBetween(String value1, String value2) {
            addCriterion("hosRjob not between", value1, value2, "hosrjob");
            return (Criteria) this;
        }

        public Criteria andHosrvisitIsNull() {
            addCriterion("hosRvisit is null");
            return (Criteria) this;
        }

        public Criteria andHosrvisitIsNotNull() {
            addCriterion("hosRvisit is not null");
            return (Criteria) this;
        }

        public Criteria andHosrvisitEqualTo(Integer value) {
            addCriterion("hosRvisit =", value, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitNotEqualTo(Integer value) {
            addCriterion("hosRvisit <>", value, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitGreaterThan(Integer value) {
            addCriterion("hosRvisit >", value, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosRvisit >=", value, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitLessThan(Integer value) {
            addCriterion("hosRvisit <", value, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitLessThanOrEqualTo(Integer value) {
            addCriterion("hosRvisit <=", value, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitIn(List<Integer> values) {
            addCriterion("hosRvisit in", values, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitNotIn(List<Integer> values) {
            addCriterion("hosRvisit not in", values, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitBetween(Integer value1, Integer value2) {
            addCriterion("hosRvisit between", value1, value2, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrvisitNotBetween(Integer value1, Integer value2) {
            addCriterion("hosRvisit not between", value1, value2, "hosrvisit");
            return (Criteria) this;
        }

        public Criteria andHosrremarkIsNull() {
            addCriterion("hosRremark is null");
            return (Criteria) this;
        }

        public Criteria andHosrremarkIsNotNull() {
            addCriterion("hosRremark is not null");
            return (Criteria) this;
        }

        public Criteria andHosrremarkEqualTo(String value) {
            addCriterion("hosRremark =", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkNotEqualTo(String value) {
            addCriterion("hosRremark <>", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkGreaterThan(String value) {
            addCriterion("hosRremark >", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkGreaterThanOrEqualTo(String value) {
            addCriterion("hosRremark >=", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkLessThan(String value) {
            addCriterion("hosRremark <", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkLessThanOrEqualTo(String value) {
            addCriterion("hosRremark <=", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkLike(String value) {
            addCriterion("hosRremark like", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkNotLike(String value) {
            addCriterion("hosRremark not like", value, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkIn(List<String> values) {
            addCriterion("hosRremark in", values, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkNotIn(List<String> values) {
            addCriterion("hosRremark not in", values, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkBetween(String value1, String value2) {
            addCriterion("hosRremark between", value1, value2, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrremarkNotBetween(String value1, String value2) {
            addCriterion("hosRremark not between", value1, value2, "hosrremark");
            return (Criteria) this;
        }

        public Criteria andHosrdelIsNull() {
            addCriterion("hosRDel is null");
            return (Criteria) this;
        }

        public Criteria andHosrdelIsNotNull() {
            addCriterion("hosRDel is not null");
            return (Criteria) this;
        }

        public Criteria andHosrdelEqualTo(Integer value) {
            addCriterion("hosRDel =", value, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelNotEqualTo(Integer value) {
            addCriterion("hosRDel <>", value, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelGreaterThan(Integer value) {
            addCriterion("hosRDel >", value, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosRDel >=", value, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelLessThan(Integer value) {
            addCriterion("hosRDel <", value, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelLessThanOrEqualTo(Integer value) {
            addCriterion("hosRDel <=", value, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelIn(List<Integer> values) {
            addCriterion("hosRDel in", values, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelNotIn(List<Integer> values) {
            addCriterion("hosRDel not in", values, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelBetween(Integer value1, Integer value2) {
            addCriterion("hosRDel between", value1, value2, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHosrdelNotBetween(Integer value1, Integer value2) {
            addCriterion("hosRDel not between", value1, value2, "hosrdel");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdIsNull() {
            addCriterion("hR_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdIsNotNull() {
            addCriterion("hR_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdEqualTo(Integer value) {
            addCriterion("hR_depart_id =", value, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdNotEqualTo(Integer value) {
            addCriterion("hR_depart_id <>", value, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdGreaterThan(Integer value) {
            addCriterion("hR_depart_id >", value, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hR_depart_id >=", value, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdLessThan(Integer value) {
            addCriterion("hR_depart_id <", value, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdLessThanOrEqualTo(Integer value) {
            addCriterion("hR_depart_id <=", value, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdIn(List<Integer> values) {
            addCriterion("hR_depart_id in", values, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdNotIn(List<Integer> values) {
            addCriterion("hR_depart_id not in", values, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdBetween(Integer value1, Integer value2) {
            addCriterion("hR_depart_id between", value1, value2, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDepartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hR_depart_id not between", value1, value2, "hrDepartId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdIsNull() {
            addCriterion("hR_Doc_id is null");
            return (Criteria) this;
        }

        public Criteria andHrDocIdIsNotNull() {
            addCriterion("hR_Doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrDocIdEqualTo(Integer value) {
            addCriterion("hR_Doc_id =", value, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdNotEqualTo(Integer value) {
            addCriterion("hR_Doc_id <>", value, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdGreaterThan(Integer value) {
            addCriterion("hR_Doc_id >", value, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hR_Doc_id >=", value, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdLessThan(Integer value) {
            addCriterion("hR_Doc_id <", value, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("hR_Doc_id <=", value, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdIn(List<Integer> values) {
            addCriterion("hR_Doc_id in", values, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdNotIn(List<Integer> values) {
            addCriterion("hR_Doc_id not in", values, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdBetween(Integer value1, Integer value2) {
            addCriterion("hR_Doc_id between", value1, value2, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hR_Doc_id not between", value1, value2, "hrDocId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdIsNull() {
            addCriterion("hR_state_id is null");
            return (Criteria) this;
        }

        public Criteria andHrStateIdIsNotNull() {
            addCriterion("hR_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrStateIdEqualTo(Integer value) {
            addCriterion("hR_state_id =", value, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdNotEqualTo(Integer value) {
            addCriterion("hR_state_id <>", value, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdGreaterThan(Integer value) {
            addCriterion("hR_state_id >", value, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hR_state_id >=", value, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdLessThan(Integer value) {
            addCriterion("hR_state_id <", value, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("hR_state_id <=", value, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdIn(List<Integer> values) {
            addCriterion("hR_state_id in", values, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdNotIn(List<Integer> values) {
            addCriterion("hR_state_id not in", values, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdBetween(Integer value1, Integer value2) {
            addCriterion("hR_state_id between", value1, value2, "hrStateId");
            return (Criteria) this;
        }

        public Criteria andHrStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hR_state_id not between", value1, value2, "hrStateId");
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