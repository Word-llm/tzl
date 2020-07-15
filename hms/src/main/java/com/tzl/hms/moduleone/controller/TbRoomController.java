package com.tzl.hms.moduleone.controller;


import com.tzl.hms.moduleone.entity.TbRoom;
import com.tzl.hms.moduleone.service.TbRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xzh
 * @since 2020-07-10
 */
@Controller
@RequestMapping("/moduleone/tbRoom")
public class TbRoomController {

    @Autowired
    TbRoomService tbRoomService;

    @RequestMapping("/roomQuery")
    public ModelAndView roomQuery(){
        ModelAndView mav = new ModelAndView();
        System.out.println("====ka;slpoirpo234q23oipjfklasjdf;=========");
        List<TbRoom> list = tbRoomService.list();
        mav.addObject("list",list);
        mav.addObject("roomStateTemp",TbRoom.STATE_RENTED);
        mav.setViewName("room/queryRoom");
        list.forEach(System.out::println);
        return mav;
    }

}

