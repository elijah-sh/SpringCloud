package com.service;

import com.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/30 14:10
 * @Description:
 */
@Component //（把普通pojo实例化到spring容器中，相当于配置文件中的  <bean id="" class=""/>） 泛指各种组件
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept(id,"该ID："+id+"没有对应信息,Consumer 客户端提供的降级信息，此刻服务provider 不存在","no this database in Mysql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
