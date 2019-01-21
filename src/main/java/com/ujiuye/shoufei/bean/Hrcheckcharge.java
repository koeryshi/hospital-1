package com.ujiuye.shoufei.bean;

import java.util.Date;

public class Hrcheckcharge {
    private Integer cuid;

    private String behpid;

    private String behpname;

    private String cmname;

    private Double cmmoney;

    private Date cmdate;

    private Integer hccdel;

    private Integer cmstate;

    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
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

    public Integer getHccdel() {
        return hccdel;
    }

    public void setHccdel(Integer hccdel) {
        this.hccdel = hccdel;
    }

    public Integer getCmstate() {
        return cmstate;
    }

    public void setCmstate(Integer cmstate) {
        this.cmstate = cmstate;
    }
}