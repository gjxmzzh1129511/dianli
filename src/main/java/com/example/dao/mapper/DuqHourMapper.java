package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.DuqHour;
import com.example.model.studentmanager.DuqHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DuqHourMapper {
    long countByExample(DuqHourExample example);

    int deleteByExample(DuqHourExample example);

    int insert(DuqHour record);

    int insertSelective(DuqHour record);

    List<DuqHour> selectByExampleWithBLOBs(DuqHourExample example);

    List<DuqHour> selectByExample(DuqHourExample example);

    int updateByExampleSelective(@Param("record") DuqHour record, @Param("example") DuqHourExample example);

    int updateByExampleWithBLOBs(@Param("record") DuqHour record, @Param("example") DuqHourExample example);

    int updateByExample(@Param("record") DuqHour record, @Param("example") DuqHourExample example);

    List<DuqHour> duqselecthour();
}