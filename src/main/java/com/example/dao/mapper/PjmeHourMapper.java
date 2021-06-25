package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.PjmeHour;
import com.example.model.studentmanager.PjmeHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PjmeHourMapper {
    long countByExample(PjmeHourExample example);

    int deleteByExample(PjmeHourExample example);

    int insert(PjmeHour record);

    int insertSelective(PjmeHour record);

    List<PjmeHour> selectByExampleWithBLOBs(PjmeHourExample example);

    List<PjmeHour> selectByExample(PjmeHourExample example);

    int updateByExampleSelective(@Param("record") PjmeHour record, @Param("example") PjmeHourExample example);

    int updateByExampleWithBLOBs(@Param("record") PjmeHour record, @Param("example") PjmeHourExample example);

    int updateByExample(@Param("record") PjmeHour record, @Param("example") PjmeHourExample example);

    List<PjmeHour> pjmeselecthour();
}