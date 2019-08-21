package com.example.spring.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test
{
    @RequestMapping(value = "/test")
    public ModelAndView edit(ModelAndView modelandView) 
    {
        String viewName = "/test" ;
        List<Object> resultList = new ArrayList<Object>() ;
            Map <String,Object> data01 = new HashMap<String , Object>();
            //Map <String,Object> data02 = new HashMap<String , Object>();
           // Map <String,Object> data03 = new HashMap<String , Object>();
            data01.put("name", "name01");
            data01.put("common", "111111111111111");
            data01.put("description", "something blablabla1");
            resultList.add(data01);

            /*data02.put("name2", "name02");
            data02.put("commmon2", "222222222222222");
            data02.put("descripsion2", "something blablabla2");
            resultList.add(data02);

            data03.put("name3", "name03");
            data03.put("commmon3", "333333333333333");
            data03.put("descripsion3", "something blablabla3");
            resultList.add(data03);*/
    
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }

}