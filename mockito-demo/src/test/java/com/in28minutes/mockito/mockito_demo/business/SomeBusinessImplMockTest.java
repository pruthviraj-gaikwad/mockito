package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplMockTest {
	
	
	
	@Test
	void findGreatestFrom_all() {

		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retriveAllData() => new int[] {23,11,33);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {25,33,22});
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = someBusinessImpl.findGreatestFromAllData();
		assertEquals(25,result);
	}
	
	
}




