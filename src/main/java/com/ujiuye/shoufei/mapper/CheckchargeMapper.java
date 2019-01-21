package com.ujiuye.shoufei.mapper;

import com.ujiuye.shoufei.bean.Checkcharge;
import com.ujiuye.shoufei.bean.CheckchargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckchargeMapper {
    int countByExample(CheckchargeExample example);

    int deleteByExample(CheckchargeExample example);

    int deleteByPrimaryKey(Integer ccid);

    int insert(Checkcharge record);

    int insertSelective(Checkcharge record);

    List<Checkcharge> selectByExample(CheckchargeExample example);

    Checkcharge selectByPrimaryKey(Integer ccid);

    int updateByExampleSelective(@Param("record") Checkcharge record, @Param("example") CheckchargeExample example);

    int updateByExample(@Param("record") Checkcharge record, @Param("example") CheckchargeExample example);

    int updateByPrimaryKeySelective(Checkcharge record);

    int updateByPrimaryKey(Checkcharge record);
}