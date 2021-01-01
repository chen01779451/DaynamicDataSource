package com.chen.test.dao.test1;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.test.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapping extends BaseMapper<User> {

    @Select("select u.pk_id as pkId,u.user_name as userName,u.user_phone as userPhone  from user u")
    //注意在bean中的tableFiled会失去作用
    List<User> getUsers();

}
