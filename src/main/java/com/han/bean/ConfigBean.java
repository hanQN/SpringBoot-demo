package com.han.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 123 on 2018/4/12.
 */
@ConfigurationProperties(prefix = "com.email")
public class ConfigBean {
    private String address;
    private String password;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
