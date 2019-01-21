package com.ujiuye.user.bean;

public class Menu {
    private Integer menuid;

    private String menuname;

    private String menuurl;

    private Integer menustate;

    private Integer menudel;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public Integer getMenustate() {
        return menustate;
    }

    public void setMenustate(Integer menustate) {
        this.menustate = menustate;
    }

    public Integer getMenudel() {
        return menudel;
    }

    public void setMenudel(Integer menudel) {
        this.menudel = menudel;
    }
}