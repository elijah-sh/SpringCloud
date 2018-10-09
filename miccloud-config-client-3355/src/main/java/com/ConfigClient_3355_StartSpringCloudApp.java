package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/10/8 19:12
 * @Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConfigClient_3355_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class,args);
    }
}
