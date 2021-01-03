package com.why.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class User {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
    private Integer status;

    public User(String name,String sex, Integer age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
