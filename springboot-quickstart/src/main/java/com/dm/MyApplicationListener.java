package com.dm;

import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<SpringApplicationEvent>, Ordered {
    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ConfigurableEnvironment environment = ((ApplicationEnvironmentPreparedEvent) event).getEnvironment();
            System.out.println("环境准备好了，"+environment);
        }
        if (event instanceof ApplicationStartingEvent) {
            System.out.println("容器启动了");
        }

    }

    @Override
    public int getOrder() {
        return 0;
    }

}
