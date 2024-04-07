package com.training.day7;

import java.util.*;

public class ColUtilityClassPrac {
	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(11);
		ob.add(9);
		ob.add(12);
		ob.add(11);
		ob.add(22);
		ob.add(27);
		
		System.out.println("elements in the list : " + ob );
		
		Collections.sort(ob);
		System.out.println("elements in the list after sorting : " + ob );

// to perform binary search , list should be sorted
		System.out.println("the object 9 is at position :"+ Collections.binarySearch(ob, 9));
		System.out.println("Max value in list  :"+ Collections.max(ob));
		System.out.println("Min value in list :" + Collections.min(ob));
		System.out.println("the count of num 11 in list :"+ Collections.frequency(ob, 11));
		
		
		
	}
}
