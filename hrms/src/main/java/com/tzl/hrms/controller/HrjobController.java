package com.tzl.hrms.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Jl
 * @since 2020-07-10
 */
@RestController
//<a href="job">招聘管理</a>
public class HrjobController {
    @RequestMapping("/job")
    public ModelAndView czym() {
        ModelAndView m = new ModelAndView();
        m.setViewName("job");
        return m;
    }
}

