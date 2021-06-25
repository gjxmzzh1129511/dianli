package com.example.dao.mapper;

import com.example.model.studentmanager.TotalYear;
import com.example.model.studentmanager.TotalYearExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TotalYearMapper {
    long countByExample(TotalYearExample example);

    int deleteByExample(TotalYearExample example);

    int insert(TotalYear record);

    int insertSelective(TotalYear record);

    List<TotalYear> selectByExampleWithBLOBs(TotalYearExample example);

    List<TotalYear> selectByExample(TotalYearExample example);

    int updateByExampleSelective(@Param("record") TotalYear record, @Param("example") TotalYearExample example);

    int updateByExampleWithBLOBs(@Param("record") TotalYear record, @Param("example") TotalYearExample example);

    int updateByExample(@Param("record") TotalYear record, @Param("example") TotalYearExample example);
}