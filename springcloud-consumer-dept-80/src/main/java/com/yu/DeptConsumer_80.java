package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:50 2021/10/22
 * @Modified By:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
