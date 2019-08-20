/*package com.example.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class OrganizationController
{
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public void some(){}
   @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView read(@RequestParam Map<String , Object> paramMap,ModelAndView modelandView) 
    {
    
    String viewName = "/";
    modelandView.setViewName(viewName);
    modelandView.addObject("Id", paramMap);

    return modelandView;
    }


}*/