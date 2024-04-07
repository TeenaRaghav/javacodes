package com.training.day6;
import java.util.*;
public class CompareTwoArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("cat");
		arr1.add("dog");
		arr1.add("rat");
		arr1.add("cow");
		
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("cat");
		arr2.add("rat");
		arr2.add("dog");
		arr2.add("cow");
		arr2.add("bull");
		
		System.out.println("ArrayList 1= "+ arr1);
		System.out.println("ArrayList 2= "+ arr2);
		
//		to compare two arraylist if they are equal or not we use equals()
		
		if(arr1.equals(arr2) == true) {
			System.out.println("ArrayLists Are equal.");
		}
		else {
			System.out.println("ArrayList are not equal.");
		}
		
	}
}
