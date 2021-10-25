package com.yu.service;

import com.yu.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:17 2021/10/24
 * @Modified By:
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
@RequestMapping("/dept")
public interface DeptClientService {

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable("id") Long id);

    @GetMapping("/list")
    public List<Dept> GetAll();

    @PostMapping("/add")
    public Boolean addDept(Dept dept);
}
