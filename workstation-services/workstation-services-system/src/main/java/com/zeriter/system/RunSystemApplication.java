package com.zeriter.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zeriter.common.security.annotation.EnableCustomConfig;
import com.zeriter.common.security.annotation.EnableZWFeignClients;
import com.zeriter.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 *
 * @author zeriterzhang
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableZWFeignClients
@SpringBootApplication
public class RunSystemApplication {
    public static void main(String[] args){
        SpringApplication.run(RunSystemApplication.class, args);
        System.out.println("----------(: 系统模块启动成功 :)----------");
    }
}
