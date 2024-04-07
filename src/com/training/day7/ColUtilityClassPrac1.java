package com.training.day7;
import java.util.*;
public class ColUtilityClassPrac1 {
	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("teena");
		ob.add("shsgd");
		ob.add("shsgd");
		ob.add("happy");
		ob.add("prince");
		ob.add("friends");
		ob.add("rachel");
		
		System.out.println("elements in the list : " + ob );
		
		Collections.sort(ob);
		System.out.println("elements in the list after sorting : " + ob );

// to perform binary search , list should be sorted
		System.out.println("the object \"shsgd\" is at position :"+ Collections.binarySearch(ob, "shsgd"));
		System.out.println("Max value in list  :"+ Collections.max(ob));
		System.out.println("Min value in list :" + Collections.min(ob));
		System.out.println("the count of num 11 in list :"+ Collections.frequency(ob,"shsgd"));
		


		
		
	}
}
