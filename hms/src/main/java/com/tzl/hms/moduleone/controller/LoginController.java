package com.tzl.hms.moduleone.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tzl.hms.moduleone.entity.TbOperator;
import com.tzl.hms.moduleone.mapper.TbGuestMapper;
import com.tzl.hms.moduleone.mapper.TbOperatorMapper;
import com.tzl.hms.moduleone.service.TbOperatorService;
import jdk.nashorn.internal.ir.ReturnNode;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author 木头
 * @date 2020/7/10 20:11
 */
@Controller
public class LoginController {

    @Autowired
    TbOperatorService tbOperatorService;


    /**
     * 访问登录的页面
     *
     * @return
     */
    @RequestMapping({"/JavaPrj_9", ""})
    public String loginMethod() {
        return "frame/login";
    }

    /**
     * 检验登录的人是否存在数据库并且判断为管理员还是普通用户
     */
    @RequestMapping("/login_checkout")
    public @ResponseBody String loginCheckout(String userName, String password) {
        QueryWrapper<TbOperator> wrapper = new QueryWrapper<>();
        wrapper.eq("op_user_name", userName);
        wrapper.eq("op_password", password);
        TbOperator tbOperator = tbOperatorService.getOne(wrapper);

        if (tbOperator == null) {
            if ("".equals(userName) && "".equals(password)) {
                //请输入用户名和密码
                JSONArray fromObject = JSONArray.fromObject("['npn']");
                return fromObject.toString();
            }
            if ("".equals(userName)) {
                //用户名为空，输入用户
                JSONArray fromObject = JSONArray.fromObject("['nn']");
                return fromObject.toString();
            }
            if ("".equals(password)) {
                //密码为空请输入密码
                JSONArray fromObject = JSONArray.fromObject("['pn']");
                return fromObject.toString();
            }
            if (userName.length() != 0 && password.length() != 0) {

                //用户名和密码输入错误，请重新输入用户名和密码
                JSONArray fromObject = JSONArray.fromObject("['npc']");
                return fromObject.toString();
            }
            if (userName.length() != 0) {

                //用户名输入错去，请重新输入用户名
                JSONArray fromObject = JSONArray.fromObject("'[nc']");
                return fromObject.toString();
            }
            if (password.length() != 0) {

                //密码输入错去，请重新输入密码
                JSONArray fromObject = JSONArray.fromObject("['pc']");
                return fromObject.toString();
            }

        }
        if (tbOperator.getOpPrivilege() == 1) {
            JSONArray fromObject = JSONArray.fromObject("['1']");
            return fromObject.toString();
        } else {
            JSONArray fromObject = JSONArray.fromObject("['0']");
            return fromObject.toString();
        }
    }

}
