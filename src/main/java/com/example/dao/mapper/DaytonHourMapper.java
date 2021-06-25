package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.DaytonHour;
import com.example.model.studentmanager.DaytonHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DaytonHourMapper {
    long countByExample(DaytonHourExample example);

    int deleteByExample(DaytonHourExample example);

    int insert(DaytonHour record);

    int insertSelective(DaytonHour record);

    List<DaytonHour> selectByExampleWithBLOBs(DaytonHourExample example);

    List<DaytonHour> selectByExample(DaytonHourExample example);

    int updateByExampleSelective(@Param("record") DaytonHour record, @Param("example") DaytonHourExample example);

    int updateByExampleWithBLOBs(@Param("record") DaytonHour record, @Param("example") DaytonHourExample example);

    int updateByExample(@Param("record") DaytonHour record, @Param("example") DaytonHourExample example);

    List<DaytonHour> daytonselecthour();
}