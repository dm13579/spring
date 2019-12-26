package com.dm.testapplicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MainClass
 * @Description TODO
 * @Author dm
 * @Date 2019/11/26 21:32
 * @Version 1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ctx.publishEvent(new ApplicationEvent("手动发布") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        ctx.close();
    }
}
