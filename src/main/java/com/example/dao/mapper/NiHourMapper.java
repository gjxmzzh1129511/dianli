package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.NiHour;
import com.example.model.studentmanager.NiHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NiHourMapper {
    long countByExample(NiHourExample example);

    int deleteByExample(NiHourExample example);

    int insert(NiHour record);

    int insertSelective(NiHour record);

    List<NiHour> selectByExampleWithBLOBs(NiHourExample example);

    List<NiHour> selectByExample(NiHourExample example);

    int updateByExampleSelective(@Param("record") NiHour record, @Param("example") NiHourExample example);

    int updateByExampleWithBLOBs(@Param("record") NiHour record, @Param("example") NiHourExample example);

    int updateByExample(@Param("record") NiHour record, @Param("example") NiHourExample example);

    List<NiHour> niselecthour();
}