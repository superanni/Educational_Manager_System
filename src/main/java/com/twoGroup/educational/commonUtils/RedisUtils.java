package com.twoGroup.educational.commonUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * redis操作工具类.</br>
 * (基于RedisTemplate)
 * @author 黄彬朕
 * @Date   19.06.03
 */
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    /**
     * 判断key是否存在
     * @param key 键
     * @return true 存在 false不存在
     */
    public boolean hasKey(String key){
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public Object get(final String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 写入缓存
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            redisTemplate.setKeySerializer(new StringRedisSerializer());
            if (hasKey(key)){
                delete(key);
            }
            redisTemplate.opsForValue().set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除缓存
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

    /**
     * 分页查询缓存
     */
    public Object selectByPage(String list,int currentPage,int pageSize){
        List l1= (List) get(list);
        List l2=new ArrayList();
        int i=0;
        for (Object o:l1){
            if (i>=currentPage*pageSize-pageSize&&i<currentPage*pageSize){
                l2.add(o);
            }
            i++;
        }
        return l2;
    }
}
