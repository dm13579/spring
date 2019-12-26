package com.dm.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
  * @ClassName:test 
  * @Description:TODO
  * @author dm
  * @date 2019/12/25
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Book book = (Book) ctx.getBean("book");
        System.out.println(book);

        SayHello sayHello = new SayHello();
        sayHello.setApplicationContext(ctx);
        sayHello.sayHello();
    }
}
