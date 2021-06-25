package com.example.dao.mapper;

import com.example.model.studentmanager.PjmloadHour;
import com.example.model.studentmanager.PjmloadHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PjmloadHourMapper {
    long countByExample(PjmloadHourExample example);

    int deleteByExample(PjmloadHourExample example);

    int insert(PjmloadHour record);

    int insertSelective(PjmloadHour record);

    List<PjmloadHour> selectByExampleWithBLOBs(PjmloadHourExample example);

    List<PjmloadHour> selectByExample(PjmloadHourExample example);

    int updateByExampleSelective(@Param("record") PjmloadHour record, @Param("example") PjmloadHourExample example);

    int updateByExampleWithBLOBs(@Param("record") PjmloadHour record, @Param("example") PjmloadHourExample example);

    int updateByExample(@Param("record") PjmloadHour record, @Param("example") PjmloadHourExample example);

    List<PjmloadHour> pjmloadselecthour();
}