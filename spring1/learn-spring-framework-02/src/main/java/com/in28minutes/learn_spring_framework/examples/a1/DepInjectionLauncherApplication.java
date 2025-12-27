package com.in28minutes.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
//	@Autowired
	Dependecy1 dependency1;
	
//	@Autowired
	Dependecy2 dependency2;
	
//	@Autowired
//	public void setDependency1(Dependecy1 dependency1) {
//		System.out.println("Setter Injection - setDependency1 ");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependecy2 dependency2) {
//		System.out.println("Setter Injection - setDependency2 ");
//		this.dependency2 = dependency2;
//	}
	
//	@Autowired
	public YourBusinessClass(Dependecy1 dependency1, Dependecy2 dependency2) {
		super();
		System.out.println("constructor Injection - YourBusinessClass ");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	public String toString() {
		return "using " + dependency1 + " and "+dependency2;
	}	
}

@Component
class Dependecy1{
	
}

@Component
class Dependecy2{
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext
						(DepInjectionLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}

}
