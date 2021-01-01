package com.chen.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableField(value = "pk_id")
    @TableId(type = IdType.AUTO)
    private Integer pkId;

    private String userName;
    @TableField(value = "user_phone")
    private String userPhone;
    @TableField(value = "user_pass")
    private String userPass;
    @TableField(value = "user_pass")
    private Integer  roleId;
    @TableField(value = "user_address")
    private String userAddress;
    @TableField(value = "dfs_code")
    private String dfs_code;
}
