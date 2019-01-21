package com.ujiuye.shoufei.mapper;

import com.ujiuye.shoufei.bean.Hrcheckcharge;
import com.ujiuye.shoufei.bean.HrcheckchargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrcheckchargeMapper {
    int countByExample(HrcheckchargeExample example);

    int deleteByExample(HrcheckchargeExample example);

    int deleteByPrimaryKey(Integer cuid);

    int insert(Hrcheckcharge record);

    int insertSelective(Hrcheckcharge record);

    List<Hrcheckcharge> selectByExample(HrcheckchargeExample example);

    Hrcheckcharge selectByPrimaryKey(Integer cuid);

    int updateByExampleSelective(@Param("record") Hrcheckcharge record, @Param("example") HrcheckchargeExample example);

    int updateByExample(@Param("record") Hrcheckcharge record, @Param("example") HrcheckchargeExample example);

    int updateByPrimaryKeySelective(Hrcheckcharge record);

    int updateByPrimaryKey(Hrcheckcharge record);
}