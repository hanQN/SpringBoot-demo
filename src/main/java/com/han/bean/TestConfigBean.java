package com.han.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by 123 on 2018/4/12.
 */

@Configuration
@PropertySource(value = "classpath:test.properties",encoding = "UTF-8")
@ConfigurationProperties(prefix = "com.han")
public class TestConfigBean {

    private String text;
    private String text2;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
