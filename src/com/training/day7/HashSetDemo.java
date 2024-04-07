package com.training.day7;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> ob = new HashSet<Integer>();
		ob.add(22);
		ob.add(2);
		ob.add(6);
		ob.add(17);
		ob.add(null);
		ob.add(null);
		ob.add(22);
//		returns true or false and remove specified element;
		System.out.println(ob.remove(22));
		System.out.println("size :"+ob.size());
		
		
//		iterate by for-each loop
//		for(int num : ob) {
//		System.out.println(num);
//		iterate through iterator
		Iterator<Integer> it = ob.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
