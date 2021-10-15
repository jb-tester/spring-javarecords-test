package com.mytests.spring.springjavarecordstest.injectIntoRecordNavigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/14/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Component
public class FieldInjectionCompo {
    @Autowired private CompoToInject compo_field_injection;

}
