package com.ujiuye.guahao.bean;

public class Department {
    private Integer departid;

    private String departname;

    private Integer departdel;

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    public Integer getDepartdel() {
        return departdel;
    }

    public void setDepartdel(Integer departdel) {
        this.departdel = departdel;
    }
}