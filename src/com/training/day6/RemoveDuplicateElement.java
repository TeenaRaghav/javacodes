package com.training.day6;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

import com.training.day2.ArraySorting;
public class RemoveDuplicateElement {
//	declaring generic type ArrayList  
	public static <T> ArrayList <T> removeDuplicates(ArrayList<T> arr){
		ArrayList<T> arr1 = new ArrayList<T>();
		for(T element : arr) {
			if(!arr1.contains(element)) {
				arr1.add(element);
			}
		}
		return arr1;
		
	}
	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,6,2,5,6,7,1,2,5));
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
		 
	System.out.println("list with duplicates :" + arr);

		  ArrayList<Integer> newlist = removeDuplicates(arr);
		  
		  System.out.println("list without duplicates" + newlist);
		 	
	}

}
