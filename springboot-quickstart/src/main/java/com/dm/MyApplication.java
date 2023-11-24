package com.dm;

import com.starter.dm.UserServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import java.util.Arrays;

/**
  *                  ,;,,;
  *                ,;;'(    
  *      __      ,;;' ' \   
  *   /'  '\'~~'~' \ /'\.)  
  * ,;(      )    /  |.     
  *,;' \    /-.,,(   ) \    
  *     ) /       ) / )|    
  *     ||        ||  \)     
  *    (_\       (_\
  *@className MyApplication
  *@cescription 启动类
  *@author dm
  *@date 2021/4/14 13:37
  *@slogan: 我自横刀向天笑，笑完我就去睡觉
  *@version 1.0
  **/
@SpringBootApplication
@Slf4j
public class MyApplication implements CommandLineRunner {

    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private UserServiceClient userServiceClient;

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MyApplication.class);
        springApplication.addListeners(new MyApplicationListener());
        springApplication.run();
    }

    @Override
    public void run(String... args) {
        // 测试springboot starter
        String[] names = applicationContext.getBeanDefinitionNames();
        Arrays.stream(names).forEach(log::info);
        log.info(userServiceClient.toString());
        log.info("项目启动成功，容器注入javaBean:{}个.",names.length);
    }
}
