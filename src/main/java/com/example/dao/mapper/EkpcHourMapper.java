package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.EkpcHour;
import com.example.model.studentmanager.EkpcHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EkpcHourMapper {
    long countByExample(EkpcHourExample example);

    int deleteByExample(EkpcHourExample example);

    int insert(EkpcHour record);

    int insertSelective(EkpcHour record);

    List<EkpcHour> selectByExampleWithBLOBs(EkpcHourExample example);

    List<EkpcHour> selectByExample(EkpcHourExample example);

    int updateByExampleSelective(@Param("record") EkpcHour record, @Param("example") EkpcHourExample example);

    int updateByExampleWithBLOBs(@Param("record") EkpcHour record, @Param("example") EkpcHourExample example);

    int updateByExample(@Param("record") EkpcHour record, @Param("example") EkpcHourExample example);

    List<EkpcHour> ekpcselecthour();
}