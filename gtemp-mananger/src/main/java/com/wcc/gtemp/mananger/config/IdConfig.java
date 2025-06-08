package com.wcc.gtemp.mananger.config;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Version 1.0
 * @Author WCC
 * @Date 2024/8/11 23:05
 * @Description
 */
@Slf4j
@Configuration
public class IdConfig {
    @Value("${snowflake.worker:1}")
    private long workerId;
    @Value("${snowflake.datacenter:1}")
    private long datacenterId;

    /** ID生成器 - 雪花算法
     * @return snowflake
     */
    @Bean
    public Snowflake snowflake() {
        log.info("初始化ID生成器，雪花算法Snowflake：workerId={}，datacenterId={}",workerId,datacenterId);
        Snowflake snowflake = IdUtil.getSnowflake(workerId,datacenterId);
        return snowflake;
    }

}
