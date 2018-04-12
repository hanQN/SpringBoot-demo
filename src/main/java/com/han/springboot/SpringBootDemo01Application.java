package com.han.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController //等价于@Controller+@ResponseBody
@SpringBootApplication
@ComponentScan("com.han.controller")
public class SpringBootDemo01Application {

	/*@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot!";
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo01Application.class, args);
	}
}
