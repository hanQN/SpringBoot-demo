package com.han.controller;

import com.han.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 123 on 2018/4/12.
 */
@RestController //等价于@Controller+@ResponseBody
public class UserController {

    @Autowired
    private ConfigBean configBean;

    @Value("${com.email.address}")
    private String address;
    @Value("${com.email.password}")
    private String password;

    @RequestMapping("/test")
    public String test(){
        return address + "," + password;
    }

    @RequestMapping("/test2")
    public String test2(){
        //return "欢迎来到Controller！";
        return configBean.getAddress()+","+configBean.getPassword();
    }
}
