package com.ujiuye.guahao.mapper;

import com.ujiuye.guahao.bean.Hosregister;
import com.ujiuye.guahao.bean.HosregisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HosregisterMapper {
    int countByExample(HosregisterExample example);

    int deleteByExample(HosregisterExample example);

    int deleteByPrimaryKey(Integer hosrid);

    int insert(Hosregister record);

    int insertSelective(Hosregister record);

    List<Hosregister> selectByExample(HosregisterExample example);

    Hosregister selectByPrimaryKey(Integer hosrid);

    int updateByExampleSelective(@Param("record") Hosregister record, @Param("example") HosregisterExample example);

    int updateByExample(@Param("record") Hosregister record, @Param("example") HosregisterExample example);

    int updateByPrimaryKeySelective(Hosregister record);

    int updateByPrimaryKey(Hosregister record);
}