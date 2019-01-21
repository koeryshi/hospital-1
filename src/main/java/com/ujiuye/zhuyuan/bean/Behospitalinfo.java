package com.ujiuye.zhuyuan.bean;

import java.util.Date;

public class Behospitalinfo {
    private Integer bhid;

    private String behpid;

    private String behpname;

    private String behpbed;

    private Double behpmoney;

    private Integer behpDocId;

    private Date behpdate;

    private Integer hehpDepartId;

    private Integer behpStateId;

    private Integer hehpdel;

    private String behpillness;

    private String hehpnurse;

    private Integer behpHosrId;

    private Integer behpTcid;

    public Integer getBhid() {
        return bhid;
    }

    public void setBhid(Integer bhid) {
        this.bhid = bhid;
    }

    public String getBehpid() {
        return behpid;
    }

    public void setBehpid(String behpid) {
        this.behpid = behpid == null ? null : behpid.trim();
    }

    public String getBehpname() {
        return behpname;
    }

    public void setBehpname(String behpname) {
        this.behpname = behpname == null ? null : behpname.trim();
    }

    public String getBehpbed() {
        return behpbed;
    }

    public void setBehpbed(String behpbed) {
        this.behpbed = behpbed == null ? null : behpbed.trim();
    }

    public Double getBehpmoney() {
        return behpmoney;
    }

    public void setBehpmoney(Double behpmoney) {
        this.behpmoney = behpmoney;
    }

    public Integer getBehpDocId() {
        return behpDocId;
    }

    public void setBehpDocId(Integer behpDocId) {
        this.behpDocId = behpDocId;
    }

    public Date getBehpdate() {
        return behpdate;
    }

    public void setBehpdate(Date behpdate) {
        this.behpdate = behpdate;
    }

    public Integer getHehpDepartId() {
        return hehpDepartId;
    }

    public void setHehpDepartId(Integer hehpDepartId) {
        this.hehpDepartId = hehpDepartId;
    }

    public Integer getBehpStateId() {
        return behpStateId;
    }

    public void setBehpStateId(Integer behpStateId) {
        this.behpStateId = behpStateId;
    }

    public Integer getHehpdel() {
        return hehpdel;
    }

    public void setHehpdel(Integer hehpdel) {
        this.hehpdel = hehpdel;
    }

    public String getBehpillness() {
        return behpillness;
    }

    public void setBehpillness(String behpillness) {
        this.behpillness = behpillness == null ? null : behpillness.trim();
    }

    public String getHehpnurse() {
        return hehpnurse;
    }

    public void setHehpnurse(String hehpnurse) {
        this.hehpnurse = hehpnurse == null ? null : hehpnurse.trim();
    }

    public Integer getBehpHosrId() {
        return behpHosrId;
    }

    public void setBehpHosrId(Integer behpHosrId) {
        this.behpHosrId = behpHosrId;
    }

    public Integer getBehpTcid() {
        return behpTcid;
    }

    public void setBehpTcid(Integer behpTcid) {
        this.behpTcid = behpTcid;
    }
}