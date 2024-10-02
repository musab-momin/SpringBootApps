package com.musab.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(FirstbootApplication.class, args);

		MainService mainService = ctx.getBean(MainService.class);
		System.out.println(mainService.tellStory());
		System.out.println("Host OS name is: " + mainService.getOsName());
	}

//	@Bean
//	public MyFirstClass getFistClass() {
//		return new MyFirstClass();
//	}

}
