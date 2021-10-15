package com.mytests.spring.springjavarecordstest.qualifiedInjectionIntoRecord;

/**
 * *
 * <p>Created by irina on 10/14/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
public class Bean1 {
    public String getId() {
        return id;
    }

    private final String id;

    public Bean1(String b11) {
        this.id = b11;
    }
}
