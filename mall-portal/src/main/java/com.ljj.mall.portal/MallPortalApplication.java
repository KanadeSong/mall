package com.ljj.mall.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @CLassName MallPortalApplication
 * @Description MallPortalApplication
 * @Author LeeJack
 * @Date 2019/5/3/003 19:05
 * @Version 1.0
 */
@SpringBootApplication
public class MallPortalApplication {
    private static final Logger logger = LoggerFactory.getLogger(MallPortalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MallPortalApplication.class,args);
        logger.info("MallPortalApplication启动");
    }
}
