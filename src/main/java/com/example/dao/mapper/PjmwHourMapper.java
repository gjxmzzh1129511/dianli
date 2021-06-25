package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.PjmwHour;
import com.example.model.studentmanager.PjmwHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PjmwHourMapper {
    long countByExample(PjmwHourExample example);

    int deleteByExample(PjmwHourExample example);

    int insert(PjmwHour record);

    int insertSelective(PjmwHour record);

    List<PjmwHour> selectByExampleWithBLOBs(PjmwHourExample example);

    List<PjmwHour> selectByExample(PjmwHourExample example);

    int updateByExampleSelective(@Param("record") PjmwHour record, @Param("example") PjmwHourExample example);

    int updateByExampleWithBLOBs(@Param("record") PjmwHour record, @Param("example") PjmwHourExample example);

    int updateByExample(@Param("record") PjmwHour record, @Param("example") PjmwHourExample example);

    List<PjmwHour> pjmwselecthour();
}