package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {
    /**
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();
}
