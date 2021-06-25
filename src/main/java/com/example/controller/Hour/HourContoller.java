package com.example.controller.Hour;

import com.example.model.studentmanager.AepHour;
import com.example.service.HourService;
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
public class HourContoller {
    @Resource
//    YearService yearService;
    HourService hourService;

    @ResponseBody
    @RequestMapping(value = "/hour",method = RequestMethod.POST)
    public List year(HttpServletRequest request){
        String company=request.getParameter("company");
        Map<String,Object> map=new HashMap<>();
        List result = null;
        if(company.equals("AEP")){
          result=hourService.aepselecthour();
        }else if(company.equals("COMED")){
            result=hourService.comedselecthour();
        }else if(company.equals("DAYTON")){
            result=hourService.daytonselecthour();
        }else if (company.equals("DOM")){
            result=hourService.domselecthour();
        }else if (company.equals("DUQ")){
            result=hourService.duqselecthour();
        }else if (company.equals("DEOK")){
            result=hourService.deokselecthour();
        }else if (company.equals("EKPC")){
            result=hourService.ekpcselecthour();
        }else if (company.equals("FE")){
            result=hourService.feselecthour();
        }else if (company.equals("NI")){
            result=hourService.niselecthour();
        }else if (company.equals("PJME")){
            result=hourService.pjmeselecthour();
        }else if (company.equals("PJMW")){
            result=hourService.pjmwselecthour();
        }else if (company.equals("PJMLOAD")){
            result=hourService.pjmloadselecthour();
        }else {
            System.out.println("匹配不对");
        }

//        Map<String,Object> map=new HashMap<>();
        return result;
    }
}
