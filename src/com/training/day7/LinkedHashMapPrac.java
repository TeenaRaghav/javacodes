package com.training.day7;
import java.util.*;
//import java.util.LinkedHashMap;
import java.util.Map.Entry;
//import java.util.Set;

public class LinkedHashMapPrac {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> ob = new LinkedHashMap<Integer,String>();
		
		ob.put(111,"Sangeetha");
		ob.put(202,"preethi");
		ob.put(113,"Shalu");
		ob.put(110,"Rupali");
		ob.put(115,"Sanjay");
		ob.put(202,null);
		
		Set<Entry<Integer,String>> es = ob.entrySet();
		Iterator<Entry<Integer,String>> it = es.iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> a = it.next();
			System.out.println(a);
		}
	}
}
