package com.yu.springcloud.controller;

import com.yu.pojo.Dept;
import com.yu.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private DeptClientService deptClientService = null;

//    //Ribbon， 我们这里的地址，应该是一个变量，通过服务器名来访问
////    private static final String REST_URL_PREFIX="http://localhost:8001";
//    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/add")
    public boolean add(Dept dept)
    {
        System.out.println("================================================");
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptClientService.getById(id);
    }

    @RequestMapping("/list")
    public List<Dept> list()
    {
        System.out.println("====================                      all              ============================");
        return deptClientService.GetAll();
    }
}
