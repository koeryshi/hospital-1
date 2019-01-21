package com.ujiuye.guahao.bean;

public class Education {
    private Integer eduid;

    private String eduname;

    private Integer edudel;

    public Integer getEduid() {
        return eduid;
    }

    public void setEduid(Integer eduid) {
        this.eduid = eduid;
    }

    public String getEduname() {
        return eduname;
    }

    public void setEduname(String eduname) {
        this.eduname = eduname == null ? null : eduname.trim();
    }

    public Integer getEdudel() {
        return edudel;
    }

    public void setEdudel(Integer edudel) {
        this.edudel = edudel;
    }
}