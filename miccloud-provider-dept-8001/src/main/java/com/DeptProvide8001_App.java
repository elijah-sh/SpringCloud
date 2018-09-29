package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/26 18:54
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient   // 自动注册到Eureka服务中心
public class DeptProvide8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvide8001_App.class,args);
    }
}
