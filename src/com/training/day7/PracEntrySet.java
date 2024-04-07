package com.training.day7;

import java.util.*;

public class PracEntrySet {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(20, "apple");
		map.put(30, "banana");
		map.put(50, "mango");
		map.put(30, "appple");

		Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer,String>>it = entrySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
//		for(Map.Entry<Integer,String> entry : entrySet) {
//			Integer key = entry.getKey();
//			String value =entry.getValue();
//			System.out.println("key : " + key + "|" +"value: " + value);
//		}
	}
}