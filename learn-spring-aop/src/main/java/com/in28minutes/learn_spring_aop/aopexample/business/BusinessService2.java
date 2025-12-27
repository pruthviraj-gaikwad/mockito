package com.in28minutes.learn_spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.in28minutes.learn_spring_aop.aopexample.annotations.TrackTime;
import com.in28minutes.learn_spring_aop.aopexample.data.DataServices2;

@Service
public class BusinessService2 {
	
		private DataServices2 dataServices2;
		
		public BusinessService2(DataServices2 dataServices2) {
			this.dataServices2 = dataServices2;
		}
		
		@TrackTime
		public int calculataMin() {
			int [] data = dataServices2.retrieveData();
//			throw new RuntimeException("something went Wrong1");
			
			return Arrays.stream(data).min().orElse(0);
		}
		//business logic
		//Data
}
