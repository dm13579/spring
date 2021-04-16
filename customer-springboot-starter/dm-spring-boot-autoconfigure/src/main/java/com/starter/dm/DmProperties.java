package com.starter.dm;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
  *@className DmProperties
  *@cescription TODO
  *@author dm
  *@date 2021/4/16 11:22
  *@slogan: 我自横刀向天笑，笑完我就去睡觉
  *@version 1.0
  **/
@ConfigurationProperties(prefix = "dm")
@Data
public class DmProperties {

    private String name;

}
