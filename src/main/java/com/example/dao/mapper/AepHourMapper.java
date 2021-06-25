package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.AepHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AepHourMapper {
    long countByExample(AepHourExample example);

    int deleteByExample(AepHourExample example);

    int insert(AepHour record);

    int insertSelective(AepHour record);

    List<AepHour> selectByExampleWithBLOBs(AepHourExample example);

    List<AepHour> selectByExample(AepHourExample example);

    int updateByExampleSelective(@Param("record") AepHour record, @Param("example") AepHourExample example);

    int updateByExampleWithBLOBs(@Param("record") AepHour record, @Param("example") AepHourExample example);

    int updateByExample(@Param("record") AepHour record, @Param("example") AepHourExample example);

    List<AepHour> aepselecthour();
}