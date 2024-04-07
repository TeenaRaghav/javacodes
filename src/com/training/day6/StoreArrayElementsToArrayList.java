package com.training.day6;
import java.util.*;
public class StoreArrayElementsToArrayList {
	public static void main(String[] args) {
		
//		homogenous array declaration
		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		arr.add(4,0);
//		declaration of hetrogenous array means it can contain any type of data 
//		ArrayList arr = new ArrayList();
		/*
		 * arr.add(1); arr.add("teena"); arr.add(3.0); arr.add(null);
		 */
		/*
		 * for(int i=0; i<arr.size();i++) { System.out.print(arr.get(i)+ " "); }
		 */
//		System.out.println(arr);
//printing heterogenous arraylist using for each loop	
		/*
		 * for(Object data : arr) { System.out.println(data); }
		 */
		
		
//		printing homogenous ArrayList using for each loop
		for(int data : arr) {
			System.out.println(data);
		}
	}
}
