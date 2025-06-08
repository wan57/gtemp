package com.wcc.gtemp.mananger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Version 1.0
 * @Author WCC
 * @Date 2025/6/8 22:30:00
 * @Description
 */
@Slf4j
@SpringBootApplication
public class ManangerApp {
    public static void main(String[] args) {
        log.info("Manager App Soft!");
        log.info("========== ========== 启动开始 ========== ==========");
        SpringApplication.run(ManangerApp.class,args);
        log.info("========== ========== 启动完成 ========== ==========");
    }
}
