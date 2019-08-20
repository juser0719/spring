package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class signup
{
    @RequestMapping(value = "/signup")
    public String action()
    {
        return "signup";
    }
}