package com.tzl.hrms.controller;

import com.tzl.hrms.pojo.Hruser;
import com.tzl.hrms.service.HruserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
//
@RestController
public class Login {
    @Resource
    private HruserService hr;

    //跳转登录页面
    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView m = new ModelAndView();
        m.setViewName("login");
        return m;
    }

    //验证登录
    @RequestMapping("/czym")
    public ModelAndView czym(Hruser hruser) {
        List<Hruser> list = hr.list();
        list.forEach(System.out::println);
        System.out.println(hruser);
        ModelAndView m = new ModelAndView();
        m.setViewName("czym");
        m.addObject("user", hruser);
        return m;
    }
}
