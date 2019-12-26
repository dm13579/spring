package com.dm.testspringiocstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName DmService
 * @Description TODO
 * @Author dm
 * @Date 2019/11/26 21:01
 * @Version 1.0
 **/
@Service
public class DmService {

    @Autowired
    private DmDao dmDao;

}
