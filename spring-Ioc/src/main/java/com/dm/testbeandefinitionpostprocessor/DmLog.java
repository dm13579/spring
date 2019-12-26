package com.dm.testbeandefinitionpostprocessor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName DmLog
 * @Description TODO
 * @Author dm
 * @Date 2019/11/26 21:55
 * @Version 1.0
 **/
//@Component
public class DmLog {
    @Value("1")
    private int flag;

    public DmLog() {
        System.out.println("我是DmLog的构造方法");
    }

    @Override
    public String toString() {
        return "DmLog{" +
                "flag=" + flag +
                '}';
    }
}
