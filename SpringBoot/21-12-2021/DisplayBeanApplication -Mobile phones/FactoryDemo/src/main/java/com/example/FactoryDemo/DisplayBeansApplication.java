package com.example.FactoryDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class DisplayBeansApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DisplayBeansApplication.class, args);
		OnePlus onePlus  = context.getBean(OnePlus.class);
		Oppo oppo = context.getBean(Oppo.class);
		onePlus.displayFeaturesOfOnePlusFeature();
		oppo.displayFeatureOppo();
		System.out.println("===========Beans created by user================");
		List<Object> myBeans = Arrays.stream(context.getBeanDefinitionNames())
				.filter(beanName -> context.getBean(beanName).getClass().getPackage().getName().startsWith("com.example.FactoryDemo"))
				.map(context::getBean)
				.collect(Collectors.toList());
		System.out.println("THE COUNT OF BEANS USED: " + myBeans.size());
		myBeans.forEach((k) -> {
			System.out.println(k);
		});

		System.out.println("\n\n");
		System.out.println("===========Beans loaded by spring boot================");
		int count = context.getBeanDefinitionCount();
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("THE COUNT OF BEANS USED: " + count);
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
