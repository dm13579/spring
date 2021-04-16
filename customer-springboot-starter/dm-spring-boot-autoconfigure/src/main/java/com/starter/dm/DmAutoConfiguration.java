package com.starter.dm;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * ,;,,;
 * ,;;'(
 * __      ,;;' ' \
 * /'  '\'~~'~' \ /'\.)
 * ,;(      )    /  |.
 * ,;' \    /-.,,(   ) \
 * ) /       ) / )|
 * ||        ||  \)
 * (_\       (_\
 *
 * @author dm
 * @version 1.0
 * @className DmAutoConfitguration
 * @cescription TODO
 * @date 2021/4/16 11:21
 * @slogan: 我自横刀向天笑，笑完我就去睡觉
 **/
@Configuration
@ConditionalOnProperty(prefix = "dm.enable", name = "auto", havingValue = "true")
@EnableConfigurationProperties(DmProperties.class)
@ConditionalOnClass({Slf4j.class, Data.class})
@Slf4j
public class DmAutoConfiguration {

    @Resource
    DmProperties dmProperties;

    @Bean
    @ConditionalOnMissingBean
    public UserServiceClient init() {
        log.info("================================初始化UserServiceClient================================");
        UserServiceClient userServiceClient = new UserServiceClient();
        String name = dmProperties.getName();
        userServiceClient.setName(name);
        userServiceClient.setWelcome("欢迎回来" + name);
        return userServiceClient;
    }
}
