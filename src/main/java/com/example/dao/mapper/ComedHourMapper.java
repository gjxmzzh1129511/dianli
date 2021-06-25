package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.ComedHour;
import com.example.model.studentmanager.ComedHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ComedHourMapper {
    long countByExample(ComedHourExample example);

    int deleteByExample(ComedHourExample example);

    int insert(ComedHour record);

    int insertSelective(ComedHour record);

    List<ComedHour> selectByExampleWithBLOBs(ComedHourExample example);

    List<ComedHour> selectByExample(ComedHourExample example);

    int updateByExampleSelective(@Param("record") ComedHour record, @Param("example") ComedHourExample example);

    int updateByExampleWithBLOBs(@Param("record") ComedHour record, @Param("example") ComedHourExample example);

    int updateByExample(@Param("record") ComedHour record, @Param("example") ComedHourExample example);
    List<ComedHour> comedselecthour();
}