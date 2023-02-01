package com.zeriter.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zeriter.common.security.annotation.EnableCustomConfig;
import com.zeriter.common.security.annotation.EnableZWFeignClients;
import com.zeriter.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 *
 * @author zeriterzhang
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableZWFeignClients
@SpringBootApplication
public class RunJobApplication {
    public static void main(String[] args){
        SpringApplication.run(RunJobApplication.class, args);
        System.out.println("----------(: 定时任务模块启动成功 :)----------");
    }
}
