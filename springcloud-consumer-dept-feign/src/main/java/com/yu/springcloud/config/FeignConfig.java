package com.yu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:15 2021/10/28
 * @Modified By:
 */

/**
 * feign 日志
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLever()
    {
        return Logger.Level.FULL;
    }
}
