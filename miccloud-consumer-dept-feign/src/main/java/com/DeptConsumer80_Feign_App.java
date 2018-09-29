package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

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
@EnableFeignClients(basePackages = {"com"})
//@ComponentScan("com")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
