package com.why.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer status;
    public User(Long id, String name, String sex, Integer age){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
