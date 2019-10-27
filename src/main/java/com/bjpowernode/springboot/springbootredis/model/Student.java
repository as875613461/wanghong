package com.bjpowernode.springboot.springbootredis.model;
/**
 * className:Student
 * package:com.bjpowernode.springboot.springbootredis.model
 * Description:
 *
 * @data:2019/10/2117:53
 * @auther:wanghong
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 王宏
 */
@Component
@ConfigurationProperties(prefix = "stu")
public class Student {
    private String name;
    private Integer age;
    private String phone;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
