/*package com.example.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.spring.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{
    @Autowired
    private StudentRepository repository;
    @RequestMapping(value = "/student/{action}")
    public ModelAndView actionMethod( @RequestParam HashMap<String,Object> paramMap,@PathVariable String action, ModelAndView modelandView) 
    {
        String viewName = "/student/";
        List<Object> resultList = new ArrayList<Object>();
        Map<String,Object> resultMap = new HashMap<String,Object>();
        if ("read".equals(action))  
        {
            viewName = viewName + action;
            resultList = (List) repository.findAll();

            modelandView.setViewName(viewName);
            modelandView.addObject("resultList", resultList);    
            //resultMap = (Map) repository.getOne(Long.valueOf((String) paramMap.get("id")));
        } else if (".equals(action)")
        {
            viewName = viewName + action;
            resultMap = (Map) repository.getOne(Long.valueOf((String) paramMap.get("id")));
        }

        return modelandView;
    }

}*/