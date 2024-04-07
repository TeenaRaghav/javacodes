package com.training.day7;

import java.util.*;

public class UniqueWordInAString {
	public static void main(String[] args) {
        String inputString = "This is a test string. This string contains some repeated words. This is just a test.";
        
		String[] s = inputString.split("\\W+");
//		creating set to store unique words
		Set<String> ob = new HashSet<>();
		
		for(String word : s) {
			String lowercaseword = word.toLowerCase();
			if(!ob.contains(lowercaseword)){	
				ob.add(lowercaseword);
			}
		}
		
		System.out.println("unique words: " + ob);
	}
}
