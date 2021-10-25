package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:50 2021/10/22
 * @Modified By:
 */

//ribbon和eureka整合以后，客户端可以直接调用，不用关心IP地址和端口号
@EnableEurekaClient
@SpringBootApplication //在微服务启动的时候就能去加载我们自定义的Ribbon类
@EnableFeignClients(basePackages = {"com.yu"})
@ComponentScans({@ComponentScan("com.yu")})
public class DeptConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign.class,args);
    }
}
