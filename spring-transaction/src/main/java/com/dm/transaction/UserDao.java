package com.dm.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
  * @ClassName:UserDao 
  * @Description:数据库操作
  * @author dm
  * @date 2019/12/26
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addMoney(String username, Integer money) {
        jdbcTemplate.update("update account set money=money+? where username=?", money, username);
    }

    public void minMoney(String username, Integer money) {
        jdbcTemplate.update("update account set money=money-? where username=?", money, username);
    }

}
