package com.ujiuye.zhuyuan.mapper;

import com.ujiuye.zhuyuan.bean.Behospitalinfo;
import com.ujiuye.zhuyuan.bean.BehospitalinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BehospitalinfoMapper {
    int countByExample(BehospitalinfoExample example);

    int deleteByExample(BehospitalinfoExample example);

    int deleteByPrimaryKey(Integer bhid);

    int insert(Behospitalinfo record);

    int insertSelective(Behospitalinfo record);

    List<Behospitalinfo> selectByExample(BehospitalinfoExample example);

    Behospitalinfo selectByPrimaryKey(Integer bhid);

    int updateByExampleSelective(@Param("record") Behospitalinfo record, @Param("example") BehospitalinfoExample example);

    int updateByExample(@Param("record") Behospitalinfo record, @Param("example") BehospitalinfoExample example);

    int updateByPrimaryKeySelective(Behospitalinfo record);

    int updateByPrimaryKey(Behospitalinfo record);
}