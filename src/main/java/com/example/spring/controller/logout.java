package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class logout
{
    @RequestMapping(value = "/logout")
    public String action()
    {
        return "logout";
    }
}