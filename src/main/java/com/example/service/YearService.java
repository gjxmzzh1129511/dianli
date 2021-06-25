package com.example.service;

import com.example.model.studentmanager.TotalYear;
import com.example.model.studentmanager.TotalYearExample;
import com.example.model.studentmanager.User1;
import com.example.model.studentmanager.User1Example;

import java.util.List;

public interface YearService {
    List<TotalYear> findyear(TotalYearExample totalYearExample);
}
