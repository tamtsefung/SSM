package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

    /**
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    User checkLoginByMap(Map<String,Object> map);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);

}
