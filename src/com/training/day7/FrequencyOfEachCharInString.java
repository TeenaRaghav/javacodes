package com.training.day7;

import java.util.*;

public class FrequencyOfEachCharInString {
	public static void main(String[] args) {
	String inputstring = "Roses are Red.";
	char[] str1 =inputstring.toLowerCase().toCharArray();
	
	Map<Character,Integer> frequencymap = new HashMap<>();
	
	for(char ch : str1) {
		/*
		 * update the frequency count of a character ch in the frequencyMap map.
		 * 
		 * If ch is not present in the map, it returns the default value 0. This is
		 * achieved using the getOrDefault() method, which takes two arguments: the key
		 * (ch) and the default value (0).
		 * 
		 * Once the current frequency count is obtained (or the default value 0 if ch is
		 * not present), 1 is added to it to increment the count. The updated frequency
		 * count (old count + 1) is then stored back in the frequencyMap map with the
		 * character ch as the key. This is done using the put() method of the Map
		 * interface, which takes two arguments: the key (ch) and the value (the
		 * incremented count).
		 */
		 		frequencymap.put(ch,frequencymap.getOrDefault(ch, 0)+1);
	}
	
	System.out.println("character frequencies :");
	Set<Map.Entry<Character, Integer>> es =  frequencymap.entrySet();
	for(Map.Entry<Character, Integer> entry : es) {
		System.out.println("key : " + entry.getKey()+" " + "value : " + entry.getValue());
	}
	
//	
//	String[] str = inputstring.toLowerCase().split("");
//	List<String> list =new ArrayList<>(Arrays.asList(str));
////	
//	for(String str1 : list) {
//		if()
//	}
//	
//	int count = Collections.frequency(list,"r");
//	System.out.println(count);
	
	
	}
}
