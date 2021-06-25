package com.example.dao.mapper;

import com.example.model.studentmanager.AepHour;
import com.example.model.studentmanager.FeHour;
import com.example.model.studentmanager.FeHourExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FeHourMapper {
    long countByExample(FeHourExample example);

    int deleteByExample(FeHourExample example);

    int insert(FeHour record);

    int insertSelective(FeHour record);

    List<FeHour> selectByExampleWithBLOBs(FeHourExample example);

    List<FeHour> selectByExample(FeHourExample example);

    int updateByExampleSelective(@Param("record") FeHour record, @Param("example") FeHourExample example);

    int updateByExampleWithBLOBs(@Param("record") FeHour record, @Param("example") FeHourExample example);

    int updateByExample(@Param("record") FeHour record, @Param("example") FeHourExample example);

    List<FeHour> feselecthour();
}