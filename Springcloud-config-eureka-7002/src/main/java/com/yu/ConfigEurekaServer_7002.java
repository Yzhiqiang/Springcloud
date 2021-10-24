package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //服务端启动类，可以接受别的服务注册

@SpringBootApplication
public class ConfigEurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServer_7002.class, args);
    }
}
