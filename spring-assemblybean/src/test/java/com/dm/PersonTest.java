package com.dm;

import com.dm.autowire.PersonConfig;
import com.dm.autowire.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
  * @ClassName:PersonTest 
  * @Description:人-》测试
  * @author dm
  * @date 2019/12/24
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersonConfig.class)
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void testAutowired(){
        person.eat();
    }

}
