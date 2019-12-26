package com.dm.autowire;

import org.springframework.beans.factory.annotation.Autowired;
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
  * @ClassName:Man 
  * @Description:男
  * @author dm
  * @date 2019/12/24
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
@Component
public class Man implements Person{

    private Women women;

    @Autowired
    public Man(Women women) {
        this.women = women;
    }

    @Override
    public void eat() {
        System.out.println("man is person");
    }

    @Override
    public boolean sex(){
        return true;
    }

    public void get(){
        women.eat();
    }
}
