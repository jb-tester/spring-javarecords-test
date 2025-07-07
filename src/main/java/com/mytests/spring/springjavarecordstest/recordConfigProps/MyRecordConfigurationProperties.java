package com.mytests.spring.springjavarecordstest.recordConfigProps;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("rec")
public record MyRecordConfigurationProperties(String prop1,
                                              String prop2,
                                              int prop3) {
}