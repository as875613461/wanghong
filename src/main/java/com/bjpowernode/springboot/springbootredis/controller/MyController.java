package com.bjpowernode.springboot.springbootredis.controller;
/**
 * className:MyController
 * package:com.bjpowernode.springboot.springbootredis.controller
 * Description:
 *
 * @data:2019/10/2116:12
 * @auther:wanghong
 */

import com.bjpowernode.springboot.springbootredis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 王宏
 */
@Controller
public class MyController {
    @Value("${uname}")
    private String uname;
    @Value("${age}")
    private Integer age;
    @Autowired
    private Student student;

    @RequestMapping(value = "/test")
    public @ResponseBody Object test(){
        return "我的第一个springboot哈哈名字是："+uname+"年龄是："+age+student.getName()+student.toString();

    }
}
