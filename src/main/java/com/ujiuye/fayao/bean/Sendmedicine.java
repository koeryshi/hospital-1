package com.ujiuye.fayao.bean;

import java.util.Date;

public class Sendmedicine {
    private Integer sendmedid;

    private String hehpid;

    private Integer smdrugnum;

    private Integer smsendnum;

    private Integer smnosendnum;

    private Date smsenddate;

    private Integer smdel;

    private Integer smDrugId;

    private Integer smTcId;

    public Integer getSendmedid() {
        return sendmedid;
    }

    public void setSendmedid(Integer sendmedid) {
        this.sendmedid = sendmedid;
    }

    public String getHehpid() {
        return hehpid;
    }

    public void setHehpid(String hehpid) {
        this.hehpid = hehpid == null ? null : hehpid.trim();
    }

    public Integer getSmdrugnum() {
        return smdrugnum;
    }

    public void setSmdrugnum(Integer smdrugnum) {
        this.smdrugnum = smdrugnum;
    }

    public Integer getSmsendnum() {
        return smsendnum;
    }

    public void setSmsendnum(Integer smsendnum) {
        this.smsendnum = smsendnum;
    }

    public Integer getSmnosendnum() {
        return smnosendnum;
    }

    public void setSmnosendnum(Integer smnosendnum) {
        this.smnosendnum = smnosendnum;
    }

    public Date getSmsenddate() {
        return smsenddate;
    }

    public void setSmsenddate(Date smsenddate) {
        this.smsenddate = smsenddate;
    }

    public Integer getSmdel() {
        return smdel;
    }

    public void setSmdel(Integer smdel) {
        this.smdel = smdel;
    }

    public Integer getSmDrugId() {
        return smDrugId;
    }

    public void setSmDrugId(Integer smDrugId) {
        this.smDrugId = smDrugId;
    }

    public Integer getSmTcId() {
        return smTcId;
    }

    public void setSmTcId(Integer smTcId) {
        this.smTcId = smTcId;
    }
}