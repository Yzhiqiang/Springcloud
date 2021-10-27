package com.yu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:08 2021/10/26
 * @Modified By:
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        return
                "applicationName:" + applicationName+
                "eurekaServer:" + eurekaServer+
                "port:" + port;
    }
}
