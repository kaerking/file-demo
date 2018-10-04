package com.example.serviceSupport;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.example.dao")
@EnableCaching
public class FileDubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileDubboServiceApplication.class, args);
    }
}
