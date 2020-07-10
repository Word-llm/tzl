package com.tzl.osms;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;

public class demo {

    public static void main(String[] args) {
        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };

        AutoGenerator mpg = new AutoGenerator();
        mpg.setCfg(injectionConfig);

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("沐纤云");
        gc.setOutputDir("D:/SpringWork/tzl/osms/src/main/java");
        gc.setFileOverride(false);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("mxy12345");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/omos?useUnicode=true&useSSL=false&characterEncoding=utf-8&serverTimezone=Hongkong");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude("user", "commodity_message", "admin", "commodity_class", "order", "order_list"); // 需要生成的表名
        mpg.setStrategy(strategy);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.tzl.osms");
        mpg.setPackageInfo(pc);

        mpg.execute();
    }

}
