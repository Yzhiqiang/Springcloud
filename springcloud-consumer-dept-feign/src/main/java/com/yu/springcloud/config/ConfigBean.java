package com.yu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 13:53 2021/10/22
 * @Modified By:
 */
@Configuration
public class ConfigBean {
    //配置负载均衡实现RestTemplate
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
