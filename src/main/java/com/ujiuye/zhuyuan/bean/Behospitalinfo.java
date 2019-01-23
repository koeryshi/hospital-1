package com.ujiuye.zhuyuan.bean;

import com.ujiuye.guahao.bean.Department;
import com.ujiuye.guahao.bean.Doctor;
import com.ujiuye.guahao.bean.Hosregister;
import org.springframework.web.servlet.tags.Param;

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

    private  String date1;
    private String date2;

    //关联挂号表
    private Hosregister hosregister;

    //关联医生表
    private Doctor doctor;

    //关联科室表
    private Department department;

    //关联状态表
    private State state;

    private Param param;

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public Param getParam() {
        return param;
    }

    public void setParam(Param param) {
        this.param = param;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Hosregister getHosregister() {
        return hosregister;
    }

    public void setHosregister(Hosregister hosregister) {
        this.hosregister = hosregister;
    }

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

    @Override
    public String toString() {
        return "Behospitalinfo{" +
                "bhid=" + bhid +
                ", behpid='" + behpid + '\'' +
                ", behpname='" + behpname + '\'' +
                ", behpbed='" + behpbed + '\'' +
                ", behpmoney=" + behpmoney +
                ", behpDocId=" + behpDocId +
                ", behpdate=" + behpdate +
                ", hehpDepartId=" + hehpDepartId +
                ", behpStateId=" + behpStateId +
                ", hehpdel=" + hehpdel +
                ", behpillness='" + behpillness + '\'' +
                ", hehpnurse='" + hehpnurse + '\'' +
                ", behpHosrId=" + behpHosrId +
                ", behpTcid=" + behpTcid +
                '}';
    }
}