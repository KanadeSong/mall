package com.ljj.mall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @CLassName MallDemoApplication
 * @Description MallDemoApplication
 * @Author LeeJack
 * @Date 2019/5/3/003 21:41
 * @Version 1.0
 */
@SpringBootApplication
public class MallDemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(MallDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MallDemoApplication.class, args);
        logger.info("MallDemoApplication启动");
    }

}
