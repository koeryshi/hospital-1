package com.ujiuye.shoufei.mapper;

import com.ujiuye.shoufei.bean.Chargeproject;
import com.ujiuye.shoufei.bean.ChargeprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeprojectMapper {
    int countByExample(ChargeprojectExample example);

    int deleteByExample(ChargeprojectExample example);

    int deleteByPrimaryKey(Integer cmid);

    int insert(Chargeproject record);

    int insertSelective(Chargeproject record);

    List<Chargeproject> selectByExample(ChargeprojectExample example);

    Chargeproject selectByPrimaryKey(Integer cmid);

    int updateByExampleSelective(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByExample(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByPrimaryKeySelective(Chargeproject record);

    int updateByPrimaryKey(Chargeproject record);

    List<Chargeproject> selectByNameforVague(String cmName);
}