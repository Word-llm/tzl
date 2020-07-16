package com.tzl.hrms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tzl.hrms.pojo.Hruser;
import com.tzl.hrms.service.HruserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

//
@RestController
public class Login {
    @Resource
    private HruserService hr;

    //验证登录
    @RequestMapping("/czym")
    public ModelAndView czym(String username, String password) {
        ModelAndView m = new ModelAndView();
        QueryWrapper<Hruser> qw = new QueryWrapper<>();
        qw.eq("username", username);
        qw.eq("password", password);
        Hruser one = hr.getOne(qw);
        if (one != null) {
            m.setViewName("czym");
            m.addObject("user", one);
        } else {
            m.setViewName("index");
            m.addObject("msg", "用户名或密码错误");
        }
        return m;
    }


    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        return m;
    }
}
