package com.example.mybatis.controller;

import com.example.mybatis.model.User;
import com.example.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;


    @GetMapping(value = "")
    public ModelAndView user(){
        return new ModelAndView("/user/findAll");
    }


    @GetMapping(value = "find")
    public List<User> finduser(){
        return iUserService.findUserAll();
    }
}
