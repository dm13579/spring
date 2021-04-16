package com.dm.bean;

import lombok.Data;

import java.io.Serializable;

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
  *@className A
  *@cescription TODO
  *@author dm
  *@date 2021/4/14 21:21
  *@slogan: 我自横刀向天笑，笑完我就去睡觉
  *@version 1.0
  **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -7761734499440959939L;

    private String id;

    private String name;
}
