package com.mytests.spring.springjavarecordstest.spelTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 10/25/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Configuration
public class RecordBeansConfig {
    @Bean
    public RecordWithMembers recordWithMembersBean(){
        return new RecordWithMembers("p1","p2");
    }
}
