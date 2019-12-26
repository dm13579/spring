package com.dm.testbeandefinitionpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName TulingApplicationListener
 * @Description TODO
 * @Author dm
 * @Date 2019/11/26 21:33
 * @Version 1.0
 **/
@Component
public class DmBeanDefinitionPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("DmBeanDefinitionPostProcessor的postProcessBeanDefinitionRegistry方法");
        System.out.println("bean定义的数据量："+beanDefinitionRegistry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(DmLog.class);
        beanDefinitionRegistry.registerBeanDefinition("dmLog",rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("DmBeanDefinitionPostProcessor的postProcessBeanFactory方法");
        System.out.println(configurableListableBeanFactory.getBeanDefinitionCount());
    }
}
