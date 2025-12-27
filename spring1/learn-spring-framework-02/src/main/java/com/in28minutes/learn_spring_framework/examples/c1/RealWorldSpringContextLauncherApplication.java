package com.in28minutes.learn_spring_framework.examples.c1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = 
				new AnnotationConfigApplicationContext
						(RealWorldSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
	
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}
 
}
