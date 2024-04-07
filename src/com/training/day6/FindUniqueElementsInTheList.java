package com.training.day6;

import java.util.ArrayList;

public class FindUniqueElementsInTheList {
	
	public static void main(String[] args) {
		
		
		  ArrayList<Integer> arr = new ArrayList<Integer>();
		  arr.add(1);
		  arr.add(5);
		  arr.add(6);
		  arr.add(2); 
		  arr.add(5);
		  arr.add(6);
		  arr.add(7);
		  arr.add(1);
		  arr.add(2); 
		  arr.add(5);
		 	
		ArrayList<Integer> uniqueElement = new ArrayList<Integer>();
		for(int i = 0; i < arr.size();i++) {
			/*
			 * // Overall, this statement is typically used in a loop iterating over
			 * elements of the ArrayList arr to selectively add elements to the
			 * uniqueElement collection. It ensures that only unique elements from arr are
			 * added to uniqueElement.
			 * !uniqueElement.contains(arr.get(i)) means "if the element is not already present in uniqueElement".
			 * then add it using uniqueElement.add(arr.get(i));
			 */
			if(!uniqueElement.contains(arr.get(i))){
				uniqueElement.add(arr.get(i));
			}
		}
		System.out.println(uniqueElement);
		}
}