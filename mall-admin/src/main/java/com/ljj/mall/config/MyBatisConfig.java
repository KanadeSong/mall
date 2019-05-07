package com.ljj.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @CLassName MyBatisConfig
 * @Description MyBatis配置类
 * @Author LeeJack
 * @Date 2019/5/3/003 15:25
 * @Version 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.ljj.mall.mapper","com.ljj.mall.dao"})
public class MyBatisConfig {
    private static final Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);

    public MyBatisConfig() {
        logger.info("MyBatisConfig启动");
    }
}
