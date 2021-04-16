package com.dm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Collections;

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
@Order(-1)
@Slf4j
public class MyDeferredImportSelector1 implements DeferredImportSelector {

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

//        return null;
//        return MyGroup.class;
        return MyDeferredImportSelector.MyGroup.class;
    }

    private static class MyGroup implements Group{

        AnnotationMetadata metadata;

        @Override
        public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
            this.metadata = metadata;
        }

        @Override
        public Iterable<Entry> selectImports() {
            log.info("MyDeferredImportSelector1");
            return Collections.singletonList(new Entry(this.metadata, "com.dm.bean.Log"));
        }
    }
}
