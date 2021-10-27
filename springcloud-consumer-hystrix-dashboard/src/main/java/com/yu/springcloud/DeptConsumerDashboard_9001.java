package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:43 2021/10/25
 * @Modified By:
 */
@SpringBootApplication
@EnableHystrixDashboard      //开启监控界面
public class DeptConsumerDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class, args);
    }

}
