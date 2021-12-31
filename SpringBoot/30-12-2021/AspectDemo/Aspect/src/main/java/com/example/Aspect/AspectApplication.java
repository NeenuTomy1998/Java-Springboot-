package com.example.Aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(AspectApplication.class, args);
		Student student=context.getBean(Student.class);
		student.show();
		student.shown("shown");
	}

}
