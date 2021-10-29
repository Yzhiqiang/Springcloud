package com.yu.service.Impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yu.dao.DeptDao;
import com.yu.pojo.Dept;
import com.yu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:42 2021/10/22
 * @Modified By:
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @HystrixCommand(fallbackMethod = "Fallback")
    @Override
    public Dept queryById(long id) {
        Dept dept = deptDao.queryById(id);
        if(dept == null)
        {
            throw new RuntimeException("id=>"+id+".不存在该用户，或者信息无法找到");
        }
        return dept;
    }

    public Dept Fallback(long id) {
        Dept dept = new Dept("无此用户","数据库中查寻不到该用户");
        return dept;
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
