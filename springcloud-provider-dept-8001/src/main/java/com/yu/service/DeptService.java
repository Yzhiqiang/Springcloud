package com.yu.service;

import com.yu.pojo.Dept;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:41 2021/10/22
 * @Modified By:
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(long id);

    public List<Dept> queryAll();
}
