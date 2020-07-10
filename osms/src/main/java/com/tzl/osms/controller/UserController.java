package com.tzl.osms.controller;


import com.tzl.osms.entity.User;
import com.tzl.osms.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 沐纤云
 * @since 2020-07-10
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private UserMapper um;

//
//    public void registerUser(){
//        User user = new User();
//
//        um.insert(user);
//    }
}

