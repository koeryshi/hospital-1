package com.ujiuye.shoufei.bean;

import java.util.Date;

public class Chargeproject {
    private Integer cmid;

    private String cmname;

    private Double cmmoney;

    private Date cmdate;

    private Integer cmdel;

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public String getCmname() {
        return cmname;
    }

    public void setCmname(String cmname) {
        this.cmname = cmname == null ? null : cmname.trim();
    }

    public Double getCmmoney() {
        return cmmoney;
    }

    public void setCmmoney(Double cmmoney) {
        this.cmmoney = cmmoney;
    }

    public Date getCmdate() {
        return cmdate;
    }

    public void setCmdate(Date cmdate) {
        this.cmdate = cmdate;
    }

    public Integer getCmdel() {
        return cmdel;
    }

    public void setCmdel(Integer cmdel) {
        this.cmdel = cmdel;
    }

    @Override
    public String toString() {
        return "Chargeproject{" +
                "cmid=" + cmid +
                ", cmname='" + cmname + '\'' +
                ", cmmoney=" + cmmoney +
                ", cmdate=" + cmdate +
                ", cmdel=" + cmdel +
                '}';
    }
}