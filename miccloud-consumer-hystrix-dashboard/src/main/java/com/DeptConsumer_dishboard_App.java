package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/10/8
 * @Description:  豪猪  仪表盘监控
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class })
@EnableHystrixDashboard
public class DeptConsumer_dishboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_dishboard_App.class,args);
    }
}
