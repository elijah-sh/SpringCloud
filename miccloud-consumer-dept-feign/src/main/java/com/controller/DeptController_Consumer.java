package com.controller;

import com.entities.Dept;
import com.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/27 20:29
 * @Description:
 */
@RestController
public class DeptController_Consumer {
    //private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    private static final String REST_URL_PREFIX = "http://MICCLOUD-DEPT";

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

     @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return  service.list();
    }


}
