package com.ljj.mall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @CLassName MallAdminApplication
 * @Description 应用启动入口
 * @Author LeeJack
 * @Date 2019/5/3/003 14:13
 * @Version 1.0
 */
@SpringBootApplication
public class MallAdminApplication {
    private static final Logger logger = LoggerFactory.getLogger(MallAdminApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
        logger.info("mall-admin启动");
    }

}
