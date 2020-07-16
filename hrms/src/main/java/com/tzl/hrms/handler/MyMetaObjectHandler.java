package com.tzl.hrms.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    //插入时候的填充测略
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createtime",new Date(),metaObject);
    }
    //跟新时候的填充测略
    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
