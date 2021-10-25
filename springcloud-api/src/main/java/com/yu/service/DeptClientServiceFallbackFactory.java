package com.yu.service;

import com.yu.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:03 2021/10/25
 * @Modified By:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept getById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id=>."+id+"没有对应的信息，客户端提供了降级的信息")
                        .setDb_source("没有数据~");
            }

            @Override
            public List<Dept> GetAll() {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
