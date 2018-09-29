package com.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/27 20:24
 * @Description:
 */
@Configuration
public class ConfigBean {  // 等于 applicationContext.xml

    @Bean
    @LoadBalanced   //  Ribbon 客户端负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

