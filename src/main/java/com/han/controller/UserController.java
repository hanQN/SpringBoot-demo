package com.han.controller;

import com.han.Connection.DBConnector;
import com.han.bean.ConfigBean;
import com.han.bean.TestConfigBean;
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
    @Autowired
    private TestConfigBean testconfigBean;
    @Autowired DBConnector dbConnector;

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

    @RequestMapping("/text")
    public String gettestText(){
        return testconfigBean.getText()+"<br/>"+testconfigBean.getText2()
                +"<br/>随机值："+testconfigBean.getNum();
    }

    @RequestMapping("dbinfo")
    public String dbbase(){
        dbConnector.dbconfigure();
        return "连接成功！";
    }


}
