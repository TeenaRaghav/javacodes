package com.training.day7;

import java.util.*;
import java.util.Map.Entry;

public class HashMapPrac {
	public static void main(String[] args) {
		HashMap<Integer, String> ob = new HashMap<Integer, String>();
		ob.put(111, "Sangeetha");
		ob.put(202, "preethi");
		ob.put(113, "Shalu");
		ob.put(110, "Rupali");
		ob.put(115, "Sanjay");
		ob.put(202, null);

//		for(String values :ob.values()) {
//			System.out.println(values);
//			
//		}
//		
//		System.out.println(ob.get(110));
//		in HashMap we cannot use iterator directly,so we are converting it to set and then iterate it using iterator
//		here,making set object of entry type using .entrySet()
		Set<Entry<Integer, String>> es = ob.entrySet();
		Iterator<Entry<Integer, String>> it = es.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
