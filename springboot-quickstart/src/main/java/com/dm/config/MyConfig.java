package com.dm.config;

import com.dm.MyDeferredImportSelector;
import com.dm.MyDeferredImportSelector1;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
  *@className MyConfig
  *@cescription TODO
  *@author dm
  *@date 2021/4/14 21:36
  *@slogan: 我自横刀向天笑，笑完我就去睡觉
  *@version 1.0
  **/
@Configuration
@Import({MyDeferredImportSelector.class, MyDeferredImportSelector1.class})
public class MyConfig {
}
