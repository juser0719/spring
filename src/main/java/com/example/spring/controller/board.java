package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class board
{
    @RequestMapping(value = "/board")
    public String action()
    {
        return "board";
    }
    /*@RequestMapping(value = "/list")
    public String list()
    {
        return "list";
    }*/
    @RequestMapping(value = "/edit")
    public String edit()
    {
        return "edit";
    }
    @RequestMapping(value = "/view")
    public String view()
    {
        return "view";
    }
    @RequestMapping(value = "/delete")
    public String del()
    {
        return "delete";
    }
}