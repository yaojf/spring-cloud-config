package com.yaojiafeng.spring.cloud.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Properties;

/**
 * @author yaojiafeng
 * @create 2017-07-04 下午7:29
 */
@Configuration
public class MyAutoConfiguration {


    @Bean("properties")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Properties getProperties() {
        Properties properties = new Properties();
        properties.setProperty("key", getString());
        return properties;
    }


    /**
     * 条件bean在ConfigurationClassPostProcessor对beanMethod的解析时
     * 调用Condition接口返回false时
     * 不会添加到BeanDefinitionRegistry
     * 也就是在beanDefinitionMap添加阶段屏蔽掉bean
     *
     * @return
     */
    @Bean
    @Conditional(TestCondition.class)
    public String getString() {
        return "123456";
    }

    private static class TestCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return false;
        }
    }

}
