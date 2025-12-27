package com.in28minutes.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BussinessService{
	public DataService dataService;
	
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService; 
	}
	
	public DataService getDataService() {
		System.out.print("setter injection performed \n");
		return dataService;
	}
	
	
}

@Component
class DataService{
		
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext
						(CdiContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.print(context.getBean(BussinessService.class).getDataService());
			
			
		}
	}

}
