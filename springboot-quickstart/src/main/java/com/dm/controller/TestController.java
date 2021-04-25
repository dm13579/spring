package com.dm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
  *@className TestController
  *@cescription TODO
  *@author dm
  *@date 2021/4/22 11:09
  *@slogan: 我自横刀向天笑，笑完我就去睡觉
  *@version 1.0
  **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public void Test(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("hello!");
        System.out.println("hello");
    }
}
