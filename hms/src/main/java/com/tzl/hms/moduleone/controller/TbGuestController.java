package com.tzl.hms.moduleone.controller;


import com.tzl.hms.moduleone.entity.TbGuest;
import com.tzl.hms.moduleone.service.TbGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xzh
 * @since 2020-07-10
 */
@Controller
@RequestMapping("/moduleone/tbGuest")
public class TbGuestController {

    @Autowired
    TbGuestService tbGuestService;


    @RequestMapping("/guestAdd")
    public String guestAdd(){
        return "guest/addGuest";
    }

    @RequestMapping("/guestInsert")
    public ModelAndView guestInsert(TbGuest tbGuest){
        ModelAndView mav = new ModelAndView();
        System.out.println("tbGuest =========================== " + tbGuest);
        tbGuestService.save(tbGuest);
        mav.setViewName("guest/addGuest");
        return mav;
    }




}

