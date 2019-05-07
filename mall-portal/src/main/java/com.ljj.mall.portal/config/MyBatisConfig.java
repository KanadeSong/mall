package com.ljj.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description: MyBatis配置类
 * @author LeeJack
 * @Date 18:05 2019/5/5/005
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.ljj.mall.mapper","com.ljj.mall.portal.dao"})
public class MyBatisConfig {
}
