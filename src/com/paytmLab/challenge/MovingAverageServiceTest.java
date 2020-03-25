package com.paytmLab.challenge;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MovingAverageServiceTest {

	private IMovingAverage<Double> movingAverage;

	@Before
	public void init() {
		int windowSize=3;
		movingAverage = new MovingAverageService(windowSize);
	}

	@Test
	public void testAddElement() {
		movingAverage.addElement(3.0);
		movingAverage.addElement(7.0);
		movingAverage.addElement(9.0);
		assertEquals(7.0, movingAverage.getElement(1), 0.1);
	}

	@Test
	public void testGetMovingAverage() {
		movingAverage.addElement(2.0);
		movingAverage.addElement(5.0);
		movingAverage.addElement(3.0);
		assertEquals(3.33, movingAverage.getMovingAverage(), 0.1);
		movingAverage.addElement(6.0);
		movingAverage.addElement(11.0);
		assertEquals(6.66, movingAverage.getMovingAverage(), 0.1);
	}
	
	@Test
	public void testListSizeGreaterThanN(){
		movingAverage.addElement(2.0);
		movingAverage.addElement(5.0);
		assertEquals(null, movingAverage.getMovingAverage());
	}
	
}
