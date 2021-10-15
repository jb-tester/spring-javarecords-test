package com.mytests.spring.springjavarecordstest.qualifiedInjectionIntoRecord;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/14/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Component
public record Record12(@Qualifier("b11") Bean1 b1, @Qualifier("mybean21") Bean2 bean2) {

}
