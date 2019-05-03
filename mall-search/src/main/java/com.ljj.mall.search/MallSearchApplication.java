package com.ljj.mall.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @CLassName MallSearchApplication
 * @Description MallSearchApplication
 * @Author LeeJack
 * @Date 2019/5/3/003 21:11
 * @Version 1.0
 */
@SpringBootApplication
public class MallSearchApplication {
    private static final Logger logger = LoggerFactory.getLogger(MallSearchApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MallSearchApplication.class, args);
        logger.info("MallSearchApplication启动");
    }

}
