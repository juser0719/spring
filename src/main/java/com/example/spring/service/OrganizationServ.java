package com.example.spring.service;


import com.example.spring.controller.OrganizationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServ {
    @Autowired
    private OrganizationDao dao;
    public Object getObject(Object dataMap){
        String sqlMapId = "organization.list";
        Object resultObject = dao.getList(sqlMapId,dataMap);
        return resultObject;
    }
}