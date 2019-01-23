package com.ujiuye.guahao.mapper;

import com.ujiuye.guahao.bean.Doctor;
import com.ujiuye.guahao.bean.DoctorExample;
import java.util.List;

import com.ujiuye.zhuyuan.bean.Behospitalinfo;
import com.ujiuye.zhuyuan.bean.BehospitalinfoExample;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

}