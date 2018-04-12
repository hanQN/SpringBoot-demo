package com.han.Connection.impl;

import com.han.Connection.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by 123 on 2018/4/12.
 * 多数据库配置
 * 配置文件spring.profiles.active参数为productdb时，调用此类
 */
@Component
@Profile("productdb")
public class ProductDBConnectorImpl implements DBConnector {

    /**
     * 数据库二
     */
    @Override
    public void dbconfigure() {
        System.out.println("------------启动productdb数据库-------------");
    }
}
