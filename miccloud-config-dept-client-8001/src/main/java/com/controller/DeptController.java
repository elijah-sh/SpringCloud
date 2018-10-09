package com.controller;

import com.entities.Dept;
import com.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/27 19:16
 * @Description:
 */
@RestController
public class DeptController {
    @Autowired
    private IDeptService service;

   /* 了解*/
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.getDept(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list()
    {
        return service.findAll();
    }


    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.printf("=================="+list);

        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("MICCLOUD-DEPT");
        for (ServiceInstance element : serviceInstanceList) {
            System.out.println(element.getServiceId() + "\t" +element.getHost() +"\t" +element.getPort() +"\t"
                +element.getUri());
        }
        return this.discoveryClient;
    }


}

