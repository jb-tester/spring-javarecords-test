package com.mytests.spring.springjavarecordstest.qualifiedInjectionIntoRecord;

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
public class ConfigForMultipleAutowiringCandidatesInjectionTest {

    @Bean("b11")
    public Bean1 bean11() {
        return new Bean1("b11");
    }
    @Bean("b12")
    public Bean1 bean12() {
        return new Bean1("b12");
    }

    @Bean("b21") @Qualifier("mybean21")
    public Bean2 bean21() {
        return new Bean2("b21");
    }
    @Bean @Qualifier("mybean22")
    public Bean2 bean22() {
        return new Bean2("b22");
    }


}
