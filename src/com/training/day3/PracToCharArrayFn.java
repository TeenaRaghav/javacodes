package com.training.day3;

import java.util.*;

public class PracToCharArrayFn {
	public static void main(String[] args) {
		String str ="I am happy.";
		char[] str1 = str.toCharArray();
		
		  for(char a : str1){
			  System.out.print(a); 
			  }
		 
	}
}
/*
 * The toCharArray() method is a built-in method in Java that belongs to the
 * String class. It is used to convert a string into a character array.
 *  It is called on a string object and returns an array of characters.
 *  Each character in the string is converted into an element in the array, preserving the order of characters in the string.
 *  Modifications to the character array will not affect the original string, and vice versa.

 *  
 */