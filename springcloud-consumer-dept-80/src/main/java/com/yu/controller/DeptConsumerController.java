package com.yu.controller;

import com.yu.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 13:45 2021/10/22
 * @Modified By:
 */
@RestController
@RequestMapping("/consumer/dept")

public class DeptConsumerController {
    //消费者不应该有service层
    //RestTemplate 有很多方法供我们直接调用
    @Autowired
    private RestTemplate restTemplate;      //提高多种便捷访问http服务的方法，简单的Restful服务模板

    private static final String REST_URL_PREFIX="http://localhost:8001";

    @RequestMapping("/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
