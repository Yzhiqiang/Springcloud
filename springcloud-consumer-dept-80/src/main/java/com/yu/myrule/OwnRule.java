package com.yu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 16:20 2021/10/24
 * @Modified By:
 */

/**
 * 自定义的配置类，必须是@Configuration， 但是他不在主应用程序上下文的@ComponentScan中，否则由所有的@RibbonClients
 */
@Configuration
public class OwnRule {

    @Bean
    public IRule myRule() {
        return new RoundRobinRule();//使用随机策略
        //return new RoundRobinRule();//使用轮询策略
        //return new AvailabilityFilteringRule();//使用轮询策略
        //return new RetryRule();//使用轮询策略
    }
}
