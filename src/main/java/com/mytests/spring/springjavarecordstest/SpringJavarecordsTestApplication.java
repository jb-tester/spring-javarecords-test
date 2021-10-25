package com.mytests.spring.springjavarecordstest;

import com.mytests.spring.springjavarecordstest.qualifiedInjectionIntoRecord.Record12;
import com.mytests.spring.springjavarecordstest.spelTest.UseRecordWithMembers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJavarecordsTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringJavarecordsTestApplication.class, args);
    }
@Autowired
ApplicationContext ctx;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("qualified injection test:");
        Record12 r = ctx.getBean(Record12.class);
        System.out.println(r.b1().getId());
        System.out.println(r.bean2().getId());
        UseRecordWithMembers useRecordWithMembers = ctx.getBean(UseRecordWithMembers.class);
        useRecordWithMembers.display();
    }
}
