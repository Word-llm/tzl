package com.tzl.hms.moduleone.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 木头
 * @date 2020/7/16 20:14
 */
@Slf4j
public class MyWebMvcInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userName = (String)request.getSession().getAttribute("userName");
        if(userName==null){
            response.sendRedirect(request.getContextPath()+"/JavaPrj_9");
            return false;
        }else{
            return true;
        }
    }

}
