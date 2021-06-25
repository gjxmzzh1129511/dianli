package com.example.service.Impl;

import com.example.dao.mapper.*;
import com.example.model.studentmanager.*;
import com.example.service.HourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("HourService")
public class HourServiceImpl implements HourService {
    @Resource
    AepHourMapper aepHourMapper;

    @Override
    public List<AepHour> aepselecthour() {
        List<AepHour> result = aepHourMapper.aepselecthour();
        return result;
    }

    @Resource
    ComedHourMapper comedHourMapper;

    @Override
    public List<ComedHour> comedselecthour() {
        List<ComedHour> result = comedHourMapper.comedselecthour();
        return result;
    }

    @Resource
    DaytonHourMapper daytonHourMapper;

    @Override
    public List<DaytonHour> daytonselecthour() {
        List<DaytonHour> result = daytonHourMapper.daytonselecthour();
        return result;
    }

    @Resource
    DeokHourMapper deokHourMapper;

    @Override
    public List<DeokHour> deokselecthour() {
        List<DeokHour> result = deokHourMapper.deokselecthour();
        return result;
    }

    @Resource
    DomHourMapper domHourMapper;

    @Override
    public List<DomHour> domselecthour() {
        List<DomHour> result = domHourMapper.domselecthour();
        return result;
    }

    @Resource
    DuqHourMapper duqHourMapper;

    @Override
    public List<DuqHour> duqselecthour() {
        List<DuqHour> result = duqHourMapper.duqselecthour();
        return result;
    }

    @Resource
    EkpcHourMapper ekpcHourMapper;

    @Override
    public List<EkpcHour> ekpcselecthour() {
        List<EkpcHour> result = ekpcHourMapper.ekpcselecthour();
        return result;
    }

    @Resource
    FeHourMapper feHourMapper;

    @Override
    public List<FeHour> feselecthour() {
        List<FeHour> result = feHourMapper.feselecthour();
        return result;
    }

    @Resource
    NiHourMapper niHourMapper;

    @Override
    public List<NiHour> niselecthour() {
        List<NiHour> result = niHourMapper.niselecthour();
        return result;
    }

    @Resource
    PjmeHourMapper pjmeHourMapper;

    @Override
    public List<PjmeHour> pjmeselecthour() {
        List<PjmeHour> result = pjmeHourMapper.pjmeselecthour();
        return result;
    }

    @Resource
    PjmwHourMapper pjmwHourMapper;

    @Override
    public List<PjmwHour> pjmwselecthour() {
        List<PjmwHour> result = pjmwHourMapper.pjmwselecthour();
        return result;
    }

    @Resource
    PjmloadHourMapper pjmloadHourMapper;

    @Override
    public List<PjmloadHour> pjmloadselecthour() {
        List<PjmloadHour> result = pjmloadHourMapper.pjmloadselecthour();
        return result;
    }
}
