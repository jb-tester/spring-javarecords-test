package com.mytests.spring.springjavarecordstest.qualifiedInjectionIntoRecord;

/**
 * *
 * <p>Created by irina on 10/14/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
public class Bean2 {
    public String getId() {
        return id;
    }

    private final String id;

    public Bean2(String b11) {
        this.id = b11;
    }
}
