package com.mytests.spring.springjavarecordstest.spelTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/25/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Component
public class UseRecordWithMembers {
    @Value("#{@recordWithMembersBean.param1()}")
    String spel_test1;
    @Value("#{@recordWithMembersBean.myMethod('aaa')}")
    String spel_test2;
    @Value("#{T(com.mytests.spring.springjavarecordstest.spelTest.RecordWithConstantAndMethod).MYCONST}")
    String spel_test3;
    @Value("#{new com.mytests.spring.springjavarecordstest.spelTest.RecordWithConstantAndMethod('aaa','bbb').someMethod()}")
    String spel_test4;

    public void display() {
        System.out.println("SpEL test: \n"+ spel_test1+"\n"+ spel_test2+"\n"+ spel_test3+"\n"+ spel_test4+"\n"
        );
    }

    ;
}
