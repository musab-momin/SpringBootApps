package com.musab.firstboot;


import org.springframework.context.annotation.Bean;

public class ApplicationConfig {
    @Bean
    public MyFirstClass getFirstClassObj() {
        return new MyFirstClass();
    }
}
