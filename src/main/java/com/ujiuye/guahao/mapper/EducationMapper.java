package com.ujiuye.guahao.mapper;

import com.ujiuye.guahao.bean.Education;
import com.ujiuye.guahao.bean.EducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper {
    int countByExample(EducationExample example);

    int deleteByExample(EducationExample example);

    int deleteByPrimaryKey(Integer eduid);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(Integer eduid);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}