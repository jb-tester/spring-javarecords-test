package com.mytests.spring.springjavarecordstest.recordAsBeanMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 10/15/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Configuration
public class ConfigForRecordBean {
    @Bean
    public BeanRecord1 b1() {
        return new BeanRecord1("brecord1");
    }
}
