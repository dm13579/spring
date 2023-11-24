package com.dm.testspringiocstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MainClass
 * @Description TODO
 * @Author dm
 * @Date 2019/11/26 20:45
 * @Version 1.0
 **/
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ctx.getBean(DmDao.class));
    }
}
