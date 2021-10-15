package com.mytests.spring.springjavarecordstest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 10/14/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Configuration
public class Config1 {



    @Bean
    public Bean4 b4() {
        return new Bean4();
    }

}
