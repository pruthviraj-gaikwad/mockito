package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/course
//[{
// "id":1,
// "name":"Learn Aws",
// "author":"in28minutes"
//	
//}]
///course return above content
	
@RestController
public class CourseController {
	
	@Autowired
	private CurrencyServicesConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServicesConfiguration retrieveAllCourse(){
		return configuration;
	}
}
