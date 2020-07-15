package com.tzl.hms.moduleone.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tzl.hms.moduleone.entity.TbOperator;
import com.tzl.hms.moduleone.service.TbOperatorService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping({"/JavaPrj_9", "", "/login"})
    public String loginMethod() {
        return "frame/login";
    }


    /**
     * 跳转普通用户管理页面
     *
     * @return
     */
    @RequestMapping("/domestic")
    public String domestic() {
        return "frame/domestic";
    }


    /**
     * 跳转管理员管理页面
     *
     * @return
     */
    @RequestMapping("/administrator")
    public String administrator() {
        return "frame/administrator";
    }


    /**
     * 检验登录的人是否存在数据库并且判断为管理员还是普通用户
     */
    @RequestMapping("/login_checkout")
    public @ResponseBody
    String loginCheckout(String userName, String password) {
        QueryWrapper<TbOperator> wrapper = new QueryWrapper<>();
        wrapper.eq("op_user_name", userName);
        wrapper.eq("op_password", password);
        TbOperator tbOperator = tbOperatorService.getOne(wrapper);
        if (tbOperator == null) {
            if ("".equals(userName) || "".equals(password)) {
                //请输入用户名和密码
                return JSONArray.fromObject("['npn']").toString();
            }
            if (userName.length() != 0 && password.length() != 0) {
                //用户名和密码输入错误，请重新输入用户名和密码
                return JSONArray.fromObject("['npc']").toString();
            }
        }
        if (tbOperator.getOpPrivilege() == 1) {
            return JSONArray.fromObject("['1']").toString();
        } else {
            return JSONArray.fromObject("['0']").toString();
        }
    }


    /**
     * 检验登录的人是否存在数据库并且判断为管理员还是普通用户
     */
//    @RequestMapping("/login_checkout")
//    public @ResponseBody String loginCheckout(String userName, String password) {
//        System.out.println("userName = " + userName);
//        System.out.println("password = " + password);
//        QueryWrapper<TbOperator> wrapper = new QueryWrapper<>();
//        wrapper.eq("op_user_name", userName);
//        wrapper.eq("op_password", password);
//        TbOperator tbOperator = tbOperatorService.getOne(wrapper);
//
//        if (tbOperator == null) {
//            if ("".equals(userName) && "".equals(password)) {
//                //请输入用户名和密码
//                return JSONArray.fromObject("['npn']").toString();
//            }
//            if ("".equals(userName)) {
//                //用户名为空，输入用户
//                return JSONArray.fromObject("['nn']").toString();
//            }
//            if ("".equals(password)) {
//                //密码为空请输入密码
//                return JSONArray.fromObject("['pn']").toString();
//            }
//            if (userName.length() != 0 && password.length() != 0) {
//
//                QueryWrapper<TbOperator> wrapper1 = new QueryWrapper<>();
//                wrapper1.eq("op_user_name", userName);
//                TbOperator tbOperator1 = tbOperatorService.getOne(wrapper1);
//
//                QueryWrapper<TbOperator> wrapper2 = new QueryWrapper<>();
//                wrapper2.eq("op_password", password);
//                TbOperator tbOperator2 = tbOperatorService.getOne(wrapper2);
//                if(tbOperator1 == null && tbOperator2==null){
//                    //用户名和密码输入错误，请重新输入用户名和密码
//                    return JSONArray.fromObject("['npc']").toString();
//                }
//                if (tbOperator1 == null) {
//                    //用户名输入错去，请重新输入用户名
//                    return JSONArray.fromObject("'[nc']").toString();
//                }else{
//
//                    if (!(password.equals(tbOperator1.getOpPassword()))) {
//                        //密码输入错去，请重新输入密码
//                        return JSONArray.fromObject("['pc']").toString();
//                    }
//                }
//
//
//            }
//        }
//        if (tbOperator.getOpPrivilege() == 1) {
//            return JSONArray.fromObject("['1']").toString();
//        } else {
//            return JSONArray.fromObject("['0']").toString();
//        }
//    }

}
