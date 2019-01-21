package com.ujiuye.fayao.bean;

import java.util.Date;

public class Drug {
    private Integer drugid;

    private String drugcode;

    private String drugimgname;

    private Double druginprice;

    private Double drugsaleprice;

    private String drugname;

    private String drugtype;

    private String drugsimpledesc;

    private Date drugmakedate;

    private Date drugexpdate;

    private Integer drugqualitytime;

    private String drugdesc;

    private String drugmakefirm;

    private String drugeatexplain;

    private Integer drugnum;

    private Integer druglastnum;

    private Integer drugstate;

    private String drugremark;

    private Integer drugdel;

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public String getDrugcode() {
        return drugcode;
    }

    public void setDrugcode(String drugcode) {
        this.drugcode = drugcode == null ? null : drugcode.trim();
    }

    public String getDrugimgname() {
        return drugimgname;
    }

    public void setDrugimgname(String drugimgname) {
        this.drugimgname = drugimgname == null ? null : drugimgname.trim();
    }

    public Double getDruginprice() {
        return druginprice;
    }

    public void setDruginprice(Double druginprice) {
        this.druginprice = druginprice;
    }

    public Double getDrugsaleprice() {
        return drugsaleprice;
    }

    public void setDrugsaleprice(Double drugsaleprice) {
        this.drugsaleprice = drugsaleprice;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public String getDrugtype() {
        return drugtype;
    }

    public void setDrugtype(String drugtype) {
        this.drugtype = drugtype == null ? null : drugtype.trim();
    }

    public String getDrugsimpledesc() {
        return drugsimpledesc;
    }

    public void setDrugsimpledesc(String drugsimpledesc) {
        this.drugsimpledesc = drugsimpledesc == null ? null : drugsimpledesc.trim();
    }

    public Date getDrugmakedate() {
        return drugmakedate;
    }

    public void setDrugmakedate(Date drugmakedate) {
        this.drugmakedate = drugmakedate;
    }

    public Date getDrugexpdate() {
        return drugexpdate;
    }

    public void setDrugexpdate(Date drugexpdate) {
        this.drugexpdate = drugexpdate;
    }

    public Integer getDrugqualitytime() {
        return drugqualitytime;
    }

    public void setDrugqualitytime(Integer drugqualitytime) {
        this.drugqualitytime = drugqualitytime;
    }

    public String getDrugdesc() {
        return drugdesc;
    }

    public void setDrugdesc(String drugdesc) {
        this.drugdesc = drugdesc == null ? null : drugdesc.trim();
    }

    public String getDrugmakefirm() {
        return drugmakefirm;
    }

    public void setDrugmakefirm(String drugmakefirm) {
        this.drugmakefirm = drugmakefirm == null ? null : drugmakefirm.trim();
    }

    public String getDrugeatexplain() {
        return drugeatexplain;
    }

    public void setDrugeatexplain(String drugeatexplain) {
        this.drugeatexplain = drugeatexplain == null ? null : drugeatexplain.trim();
    }

    public Integer getDrugnum() {
        return drugnum;
    }

    public void setDrugnum(Integer drugnum) {
        this.drugnum = drugnum;
    }

    public Integer getDruglastnum() {
        return druglastnum;
    }

    public void setDruglastnum(Integer druglastnum) {
        this.druglastnum = druglastnum;
    }

    public Integer getDrugstate() {
        return drugstate;
    }

    public void setDrugstate(Integer drugstate) {
        this.drugstate = drugstate;
    }

    public String getDrugremark() {
        return drugremark;
    }

    public void setDrugremark(String drugremark) {
        this.drugremark = drugremark == null ? null : drugremark.trim();
    }

    public Integer getDrugdel() {
        return drugdel;
    }

    public void setDrugdel(Integer drugdel) {
        this.drugdel = drugdel;
    }
}