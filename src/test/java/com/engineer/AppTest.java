package com.engineer;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app;
    
	@Before
	public void setup(){
		app = new App();
	}
	
	@Test
	public void getSum() {
		assertEquals(10, app.sum(5, 5));
	}
}
