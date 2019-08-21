/*package com.example.spring.controller.commonCode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class commoncodecontroller_ob
{
    @RequestMapping(value = "/{action}")
    public ModelAndView edit(@RequestParam HashMap<String,Object> paramMap,@PathVariable String action, ModelAndView modelandView) 
    {
        String viewName = "/" ;
        List<Object> resultList = new ArrayList<Object>() ;
        if ("list".equals(action)) 
        {
            viewName = viewName + action;
            Map <String,Object> data01 = new HashMap<String , Object>();
            Map <String,Object> data02 = new HashMap<String , Object>();
            Map <String,Object> data03 = new HashMap<String , Object>();
            data01.put("name", "name01");
            data01.put("common", "111111111111111");
            data01.put("description", "something blablabla1");
            resultList.add(data01);

            data02.put("name", "name02");
            data02.put("common", "222222222222222");
            data02.put("description", "something blablabla2");
            resultList.add(data02);

            data03.put("name", "name03");
            data03.put("common", "333333333333333");
            data03.put("description", "something blablabla3");
            resultList.add(data03);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }


}*/