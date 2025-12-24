package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplTest {
	
	
	
	@Test
	void findGreatestFrom_all() {
		
		DataServiceStub1 dataServiceStub1 = new DataServiceStub1();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub1);
		int result = someBusinessImpl.findGreatestFromAllData();
		assertEquals(25,result);
	}
	
	@Test
	void findGreatestFrom_one() {
		DataServiceStub2 dataServiceStub2 = new DataServiceStub2();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub2);
		int result = someBusinessImpl.findGreatestFromAllData();
		assertEquals(25,result);
	}
	
}

class DataServiceStub1 implements DataService{
	
	@Override
	public int[] retriveAllData() {
		return new int[]{12,32,31};
	}
}

class DataServiceStub2 implements DataService{
	
	@Override
	public int[] retriveAllData() {
		return new int[]{12};
	}
}


