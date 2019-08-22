package com.example.spring.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
    @Autowired
    private SqlSessionTemplate sqlSesstion;
    public Object getList(String sqlMapId, Object dataMap)
    { 
        Object result = sqlSesstion.selectList(sqlMapId,dataMap);
        return result;
    }
    
}