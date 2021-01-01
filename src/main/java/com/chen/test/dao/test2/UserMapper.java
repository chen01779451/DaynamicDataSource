package com.chen.test.dao.test2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.test.entity.UserT2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<UserT2> {
    @Select("select * from user")
    List<UserT2> getUser();
}
