package com.yu.springcloud;

import com.yu.myrule.OwnRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:50 2021/10/22
 * @Modified By:
 */

//ribbon和eureka整合以后，客户端可以直接调用，不用关心IP地址和端口号
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = OwnRule.class)    //在微服务启动的时候就能去加载我们自定义的Ribbon类
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
