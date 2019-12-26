package com.dm.aopxml;

import com.dm.aop.Action;
import org.springframework.stereotype.Component;

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
  * @ClassName:MyCalculatorImpl 
  * @Description:TODO
  * @author dm
  * @date 2019/12/26
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class MyCalculatorImpl {

    public int add(int a,int b){
        return a+b;
    }

    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
