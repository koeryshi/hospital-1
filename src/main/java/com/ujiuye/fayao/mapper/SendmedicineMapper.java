package com.ujiuye.fayao.mapper;

import com.ujiuye.fayao.bean.Sendmedicine;
import com.ujiuye.fayao.bean.SendmedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendmedicineMapper {
    int countByExample(SendmedicineExample example);

    int deleteByExample(SendmedicineExample example);

    int deleteByPrimaryKey(Integer sendmedid);

    int insert(Sendmedicine record);

    int insertSelective(Sendmedicine record);

    List<Sendmedicine> selectByExample(SendmedicineExample example);

    Sendmedicine selectByPrimaryKey(Integer sendmedid);

    int updateByExampleSelective(@Param("record") Sendmedicine record, @Param("example") SendmedicineExample example);

    int updateByExample(@Param("record") Sendmedicine record, @Param("example") SendmedicineExample example);

    int updateByPrimaryKeySelective(Sendmedicine record);

    int updateByPrimaryKey(Sendmedicine record);
}