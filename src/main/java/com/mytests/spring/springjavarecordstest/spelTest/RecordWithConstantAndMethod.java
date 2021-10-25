package com.mytests.spring.springjavarecordstest.spelTest;

/**
 * *
 * <p>Created by irina on 10/25/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
public record RecordWithConstantAndMethod(String param1, String param2) {

public static final String MYCONST = "constant from record";
public String someMethod(){
    return (param1+" "+param2).toUpperCase();
}
}
