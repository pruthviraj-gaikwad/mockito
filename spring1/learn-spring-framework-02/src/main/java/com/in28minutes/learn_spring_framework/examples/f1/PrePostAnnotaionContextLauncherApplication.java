package com.in28minutes.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependent some;
	
	public SomeClass(SomeDependent some) {
		super();
		this.some = some;
		System.out.println("all dependent are ready!!!");
	}
	
	@PostConstruct
	public void initialization() {
		System.out.println("initialization");
	}
	
	@PreDestroy
	public void clean() {
		System.out.println("cleanup!!");
	}
		
}


@Component
class SomeDependent{
	
}

@Configuration
@ComponentScan
public class PrePostAnnotaionContextLauncherApplication { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext
						(PrePostAnnotaionContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			
		}
	}

}
