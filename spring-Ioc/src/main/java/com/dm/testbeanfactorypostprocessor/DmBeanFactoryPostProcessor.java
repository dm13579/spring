package com.dm.testbeanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName TulingApplicationListener
 * @Description TODO
 * @Author dm
 * @Date 2019/11/26 21:33
 * @Version 1.0
 **/
@Component
public class DmBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    // bean 解析之后，没有实例化前对bean操作
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("IOC容器调用了DmBeanFactoryPostProcessor的postProcessBeanFactory方法");
        for(String name:configurableListableBeanFactory.getBeanDefinitionNames()){
            if("dmLog".equals(name)){
                BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
                // 可以将bean从默认改为懒加载
                beanDefinition.setLazyInit(true);
            }
        }
    }
}
