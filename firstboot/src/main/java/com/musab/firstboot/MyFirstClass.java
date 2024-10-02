package com.musab.firstboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Parent Bean")
public class MyFirstClass {

    public String sayHello() {
        return "Hello from FirstClass: >>>";
    }

//    @Bean
//    @Primary
//	public MyFirstClass getFistClass() {
//		return new MyFirstClass();
//	}
}
