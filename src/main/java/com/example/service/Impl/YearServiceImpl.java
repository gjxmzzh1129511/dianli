package com.example.service.Impl;

import com.example.dao.mapper.TotalYearMapper;
import com.example.model.studentmanager.TotalYear;
import com.example.model.studentmanager.TotalYearExample;
import com.example.service.YearService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("YearService")
public class YearServiceImpl implements YearService {
    @Resource
    TotalYearMapper totalYearMapper;
    @Override
    public List<TotalYear> findyear(TotalYearExample totalYearExample) {
        return totalYearMapper.selectByExample(totalYearExample);
    }

}
