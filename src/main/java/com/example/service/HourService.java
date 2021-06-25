package com.example.service;

import com.example.model.studentmanager.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HourService {
    List<AepHour> aepselecthour();
    List<ComedHour> comedselecthour();
    List<DaytonHour> daytonselecthour();
    List<DeokHour>  deokselecthour();
    List<DomHour>  domselecthour();
    List<DuqHour>  duqselecthour();
    List<EkpcHour>  ekpcselecthour();
    List<FeHour>  feselecthour();
    List<NiHour>  niselecthour();
    List<PjmeHour>  pjmeselecthour();
    List<PjmwHour>  pjmwselecthour();
    List<PjmloadHour> pjmloadselecthour();
}
