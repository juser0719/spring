package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/commoncode")
public class commoncodecontroller
{
    @RequestMapping(value = "/edit",
        method = {RequestMethod.GET,RequestMethod.POST})
        public void edit(){}
}