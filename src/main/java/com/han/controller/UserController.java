package com.han.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 123 on 2018/4/12.
 */
@RestController
public class UserController {

    /*@Value("${com.han.name}")
    private String name;
    @Value("${com.han.age}")
    private String sex;*/

    @RequestMapping("/test")
    public String test(){
        return "欢迎来到Controller！";
        //return name+","+sex;
    }
}
