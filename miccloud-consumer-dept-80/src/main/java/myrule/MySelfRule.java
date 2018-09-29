package myrule;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/29 10:46
 * @Description:
 */
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        return  new RoundTimesRobinRule();   // 自定义 轮询 5次
    }
}
