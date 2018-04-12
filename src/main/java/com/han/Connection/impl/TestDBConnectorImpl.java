package com.han.Connection.impl;

import com.han.Connection.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by 123 on 2018/4/12.
 * 多数据库配置
 * 配置文件spring.profiles.active参数为testdb时，调用此类
 */
@Component
@Profile("testdb")
public class TestDBConnectorImpl implements DBConnector {

    /**
     * 数据库一
     */
    @Override
    public void dbconfigure() {
        System.out.println("--------启动testDB数据库---------");
    }
}
