package com;

import myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/27 22:17
 * @Description:
 */
 //@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class })
@EnableEurekaClient
//  在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "MICCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
