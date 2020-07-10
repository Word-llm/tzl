package com.tzl.hms;

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
/**
 * @author 木头
 * @date 2020/7/5 14:59
 */
public class MyCodeGenerator {
    public static void main(String[] args) {

        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String,Object> map = new HashMap<>();
                map.put("abc",this.getConfig().getGlobalConfig().getAuthor()+"-mp");
                this.setMap(map);
            }
        };

        AutoGenerator mpg = new AutoGenerator();
        mpg.setCfg(injectionConfig);

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("xzh");
        gc.setOutputDir("D:/ideaMaven/tzlcdp/hms/src/main/java");
        gc.setFileOverride(true);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setOpen(false);
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("mainyi");
        dsc.setUrl("jdbc:mysql://localhost:3306/hms?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude("tb_balancement","tb_checkinitem","tb_checkinorder","tb_guest","tb_operator","tb_room","tb_roomcatalog"); // 需要生成的表
        mpg.setStrategy(strategy);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("moduleone");
        pc.setParent("com.tzl.hms");
        mpg.setPackageInfo(pc);

        mpg.execute();

    }
}
