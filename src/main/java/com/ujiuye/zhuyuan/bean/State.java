package com.ujiuye.zhuyuan.bean;

public class State {
    private Integer stateid;

    private String statename;

    private Integer statedel;

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename == null ? null : statename.trim();
    }

    public Integer getStatedel() {
        return statedel;
    }

    public void setStatedel(Integer statedel) {
        this.statedel = statedel;
    }
}