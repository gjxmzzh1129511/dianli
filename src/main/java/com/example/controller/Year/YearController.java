package com.example.controller.Year;

import com.example.model.studentmanager.TotalYear;
import com.example.model.studentmanager.TotalYearExample;
import com.example.service.YearService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class YearController {
    @Resource
    YearService yearService;
    @ResponseBody
    @RequestMapping(value = "/year",method = RequestMethod.POST)
    public Map<String, Object> year(HttpServletRequest request){
        String year=request.getParameter("year");
        TotalYearExample totalYearExample=new TotalYearExample();
        TotalYearExample.Criteria criterion=totalYearExample.createCriteria();
        criterion.andYearEqualTo(year);
        List<TotalYear> result=yearService.findyear(totalYearExample);
        Map<String,Object> map=new HashMap<>();
        map.put(year,result.get(0));
        return map;
    }
}
