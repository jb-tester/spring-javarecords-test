package com.mytests.spring.springjavarecordstest.injectIntoRecordNavigation;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/15/2021.</p>
 * <p>Project: spring-javarecords-test</p>
 * *
 */
@Component
public class ConstructorInjectionCompo {

    public ConstructorInjectionCompo(CompoToInject compo_constructor_injection) {

        this.compo = compo_constructor_injection;

    }


    private final CompoToInject compo;



}
