package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.DomHour;
import com.example.model.studentmanager.DomHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DomHourMapper {
    long countByExample(DomHourExample example);

    int deleteByExample(DomHourExample example);

    int insert(DomHour record);

    int insertSelective(DomHour record);

    List<DomHour> selectByExampleWithBLOBs(DomHourExample example);

    List<DomHour> selectByExample(DomHourExample example);

    int updateByExampleSelective(@Param("record") DomHour record, @Param("example") DomHourExample example);

    int updateByExampleWithBLOBs(@Param("record") DomHour record, @Param("example") DomHourExample example);

    int updateByExample(@Param("record") DomHour record, @Param("example") DomHourExample example);

    List<DomHour> domselecthour();
}