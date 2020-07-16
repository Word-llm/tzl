package com.tzl.hrms.controller;


import com.tzl.hrms.pojo.Hruser;
import com.tzl.hrms.service.HruserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Jl
 * @since 2020-07-10
 */
@RestController
//<a href="user">人员管理</a>
public class HruserController {
    @Resource
    private HruserService hr;

    @RequestMapping("/user")
    public ModelAndView czym() {
        ModelAndView m = new ModelAndView();
        m.addObject("userlist", hr.list());
        m.setViewName("user");
        return m;
    }

    @RequestMapping("/add")
    public ModelAndView add() {
        ModelAndView m = new ModelAndView();
        m.setViewName("userinsert");
        return m;
    }

    @RequestMapping("/insertuser")
    public ModelAndView insert(Hruser user) {
        hr.save(user);
        return czym();
    }

    @RequestMapping("/update")
    public ModelAndView update(Hruser hruser) {
        ModelAndView m = new ModelAndView();
        m.addObject("hruser", hruser);
        m.setViewName("userupdate");
        return m;
    }

    @RequestMapping("/userupdate")
    public ModelAndView userupdate(Hruser user) {
        hr.updateById(user);
        return czym();
    }

    @RequestMapping("/delete")
    public ModelAndView delete(Hruser user) {
        hr.removeById(user);
        return czym();
    }
}

