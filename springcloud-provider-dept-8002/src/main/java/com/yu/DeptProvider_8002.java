package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 12:31 2021/10/24
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient    //服务发现
@EnableEurekaClient    //服务启动后自动注册到Eureka中
public class DeptProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8002.class,args);
    }
}