package com.dm.transaction;

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
  * @ClassName:Test 
  * @Description:Spring事务
  * @author dm
  * @date 2019/12/26
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.updateMoney();
    }

}
