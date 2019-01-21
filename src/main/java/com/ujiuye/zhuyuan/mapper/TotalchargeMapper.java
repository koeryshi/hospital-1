package com.ujiuye.zhuyuan.mapper;

import com.ujiuye.zhuyuan.bean.Totalcharge;
import com.ujiuye.zhuyuan.bean.TotalchargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalchargeMapper {
    int countByExample(TotalchargeExample example);

    int deleteByExample(TotalchargeExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(Totalcharge record);

    int insertSelective(Totalcharge record);

    List<Totalcharge> selectByExample(TotalchargeExample example);

    Totalcharge selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") Totalcharge record, @Param("example") TotalchargeExample example);

    int updateByExample(@Param("record") Totalcharge record, @Param("example") TotalchargeExample example);

    int updateByPrimaryKeySelective(Totalcharge record);

    int updateByPrimaryKey(Totalcharge record);
}