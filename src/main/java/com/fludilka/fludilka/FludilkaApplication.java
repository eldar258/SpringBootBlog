package com.fludilka.fludilka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication
public class FludilkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FludilkaApplication.class, args);
    }

}
