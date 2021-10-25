package com.mytests.spring.springjavarecordstest.spelTest;

/**
 * *
 * <p>Created by irina on 10/25/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
public record RecordWithMembers(String param1, String param2) {
    public RecordWithMembers(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    public String myMethod(String arg1) {
        return "RecordWithMembers(" + param1+", "+param2+") method with " + arg1;
    }
}
