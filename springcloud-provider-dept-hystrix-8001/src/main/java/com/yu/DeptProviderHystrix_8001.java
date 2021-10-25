package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:48 2021/10/22
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient    //服务发现
@EnableEurekaClient    //服务启动后自动注册到Eureka中
@EnableCircuitBreaker     //添加对熔断的支持
public class DeptProviderHystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8001.class,args);
    }
}
