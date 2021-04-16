package com.dm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

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
  *@className MyDeferredImportSelector
  *@cescription TODO
  *@author dm
  *@date 2021/4/14 21:20
  *@slogan: 我自横刀向天笑，笑完我就去睡觉
  *@version 1.0
  **/
@Order(0)
@Slf4j
public class MyDeferredImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.dm.bean.User"};
    }

    /**
     * 返回值为空调用MyDeferredImportSelector#selectImports
     * 不为空调用MyGroup#process selectImports
     */
    @Override
    public Class<? extends Group> getImportGroup() {
        return MyGroup.class;
    }

    public static class MyGroup implements DeferredImportSelector.Group{

        AnnotationMetadata metadata;

        @Override
        public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
            this.metadata = metadata;
        }

        @Override
        public Iterable<Entry> selectImports() {
            log.info("MyDeferredImportSelector");
            return Collections.singletonList(new Entry(this.metadata, "com.dm.bean.Log"));
        }
    }
}
