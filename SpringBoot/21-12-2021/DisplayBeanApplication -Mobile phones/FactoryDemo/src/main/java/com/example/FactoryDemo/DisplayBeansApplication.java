package com.example.FactoryDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DisplayBeansApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DisplayBeansApplication.class, args);
		OnePlus onePlus  = context.getBean(OnePlus.class);
		Oppo oppo = context.getBean(Oppo.class);
		onePlus.displayFeaturesOfOnePlusFeature();
		oppo.displayFeatureOppo();
		System.out.println("===========Beans loaded by spring boot================");
		int count = context.getBeanDefinitionCount();
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("THE COUNT OF BEANS USED: " +count);
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}


	}
}


/*//@SpringBootApplication
//public class FactoryDemoApplication {
//
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(FactoryDemoApplication.class, args);
//			System.out.println("===========Beans loaded by spring boot================");
//			String[] beanNames = context.getBeanDefinitionNames(); //return array of bean names
//			int count=0;
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//				count++;
//			}
//			System.out.println("Spring Beans loaded are :" +count);
//		};
//	}


*/