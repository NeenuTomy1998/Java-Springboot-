package com.example.bootdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class FactoryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
			System.out.println("===========All Spring Beans loaded by spring boot================");
			String[] beanNames = context.getBeanDefinitionNames(); //return array of bean names
			int count=0;
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
				count++;
			}
			System.out.println(count);
		};
	}

}
