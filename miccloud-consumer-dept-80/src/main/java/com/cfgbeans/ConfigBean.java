package com.cfgbeans;

import com.netflix.loadbalancer.*;
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

    @Bean
    public IRule myRule()
    {
        //  达到的目的，用我们重新选择的随机算法代替默认是轮询
        //  return new RoundRobinRule();   // 轮询 即默认
        //return  new RandomRule();   // 随机
        //  return  new RetryRule(); //  Retry 重新
        return  new AvailabilityFilteringRule();   // 可用性过滤  如果有机子宕机了 就跳过
    }
}


   /*
    类似依赖注入

    @Bean
    public UserService get()
    {
        return  new
    }*/

