package com.paytmLab.challenge;

import java.util.List;

public interface IMovingAverage<T> {

	/**
	 * Get the moving average of the last N elements added
	 * @return moving average of last N elements
	 */
    public T getMovingAverage();
    
    /**
     * Add an element to the data structure
     * @param element to be added
     */
    public void addElement(T element);
    
    /**
	 * Get List of all the elements in given data structure
	 * @return List of all the elements
	 */
	public List<T> getElements();
	
	/**
	 * Get specific element from given index 
	 * @return element at given index
	 */
	public T getElement(int index);
}
