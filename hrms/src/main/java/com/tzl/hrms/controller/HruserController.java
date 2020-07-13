package com.tzl.hrms.controller;


import com.tzl.hrms.pojo.Hruser;
import com.tzl.hrms.service.HruserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

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
        m.setViewName("user");
        return m;
    }
}

