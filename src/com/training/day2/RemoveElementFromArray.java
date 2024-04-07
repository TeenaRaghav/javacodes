package com.training.day2;

import java.util.*;

public class RemoveElementFromArray {
public static void main(String[] args) {
	    Integer[] arr = {1, 2, 3, 4, 5};
	    int elementToRemove = 3;

	    // Convert the array to an ArrayList
	    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

	    // Remove the element from the ArrayList
	    list.remove(Integer.valueOf(elementToRemove));

	    // Convert the ArrayList back to an array
	    arr = list.toArray(new Integer[0]);

	    // Print the updated array
	    for (int i = 0; i < arr.length; i++) {
	        System.out.println(arr[i]);
	    }
	}
}
