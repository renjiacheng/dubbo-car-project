package com.oracle.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author HuangHaoD
 * @create 2022/08/04 15:33
 */
@Configuration
public class RedisConfig {

    @Value("${redis.prefix}")
    private String redisPrefix;

    public String getRedisPrefix() {
        return redisPrefix;
    }

    public void setRedisPrefix(String redisPrefix) {
        this.redisPrefix = redisPrefix;
    }
}