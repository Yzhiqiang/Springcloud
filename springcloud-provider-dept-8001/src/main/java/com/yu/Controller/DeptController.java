package com.yu.Controller;

import com.yu.pojo.Dept;
import com.yu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

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
    DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/add")
    public boolean addDept(Dept dept)
    {
        return deptService.addDept(dept);
    }

    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptService.queryById(id);
    }

    @RequestMapping("/list")
    public List<Dept> queryAll()
    {
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery()
    {
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>service:"+services);

        //得到一个具体的微服务信息,通过具体的微服务id  applicationName
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()
            );
        }
        return this.client;
    }

}
