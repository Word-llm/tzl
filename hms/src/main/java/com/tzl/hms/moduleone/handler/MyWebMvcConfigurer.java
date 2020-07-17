package com.tzl.hms.moduleone.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 木头
 * @date 2020/7/12 19:24
 */
@Configuration   //拦截器的配置类
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration ir = registry.addInterceptor(new MyWebMvcInterceptor());

        ir.addPathPatterns("/**").excludePathPatterns("/login","/JavaPrj_9","/","/login_checkout");
    }
}
