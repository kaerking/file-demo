package com.example.serviceSupport.filedubboservice;

import com.example.api.FileInterface;
import com.example.entity.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileDubboServiceApplicationTests {

    @Autowired
    FileInterface fileInterface;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test1() {
        System.out.println("hhhhhhhhhhhhhhh");
        stringRedisTemplate.opsForValue().set("www","hello world");
        System.out.println(stringRedisTemplate.opsForValue().get("abc"));
    }
    @Test
    public void contextLoads() {
        File file =fileInterface.get("aa");
        System.out.println(file);
    }

}
