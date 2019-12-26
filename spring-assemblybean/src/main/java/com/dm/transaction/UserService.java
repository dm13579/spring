package com.dm.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
  * @ClassName:UserService 
  * @Description:转账模拟Service
  * @author dm
  * @date 2019/12/26
  * @slogan: 我自横刀向天笑，笑完我就去睡觉
  * @version V1.0
  */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Transactional
    public void updateMoney() {
        userDao.addMoney("zhangsan", 200);
        // 故意报异常，看是否事务了
        int i = 1 / 0;

        userDao.minMoney("lisi", 200);
    }
}
