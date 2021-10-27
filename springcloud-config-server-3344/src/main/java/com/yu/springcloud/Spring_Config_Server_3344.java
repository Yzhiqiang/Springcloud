package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:51 2021/10/26
 * @Modified By:
 */
@SpringBootApplication
@EnableConfigServer
public class Spring_Config_Server_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Spring_Config_Server_3344.class,args);
    }
}
