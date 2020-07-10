package com.tzl.hms.moduleone.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 木头
 * @date 2020/7/10 9:55
 */
@Slf4j
@Component // 一定不要忘记把处理器加到IOC容器中！
public class MyMetaObjectHandler implements MetaObjectHandler {
    // 插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill.....");
        this.setFieldValByName("bmCreateTime", new Date(), metaObject);

        this.setFieldValByName("cimInDatetime", new Date(), metaObject);

        this.setFieldValByName("cioInDateTime", new Date(), metaObject);

        this.setFieldValByName("gtGreateTime", new Date(), metaObject);

        this.setFieldValByName("opCreateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        log.info("start update fill.....");
//        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}