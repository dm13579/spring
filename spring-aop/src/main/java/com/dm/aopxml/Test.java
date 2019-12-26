package com.dm.aopxml;

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
  * @Description:aop xml形式
  * @author dm
  * @date 2019/12/26
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
        MyCalculatorImpl myCalculator = (MyCalculatorImpl)ctx.getBean("myCalculator"); // 控制反转
        myCalculator.add(1,3);
        myCalculator.min(1,5);
    }
}
