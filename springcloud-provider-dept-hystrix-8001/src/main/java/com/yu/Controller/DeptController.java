package com.yu.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yu.pojo.Dept;
import com.yu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:44 2021/10/22
 * @Modified By:
 */

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptService.queryById(id);
        return dept;
    }

    public Dept hystrixGet(@PathVariable("id") Long id)
    {
        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+"没有对应的信息，null")
                .setDb_source("no this database in Mysql");
    }

}
