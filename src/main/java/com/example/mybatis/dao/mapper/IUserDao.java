package com.example.mybatis.dao.mapper;

import com.example.mybatis.model.User;

import java.util.List;


public interface IUserDao {

      List<User> findUserAll();

}
