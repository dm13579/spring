package com.dm.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

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
  * @ClassName:SayHello 
  * @Description:TODO
  * @author dm
  * @date 2019/12/25
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
public class SayHello implements ApplicationContextAware{

    private  ApplicationContext applicationContext;

    public String sayHello(){
        boolean b = applicationContext.containsBean("book11");
        System.out.println(b);
        return "hello";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
