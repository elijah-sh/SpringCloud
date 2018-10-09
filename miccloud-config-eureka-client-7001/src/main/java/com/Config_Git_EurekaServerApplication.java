package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/10/8 21:59
 * @Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer    // EurekaServer  服务端启动类，接受其他服务注册进来
public class Config_Git_EurekaServerApplication
{
    public static void main(String[] args)
    {
    SpringApplication.run(Config_Git_EurekaServerApplication.class,args);
    }
}
