package com.ujiuye.fayao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andDrugidIsNull() {
            addCriterion("drugId is null");
            return (Criteria) this;
        }

        public Criteria andDrugidIsNotNull() {
            addCriterion("drugId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugidEqualTo(Integer value) {
            addCriterion("drugId =", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotEqualTo(Integer value) {
            addCriterion("drugId <>", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidGreaterThan(Integer value) {
            addCriterion("drugId >", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugId >=", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLessThan(Integer value) {
            addCriterion("drugId <", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLessThanOrEqualTo(Integer value) {
            addCriterion("drugId <=", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidIn(List<Integer> values) {
            addCriterion("drugId in", values, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotIn(List<Integer> values) {
            addCriterion("drugId not in", values, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidBetween(Integer value1, Integer value2) {
            addCriterion("drugId between", value1, value2, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugId not between", value1, value2, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIsNull() {
            addCriterion("drugCode is null");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIsNotNull() {
            addCriterion("drugCode is not null");
            return (Criteria) this;
        }

        public Criteria andDrugcodeEqualTo(String value) {
            addCriterion("drugCode =", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotEqualTo(String value) {
            addCriterion("drugCode <>", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeGreaterThan(String value) {
            addCriterion("drugCode >", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeGreaterThanOrEqualTo(String value) {
            addCriterion("drugCode >=", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLessThan(String value) {
            addCriterion("drugCode <", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLessThanOrEqualTo(String value) {
            addCriterion("drugCode <=", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLike(String value) {
            addCriterion("drugCode like", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotLike(String value) {
            addCriterion("drugCode not like", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIn(List<String> values) {
            addCriterion("drugCode in", values, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotIn(List<String> values) {
            addCriterion("drugCode not in", values, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeBetween(String value1, String value2) {
            addCriterion("drugCode between", value1, value2, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotBetween(String value1, String value2) {
            addCriterion("drugCode not between", value1, value2, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameIsNull() {
            addCriterion("drugImgName is null");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameIsNotNull() {
            addCriterion("drugImgName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameEqualTo(String value) {
            addCriterion("drugImgName =", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameNotEqualTo(String value) {
            addCriterion("drugImgName <>", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameGreaterThan(String value) {
            addCriterion("drugImgName >", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugImgName >=", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameLessThan(String value) {
            addCriterion("drugImgName <", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameLessThanOrEqualTo(String value) {
            addCriterion("drugImgName <=", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameLike(String value) {
            addCriterion("drugImgName like", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameNotLike(String value) {
            addCriterion("drugImgName not like", value, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameIn(List<String> values) {
            addCriterion("drugImgName in", values, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameNotIn(List<String> values) {
            addCriterion("drugImgName not in", values, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameBetween(String value1, String value2) {
            addCriterion("drugImgName between", value1, value2, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDrugimgnameNotBetween(String value1, String value2) {
            addCriterion("drugImgName not between", value1, value2, "drugimgname");
            return (Criteria) this;
        }

        public Criteria andDruginpriceIsNull() {
            addCriterion("drugInprice is null");
            return (Criteria) this;
        }

        public Criteria andDruginpriceIsNotNull() {
            addCriterion("drugInprice is not null");
            return (Criteria) this;
        }

        public Criteria andDruginpriceEqualTo(Double value) {
            addCriterion("drugInprice =", value, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceNotEqualTo(Double value) {
            addCriterion("drugInprice <>", value, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceGreaterThan(Double value) {
            addCriterion("drugInprice >", value, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("drugInprice >=", value, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceLessThan(Double value) {
            addCriterion("drugInprice <", value, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceLessThanOrEqualTo(Double value) {
            addCriterion("drugInprice <=", value, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceIn(List<Double> values) {
            addCriterion("drugInprice in", values, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceNotIn(List<Double> values) {
            addCriterion("drugInprice not in", values, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceBetween(Double value1, Double value2) {
            addCriterion("drugInprice between", value1, value2, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDruginpriceNotBetween(Double value1, Double value2) {
            addCriterion("drugInprice not between", value1, value2, "druginprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceIsNull() {
            addCriterion("drugSaleprice is null");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceIsNotNull() {
            addCriterion("drugSaleprice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceEqualTo(Double value) {
            addCriterion("drugSaleprice =", value, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceNotEqualTo(Double value) {
            addCriterion("drugSaleprice <>", value, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceGreaterThan(Double value) {
            addCriterion("drugSaleprice >", value, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("drugSaleprice >=", value, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceLessThan(Double value) {
            addCriterion("drugSaleprice <", value, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceLessThanOrEqualTo(Double value) {
            addCriterion("drugSaleprice <=", value, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceIn(List<Double> values) {
            addCriterion("drugSaleprice in", values, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceNotIn(List<Double> values) {
            addCriterion("drugSaleprice not in", values, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceBetween(Double value1, Double value2) {
            addCriterion("drugSaleprice between", value1, value2, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugsalepriceNotBetween(Double value1, Double value2) {
            addCriterion("drugSaleprice not between", value1, value2, "drugsaleprice");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNull() {
            addCriterion("drugName is null");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNotNull() {
            addCriterion("drugName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnameEqualTo(String value) {
            addCriterion("drugName =", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotEqualTo(String value) {
            addCriterion("drugName <>", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThan(String value) {
            addCriterion("drugName >", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugName >=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThan(String value) {
            addCriterion("drugName <", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThanOrEqualTo(String value) {
            addCriterion("drugName <=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLike(String value) {
            addCriterion("drugName like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotLike(String value) {
            addCriterion("drugName not like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameIn(List<String> values) {
            addCriterion("drugName in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotIn(List<String> values) {
            addCriterion("drugName not in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameBetween(String value1, String value2) {
            addCriterion("drugName between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotBetween(String value1, String value2) {
            addCriterion("drugName not between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugtypeIsNull() {
            addCriterion("drugType is null");
            return (Criteria) this;
        }

        public Criteria andDrugtypeIsNotNull() {
            addCriterion("drugType is not null");
            return (Criteria) this;
        }

        public Criteria andDrugtypeEqualTo(String value) {
            addCriterion("drugType =", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotEqualTo(String value) {
            addCriterion("drugType <>", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeGreaterThan(String value) {
            addCriterion("drugType >", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeGreaterThanOrEqualTo(String value) {
            addCriterion("drugType >=", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeLessThan(String value) {
            addCriterion("drugType <", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeLessThanOrEqualTo(String value) {
            addCriterion("drugType <=", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeLike(String value) {
            addCriterion("drugType like", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotLike(String value) {
            addCriterion("drugType not like", value, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeIn(List<String> values) {
            addCriterion("drugType in", values, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotIn(List<String> values) {
            addCriterion("drugType not in", values, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeBetween(String value1, String value2) {
            addCriterion("drugType between", value1, value2, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugtypeNotBetween(String value1, String value2) {
            addCriterion("drugType not between", value1, value2, "drugtype");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescIsNull() {
            addCriterion("drugSimpleDesc is null");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescIsNotNull() {
            addCriterion("drugSimpleDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescEqualTo(String value) {
            addCriterion("drugSimpleDesc =", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescNotEqualTo(String value) {
            addCriterion("drugSimpleDesc <>", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescGreaterThan(String value) {
            addCriterion("drugSimpleDesc >", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescGreaterThanOrEqualTo(String value) {
            addCriterion("drugSimpleDesc >=", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescLessThan(String value) {
            addCriterion("drugSimpleDesc <", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescLessThanOrEqualTo(String value) {
            addCriterion("drugSimpleDesc <=", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescLike(String value) {
            addCriterion("drugSimpleDesc like", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescNotLike(String value) {
            addCriterion("drugSimpleDesc not like", value, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescIn(List<String> values) {
            addCriterion("drugSimpleDesc in", values, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescNotIn(List<String> values) {
            addCriterion("drugSimpleDesc not in", values, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescBetween(String value1, String value2) {
            addCriterion("drugSimpleDesc between", value1, value2, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugsimpledescNotBetween(String value1, String value2) {
            addCriterion("drugSimpleDesc not between", value1, value2, "drugsimpledesc");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateIsNull() {
            addCriterion("drugMakeDate is null");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateIsNotNull() {
            addCriterion("drugMakeDate is not null");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateEqualTo(Date value) {
            addCriterionForJDBCDate("drugMakeDate =", value, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("drugMakeDate <>", value, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateGreaterThan(Date value) {
            addCriterionForJDBCDate("drugMakeDate >", value, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("drugMakeDate >=", value, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateLessThan(Date value) {
            addCriterionForJDBCDate("drugMakeDate <", value, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("drugMakeDate <=", value, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateIn(List<Date> values) {
            addCriterionForJDBCDate("drugMakeDate in", values, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("drugMakeDate not in", values, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("drugMakeDate between", value1, value2, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugmakedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("drugMakeDate not between", value1, value2, "drugmakedate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateIsNull() {
            addCriterion("drugEXPDate is null");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateIsNotNull() {
            addCriterion("drugEXPDate is not null");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateEqualTo(Date value) {
            addCriterionForJDBCDate("drugEXPDate =", value, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("drugEXPDate <>", value, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("drugEXPDate >", value, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("drugEXPDate >=", value, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateLessThan(Date value) {
            addCriterionForJDBCDate("drugEXPDate <", value, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("drugEXPDate <=", value, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateIn(List<Date> values) {
            addCriterionForJDBCDate("drugEXPDate in", values, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("drugEXPDate not in", values, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("drugEXPDate between", value1, value2, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugexpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("drugEXPDate not between", value1, value2, "drugexpdate");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeIsNull() {
            addCriterion("drugQualityTime is null");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeIsNotNull() {
            addCriterion("drugQualityTime is not null");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeEqualTo(Integer value) {
            addCriterion("drugQualityTime =", value, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeNotEqualTo(Integer value) {
            addCriterion("drugQualityTime <>", value, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeGreaterThan(Integer value) {
            addCriterion("drugQualityTime >", value, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugQualityTime >=", value, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeLessThan(Integer value) {
            addCriterion("drugQualityTime <", value, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeLessThanOrEqualTo(Integer value) {
            addCriterion("drugQualityTime <=", value, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeIn(List<Integer> values) {
            addCriterion("drugQualityTime in", values, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeNotIn(List<Integer> values) {
            addCriterion("drugQualityTime not in", values, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeBetween(Integer value1, Integer value2) {
            addCriterion("drugQualityTime between", value1, value2, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugqualitytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("drugQualityTime not between", value1, value2, "drugqualitytime");
            return (Criteria) this;
        }

        public Criteria andDrugdescIsNull() {
            addCriterion("drugDesc is null");
            return (Criteria) this;
        }

        public Criteria andDrugdescIsNotNull() {
            addCriterion("drugDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDrugdescEqualTo(String value) {
            addCriterion("drugDesc =", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescNotEqualTo(String value) {
            addCriterion("drugDesc <>", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescGreaterThan(String value) {
            addCriterion("drugDesc >", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescGreaterThanOrEqualTo(String value) {
            addCriterion("drugDesc >=", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescLessThan(String value) {
            addCriterion("drugDesc <", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescLessThanOrEqualTo(String value) {
            addCriterion("drugDesc <=", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescLike(String value) {
            addCriterion("drugDesc like", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescNotLike(String value) {
            addCriterion("drugDesc not like", value, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescIn(List<String> values) {
            addCriterion("drugDesc in", values, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescNotIn(List<String> values) {
            addCriterion("drugDesc not in", values, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescBetween(String value1, String value2) {
            addCriterion("drugDesc between", value1, value2, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugdescNotBetween(String value1, String value2) {
            addCriterion("drugDesc not between", value1, value2, "drugdesc");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmIsNull() {
            addCriterion("drugMakeFirm is null");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmIsNotNull() {
            addCriterion("drugMakeFirm is not null");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmEqualTo(String value) {
            addCriterion("drugMakeFirm =", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmNotEqualTo(String value) {
            addCriterion("drugMakeFirm <>", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmGreaterThan(String value) {
            addCriterion("drugMakeFirm >", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmGreaterThanOrEqualTo(String value) {
            addCriterion("drugMakeFirm >=", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmLessThan(String value) {
            addCriterion("drugMakeFirm <", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmLessThanOrEqualTo(String value) {
            addCriterion("drugMakeFirm <=", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmLike(String value) {
            addCriterion("drugMakeFirm like", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmNotLike(String value) {
            addCriterion("drugMakeFirm not like", value, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmIn(List<String> values) {
            addCriterion("drugMakeFirm in", values, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmNotIn(List<String> values) {
            addCriterion("drugMakeFirm not in", values, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmBetween(String value1, String value2) {
            addCriterion("drugMakeFirm between", value1, value2, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugmakefirmNotBetween(String value1, String value2) {
            addCriterion("drugMakeFirm not between", value1, value2, "drugmakefirm");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainIsNull() {
            addCriterion("drugEatExplain is null");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainIsNotNull() {
            addCriterion("drugEatExplain is not null");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainEqualTo(String value) {
            addCriterion("drugEatExplain =", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainNotEqualTo(String value) {
            addCriterion("drugEatExplain <>", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainGreaterThan(String value) {
            addCriterion("drugEatExplain >", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainGreaterThanOrEqualTo(String value) {
            addCriterion("drugEatExplain >=", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainLessThan(String value) {
            addCriterion("drugEatExplain <", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainLessThanOrEqualTo(String value) {
            addCriterion("drugEatExplain <=", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainLike(String value) {
            addCriterion("drugEatExplain like", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainNotLike(String value) {
            addCriterion("drugEatExplain not like", value, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainIn(List<String> values) {
            addCriterion("drugEatExplain in", values, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainNotIn(List<String> values) {
            addCriterion("drugEatExplain not in", values, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainBetween(String value1, String value2) {
            addCriterion("drugEatExplain between", value1, value2, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugeatexplainNotBetween(String value1, String value2) {
            addCriterion("drugEatExplain not between", value1, value2, "drugeatexplain");
            return (Criteria) this;
        }

        public Criteria andDrugnumIsNull() {
            addCriterion("drugNum is null");
            return (Criteria) this;
        }

        public Criteria andDrugnumIsNotNull() {
            addCriterion("drugNum is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnumEqualTo(Integer value) {
            addCriterion("drugNum =", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumNotEqualTo(Integer value) {
            addCriterion("drugNum <>", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumGreaterThan(Integer value) {
            addCriterion("drugNum >", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugNum >=", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumLessThan(Integer value) {
            addCriterion("drugNum <", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumLessThanOrEqualTo(Integer value) {
            addCriterion("drugNum <=", value, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumIn(List<Integer> values) {
            addCriterion("drugNum in", values, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumNotIn(List<Integer> values) {
            addCriterion("drugNum not in", values, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumBetween(Integer value1, Integer value2) {
            addCriterion("drugNum between", value1, value2, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDrugnumNotBetween(Integer value1, Integer value2) {
            addCriterion("drugNum not between", value1, value2, "drugnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumIsNull() {
            addCriterion("drugLastNum is null");
            return (Criteria) this;
        }

        public Criteria andDruglastnumIsNotNull() {
            addCriterion("drugLastNum is not null");
            return (Criteria) this;
        }

        public Criteria andDruglastnumEqualTo(Integer value) {
            addCriterion("drugLastNum =", value, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumNotEqualTo(Integer value) {
            addCriterion("drugLastNum <>", value, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumGreaterThan(Integer value) {
            addCriterion("drugLastNum >", value, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugLastNum >=", value, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumLessThan(Integer value) {
            addCriterion("drugLastNum <", value, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumLessThanOrEqualTo(Integer value) {
            addCriterion("drugLastNum <=", value, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumIn(List<Integer> values) {
            addCriterion("drugLastNum in", values, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumNotIn(List<Integer> values) {
            addCriterion("drugLastNum not in", values, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumBetween(Integer value1, Integer value2) {
            addCriterion("drugLastNum between", value1, value2, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDruglastnumNotBetween(Integer value1, Integer value2) {
            addCriterion("drugLastNum not between", value1, value2, "druglastnum");
            return (Criteria) this;
        }

        public Criteria andDrugstateIsNull() {
            addCriterion("drugState is null");
            return (Criteria) this;
        }

        public Criteria andDrugstateIsNotNull() {
            addCriterion("drugState is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstateEqualTo(Integer value) {
            addCriterion("drugState =", value, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateNotEqualTo(Integer value) {
            addCriterion("drugState <>", value, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateGreaterThan(Integer value) {
            addCriterion("drugState >", value, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugState >=", value, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateLessThan(Integer value) {
            addCriterion("drugState <", value, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateLessThanOrEqualTo(Integer value) {
            addCriterion("drugState <=", value, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateIn(List<Integer> values) {
            addCriterion("drugState in", values, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateNotIn(List<Integer> values) {
            addCriterion("drugState not in", values, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateBetween(Integer value1, Integer value2) {
            addCriterion("drugState between", value1, value2, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugstateNotBetween(Integer value1, Integer value2) {
            addCriterion("drugState not between", value1, value2, "drugstate");
            return (Criteria) this;
        }

        public Criteria andDrugremarkIsNull() {
            addCriterion("drugRemark is null");
            return (Criteria) this;
        }

        public Criteria andDrugremarkIsNotNull() {
            addCriterion("drugRemark is not null");
            return (Criteria) this;
        }

        public Criteria andDrugremarkEqualTo(String value) {
            addCriterion("drugRemark =", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotEqualTo(String value) {
            addCriterion("drugRemark <>", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkGreaterThan(String value) {
            addCriterion("drugRemark >", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkGreaterThanOrEqualTo(String value) {
            addCriterion("drugRemark >=", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkLessThan(String value) {
            addCriterion("drugRemark <", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkLessThanOrEqualTo(String value) {
            addCriterion("drugRemark <=", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkLike(String value) {
            addCriterion("drugRemark like", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotLike(String value) {
            addCriterion("drugRemark not like", value, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkIn(List<String> values) {
            addCriterion("drugRemark in", values, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotIn(List<String> values) {
            addCriterion("drugRemark not in", values, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkBetween(String value1, String value2) {
            addCriterion("drugRemark between", value1, value2, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugremarkNotBetween(String value1, String value2) {
            addCriterion("drugRemark not between", value1, value2, "drugremark");
            return (Criteria) this;
        }

        public Criteria andDrugdelIsNull() {
            addCriterion("drugDel is null");
            return (Criteria) this;
        }

        public Criteria andDrugdelIsNotNull() {
            addCriterion("drugDel is not null");
            return (Criteria) this;
        }

        public Criteria andDrugdelEqualTo(Integer value) {
            addCriterion("drugDel =", value, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelNotEqualTo(Integer value) {
            addCriterion("drugDel <>", value, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelGreaterThan(Integer value) {
            addCriterion("drugDel >", value, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugDel >=", value, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelLessThan(Integer value) {
            addCriterion("drugDel <", value, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelLessThanOrEqualTo(Integer value) {
            addCriterion("drugDel <=", value, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelIn(List<Integer> values) {
            addCriterion("drugDel in", values, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelNotIn(List<Integer> values) {
            addCriterion("drugDel not in", values, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelBetween(Integer value1, Integer value2) {
            addCriterion("drugDel between", value1, value2, "drugdel");
            return (Criteria) this;
        }

        public Criteria andDrugdelNotBetween(Integer value1, Integer value2) {
            addCriterion("drugDel not between", value1, value2, "drugdel");
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