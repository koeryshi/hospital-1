package com.ujiuye.zhuyuan.bean;

public class Totalcharge {
    private Integer tcid;

    private String behpid;

    private Double tcmoney;

    private Double tcdrugmoney;

    private Double tccheckmoney;

    private Double tclastmoney;

    private Integer tcbalancestate;

    private Integer tcdel;

    private Integer tcStateId;

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public String getBehpid() {
        return behpid;
    }

    public void setBehpid(String behpid) {
        this.behpid = behpid == null ? null : behpid.trim();
    }

    public Double getTcmoney() {
        return tcmoney;
    }

    public void setTcmoney(Double tcmoney) {
        this.tcmoney = tcmoney;
    }

    public Double getTcdrugmoney() {
        return tcdrugmoney;
    }

    public void setTcdrugmoney(Double tcdrugmoney) {
        this.tcdrugmoney = tcdrugmoney;
    }

    public Double getTccheckmoney() {
        return tccheckmoney;
    }

    public void setTccheckmoney(Double tccheckmoney) {
        this.tccheckmoney = tccheckmoney;
    }

    public Double getTclastmoney() {
        return tclastmoney;
    }

    public void setTclastmoney(Double tclastmoney) {
        this.tclastmoney = tclastmoney;
    }

    public Integer getTcbalancestate() {
        return tcbalancestate;
    }

    public void setTcbalancestate(Integer tcbalancestate) {
        this.tcbalancestate = tcbalancestate;
    }

    public Integer getTcdel() {
        return tcdel;
    }

    public void setTcdel(Integer tcdel) {
        this.tcdel = tcdel;
    }

    public Integer getTcStateId() {
        return tcStateId;
    }

    public void setTcStateId(Integer tcStateId) {
        this.tcStateId = tcStateId;
    }
}