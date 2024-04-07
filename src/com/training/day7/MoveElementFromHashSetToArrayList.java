package com.training.day7;

import java.util.*;

public class MoveElementFromHashSetToArrayList {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(11);
		h1.add(9);
		h1.add(12);
		h1.add(11);
		h1.add(22);
		h1.add(27);
		System.out.println("elemnets in HashSet : " + h1);
		ArrayList<Integer> l1 = new ArrayList<>(h1);
		Collections.sort(l1);
		System.out.println("elements in ArrayList :" + l1);
		
		
		

	}
}
