package com.ujiuye.shoufei.bean;

import java.util.Date;

public class Checkcharge {
    private Integer ccid;

    private String behpid;

    private Double ccmoney;

    private Double cclastmoney;

    private Integer ccdel;

    private Integer ccCpId;

    private Integer ccTcId;

    private Date createtime;

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public String getBehpid() {
        return behpid;
    }

    public void setBehpid(String behpid) {
        this.behpid = behpid == null ? null : behpid.trim();
    }

    public Double getCcmoney() {
        return ccmoney;
    }

    public void setCcmoney(Double ccmoney) {
        this.ccmoney = ccmoney;
    }

    public Double getCclastmoney() {
        return cclastmoney;
    }

    public void setCclastmoney(Double cclastmoney) {
        this.cclastmoney = cclastmoney;
    }

    public Integer getCcdel() {
        return ccdel;
    }

    public void setCcdel(Integer ccdel) {
        this.ccdel = ccdel;
    }

    public Integer getCcCpId() {
        return ccCpId;
    }

    public void setCcCpId(Integer ccCpId) {
        this.ccCpId = ccCpId;
    }

    public Integer getCcTcId() {
        return ccTcId;
    }

    public void setCcTcId(Integer ccTcId) {
        this.ccTcId = ccTcId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}