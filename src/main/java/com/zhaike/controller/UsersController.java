package com.zhaike.controller;

import com.zhaike.entity.Users;
import com.zhaike.entity.UsersExample;
import com.zhaike.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService service;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("nums",88);
        return "hello";
    }

    @RequestMapping("/login")
    @ResponseBody
    public List<Users> login(String uname,String password){
        UsersExample example = new UsersExample();
        example.createCriteria().andNicknameEqualTo(uname).andPasswordEqualTo(password);

        List<Users> users = service.selectByExample(example);
        return users;
    }

}
