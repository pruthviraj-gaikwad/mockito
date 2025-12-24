package com.in28minutes.mockito.mockito_demo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findGreatestFromAllData() {
		
		int[] data = dataService.retriveAllData();
		int min = Integer.MIN_VALUE;
		
		for(int value:data) {
			if(value>min) {
				min = value;			
			}
		}
		
		return min;
	}
}

interface DataService{
	
	int[] retriveAllData();
	
}
