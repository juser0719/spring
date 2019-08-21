/*package com.example.spring.controller.commonCode;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class commoncodecontroller
{
    @RequestMapping(value = "/{action}")
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView) 
    {
        String viewName = "/" ;
        Map<String, Object> resultMap = new HashMap<String, Object>() ;
        if ("read".equals(action)) 
        {
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
    @RequestMapping(value = "/input",
    method = {RequestMethod.GET,RequestMethod.POST})
    public void edit(){}
}*/