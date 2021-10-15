package com.mytests.spring.springjavarecordstest.recordAsBeanMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/15/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Component
public class RecordInjectingField {

    @Autowired
    private BeanRecord1 b1;

    public BeanRecord1 getB1() {
        return b1;
    }
}
