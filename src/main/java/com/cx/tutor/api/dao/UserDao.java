package com.cx.tutor.api.dao;

import com.cx.tutor.api.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    public User get(@Param("id")long id);
}
