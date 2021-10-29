package com.yu.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:04 2021/10/22
 * @Modified By:
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)            //链式写法
/**
 * 链式写法：
 * Dept dept = new Dept();
 * dept.setDeptNo(11).setDname('ssss').setDb_source('001');
 */
public class Dept implements Serializable {   //实体类
    private Long deptno;
    private String dname;

//这个数据存在哪个数据库的字段~微服务，一个服务对应一个数据量，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname, String db_source) {
        this.dname = dname;
        this.db_source = db_source;
    }
}
