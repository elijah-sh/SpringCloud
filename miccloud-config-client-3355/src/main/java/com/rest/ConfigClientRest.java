package com.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/10/8 18:57
 * @Description:
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    private String getConfig()
    {
        String str = "applicationName: "+applicationName +"\t eurekaServers: "+eurekaServers+ "\t port: "+port ;
        System.out.println("============= str: "+str);
        return str;
    }
}
