package com.training.day2;

import java.util.Arrays;

public class SortNumericAndStringArray {
public static void main(String[] args) {
	
//	Numeric Array
	int[] numericArray = {3,7,2,8,1};
	System.out.println("Original numeric array:" + Arrays.toString(numericArray));
	
//	Sorting numeric array
	Arrays.sort(numericArray);
	System.out.println("Sorted numeric array:" + Arrays.toString(numericArray));
	
//	String Array
	String[] stringArray = {"kiwi", "orange","apple", "grapes"};
	System.out.println("Original String array:" + Arrays.toString(stringArray));
	
//	Sorting String array
	Arrays.sort(stringArray);
	System.out.println("Sorted String array:" + Arrays.toString(stringArray));
	
}
}
