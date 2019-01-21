package com.ujiuye.guahao.bean;

import java.util.Date;

public class Doctor {
    private Integer did;

    private String dname;

    private String didcard;

    private String dphone;

    private String dtell;

    private Integer dsex;

    private Integer dage;

    private Date dbirth;

    private String demail;

    private Date dinnerdate;

    private String dremark;

    private Integer ddel;

    private Integer dDepartId;

    private Integer dEduId;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDidcard() {
        return didcard;
    }

    public void setDidcard(String didcard) {
        this.didcard = didcard == null ? null : didcard.trim();
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone == null ? null : dphone.trim();
    }

    public String getDtell() {
        return dtell;
    }

    public void setDtell(String dtell) {
        this.dtell = dtell == null ? null : dtell.trim();
    }

    public Integer getDsex() {
        return dsex;
    }

    public void setDsex(Integer dsex) {
        this.dsex = dsex;
    }

    public Integer getDage() {
        return dage;
    }

    public void setDage(Integer dage) {
        this.dage = dage;
    }

    public Date getDbirth() {
        return dbirth;
    }

    public void setDbirth(Date dbirth) {
        this.dbirth = dbirth;
    }

    public String getDemail() {
        return demail;
    }

    public void setDemail(String demail) {
        this.demail = demail == null ? null : demail.trim();
    }

    public Date getDinnerdate() {
        return dinnerdate;
    }

    public void setDinnerdate(Date dinnerdate) {
        this.dinnerdate = dinnerdate;
    }

    public String getDremark() {
        return dremark;
    }

    public void setDremark(String dremark) {
        this.dremark = dremark == null ? null : dremark.trim();
    }

    public Integer getDdel() {
        return ddel;
    }

    public void setDdel(Integer ddel) {
        this.ddel = ddel;
    }

    public Integer getdDepartId() {
        return dDepartId;
    }

    public void setdDepartId(Integer dDepartId) {
        this.dDepartId = dDepartId;
    }

    public Integer getdEduId() {
        return dEduId;
    }

    public void setdEduId(Integer dEduId) {
        this.dEduId = dEduId;
    }
}