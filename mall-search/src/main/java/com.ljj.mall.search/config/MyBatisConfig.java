package com.ljj.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by ljj on 2019/4/8.
 */
@Configuration
@MapperScan({"com.ljj.mall.mapper","com.ljj.mall.search.dao"})
public class MyBatisConfig {
}
