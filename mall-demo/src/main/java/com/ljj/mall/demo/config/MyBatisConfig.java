package com.ljj.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by ljj on 2019/4/8.
 */
@Configuration
@MapperScan("com.ljj.mall.mapper")
public class MyBatisConfig {
}
