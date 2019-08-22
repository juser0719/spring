/*package com.example.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.spring.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
    
    @Autowired
    private MemberService service;
    @RequestMapping(value = "/{action}")
    public ModelAndView actionMethod(@RequestParam HashMap<String,Object> paramMap,@PathVariable String action, ModelAndView modelandView)
    {   
        String viewName = "/" ;
        Map <String,Object> resultMap = new HashMap<String , Object>();
        if ("member".equals(action)) 
        {
            viewName = viewName + action;
            resultMap = (Map <String,Object>) service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
    
}*/