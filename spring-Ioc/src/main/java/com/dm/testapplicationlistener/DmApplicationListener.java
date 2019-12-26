package com.dm.testapplicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TulingApplicationListener
 * @Description TODO 创建一个监听器
 * @Author dm
 * @Date 2019/11/26 21:33
 * @Version 1.0
 **/
@Component
public class DmApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("DmApplicationListener 接收到一个事件"+event);
    }
}
