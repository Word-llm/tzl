package com.tzl.hms.moduleone.controller;

import com.tzl.hms.moduleone.mapper.TbGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 木头
 * @date 2020/7/10 20:11
 */
@Controller
@RequestMapping("moduleone/login")
public class LoginController {

    @Autowired
    TbGuestMapper tbGuestMapper;

    @RequestMapping("/test")
    public String loginMethod(){
        System.out.println("tbGuestMapper = " + tbGuestMapper);
        return "frame/login";
    }

}
