package com.financier.system.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * redis工具类.
 * @author proteincode
 */
@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 过期时间设置
     */
    public static final long EXPIRE_TIME=1;

    /**
     * 读取缓存
     * @param key
     * @return
     */
    public String get(final String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 写入缓存
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key,String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //设置过期时间，这里设置为 1 秒
        Duration duration = Duration.ofMinutes(EXPIRE_TIME);
        //设置定时删除
        redisTemplate.expire(key,duration);
        return result;
    }

    /**
     * 删除缓存数据
     * @param key
     * @return
     */
    public boolean delete(final String key) {
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
