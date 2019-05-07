package com.ljj.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: MyBatis配置类
 * @author LeeJack
 * @Date 21:17 2019/5/6/006
 */
@Configuration
@MapperScan({"com.ljj.mall.mapper","com.ljj.mall.search.dao"})
public class MyBatisConfig {
}
