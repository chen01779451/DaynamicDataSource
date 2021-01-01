package com.chen.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserT2 {
    private int id;
    private String name;
    private int age;
    private String sex;


}
