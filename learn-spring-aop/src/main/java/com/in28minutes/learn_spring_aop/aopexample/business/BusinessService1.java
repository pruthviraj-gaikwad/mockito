package com.in28minutes.learn_spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.in28minutes.learn_spring_aop.aopexample.annotations.TrackTime;
import com.in28minutes.learn_spring_aop.aopexample.data.DataServices1;

@Service
public class BusinessService1 {
	
		private DataServices1 dataServices1;
		
		public BusinessService1(DataServices1 dataServices1) {
			this.dataServices1 = dataServices1;
		}
		
		@TrackTime
		public int calculataMax() {
			int [] data = dataServices1.retrieveData();
//			throw new RuntimeException("something went Wrong1");
			
			return Arrays.stream(data).max().orElse(0);
		}
		//business logic
		//Data
}
