package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.DeokHour;
import com.example.model.studentmanager.DeokHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DeokHourMapper {
    long countByExample(DeokHourExample example);

    int deleteByExample(DeokHourExample example);

    int insert(DeokHour record);

    int insertSelective(DeokHour record);

    List<DeokHour> selectByExampleWithBLOBs(DeokHourExample example);

    List<DeokHour> selectByExample(DeokHourExample example);

    int updateByExampleSelective(@Param("record") DeokHour record, @Param("example") DeokHourExample example);

    int updateByExampleWithBLOBs(@Param("record") DeokHour record, @Param("example") DeokHourExample example);

    int updateByExample(@Param("record") DeokHour record, @Param("example") DeokHourExample example);

    List<DeokHour> deokselecthour();
}