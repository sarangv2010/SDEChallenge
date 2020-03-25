package com.paytmLab.challenge;

import java.util.ArrayList;
import java.util.List;


public class MovingAverageService implements IMovingAverage<Double> {
	private List<Double> allElementsList;
	private double sum;
	private int windowSize;

	public MovingAverageService(int windowSize) {
		allElementsList = new ArrayList<>();
		this.windowSize = windowSize;
	}

	@Override
	public void addElement(Double element) {
		if (element != null && element >= 0) {
			allElementsList.add(element);
			sum += element;
			if (allElementsList.size() > windowSize) {
				// at any point of time sum variable holds sum of last N number (windowSize)
				sum -= allElementsList.get(allElementsList.size() - windowSize - 1);
			}
		}
	}

	@Override
	public Double getMovingAverage() {
		if (windowSize > 0 && (allElementsList.size() > windowSize || allElementsList.size() == windowSize)) {
			return sum / windowSize;
		} else if (allElementsList.size() < windowSize) {
			System.out.println("Cannot find average. List size is " + allElementsList.size()
					+ " which is less than given N=" + windowSize);
		}
		return null;
	}

	@Override
	public List<Double> getElements() {
		return allElementsList;
	}

	@Override
	public Double getElement(int index) {
		if (!allElementsList.isEmpty()) {
			return allElementsList.get(index);
		}
		return null;
	}

}
