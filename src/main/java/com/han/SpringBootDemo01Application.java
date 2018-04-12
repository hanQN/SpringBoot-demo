package com.han;

import com.han.bean.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(ConfigBean.class)
public class SpringBootDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo01Application.class, args);
	}
}
