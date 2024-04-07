package com.training.day7;
import java.util.*;
import java.util.Map.Entry;
public class Student {
	public static void main(String[] args) {
		Map<Integer,String> info = new TreeMap<Integer,String>();
		info.put(11,"joe");
		info.put(21,"rachel");
		info.put(24,"ross");
		info.put(1,"pheobe");
		info.put(14,"chandler");
		
		Set<Entry<Integer,String>> es = info.entrySet();
		Iterator<Entry<Integer,String>> it = es.iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> e = it.next();
			System.out.println(e);
		}
		
	}
}
