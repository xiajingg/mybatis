package com.example.mybatis.service.impl;

import com.example.mybatis.dao.mapper.IUserDao;
import com.example.mybatis.model.User;
import com.example.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> findUserAll() {
        return iUserDao.findUserAll();
    }
}
