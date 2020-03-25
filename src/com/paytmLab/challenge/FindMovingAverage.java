package com.paytmLab.challenge;

public class FindMovingAverage {

	public static void main(String[] args) {
		// Moving average of last N number is windowSize
		int windowSize = 3;

		MovingAverageService movingAvgService = new MovingAverageService(windowSize);

		movingAvgService.addElement(3.0);
		movingAvgService.addElement(5.0);
		movingAvgService.addElement(8.0);
		movingAvgService.addElement(6.0);
		movingAvgService.addElement(4.0);

		if (movingAvgService.getMovingAverage() != null)
			System.out.println("Moving average of last " + windowSize + " number added in List "
					+ movingAvgService.getElements() + " is " + movingAvgService.getMovingAverage());

	}

}
