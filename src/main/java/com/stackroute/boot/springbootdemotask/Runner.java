package com.stackroute.boot.springbootdemotask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    //Environment Variable is Accessed
    @Value("${spring.datasource.url}")
    String s;
    @Value("${seedTrack1.id}")
    int id1;
    @Value("${seedTrack1.name}")
    String name1;
    @Value("${seedTrack1.comment}")
    String comment;
    @Value("${seedTrack2.id}")
    int id2;
    @Value("${seedTrack2.name}")
    String name2;
    @Value("${seedTrack2.comment}")
    String comment2;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Command Line Runner");
    }
}
