package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login
{
    @RequestMapping(value = "/login")
    public String action()
    {
        return "login";
    }
}