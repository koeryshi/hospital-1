package com.ujiuye.zhuyuan.service;

import com.ujiuye.zhuyuan.bean.Behospitalinfo;
import com.ujiuye.zhuyuan.bean.BehospitalinfoExample;

import java.util.List;

public interface BeHospitalInfoService {

    public List<Behospitalinfo> selectBeHospitalInfo(BehospitalinfoExample behospitalinfoExample);



}
