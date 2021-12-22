package com.example.bootdemo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//command line runner

@SpringBootApplication
public class BootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	//	System.out.println("Hello there");

	}
	//implement methods of commandLineRunner
	@Override
	public void run(String...args){
		System.out.println("Command Line Runner"); //executed first and arguments coming from command line
	}

}
//Application Runner

//@SpringBootApplication
//public class BootDemoApplication implements ApplicationRunner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = SpringApplication.run(BootDemoApplication.class, args);
//		System.out.println(context);
//
//	}
//		//implement methods of commandLineRunner
//		//arguments coming from application
//
//		@Override
//		public void run (ApplicationArguments args) throws Exception {
//			System.out.println(args);
//		}
//
//
//	}

















