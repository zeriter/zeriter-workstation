package com.zeriter.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zeriter.common.security.annotation.EnableCustomConfig;
import com.zeriter.common.security.annotation.EnableZWFeignClients;
import com.zeriter.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 *
 * @author zeriterzhang
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableZWFeignClients
@SpringBootApplication
public class RunGenApplication {
    public static void main(String[] args){
        SpringApplication.run(RunGenApplication.class, args);
        System.out.println("----------(: 代码生成模块启动成功 :)----------");
    }
}
