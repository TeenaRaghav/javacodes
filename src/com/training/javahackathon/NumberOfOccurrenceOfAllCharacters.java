package com.training.javahackathon;

import java.util.*;

public class NumberOfOccurrenceOfAllCharacters {
	public static void numberOfOccurenceOfAllCharacters(String str) {
//		convert the string to lowercase to handle case-insensitive duplicates
		str = str.toLowerCase();
		
//		create a hashmap to store characters and their counts
		Map<Character, Integer> charCountMap = new HashMap<>();
		
//		iterate through the string to count occurrences of each character
		for(char c : str.toCharArray()) {
			if(!String.valueOf(c).isBlank())
//				update the count of the character in the HashMAp
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) +1);
		}
//		iterate through the hashmap to display all characters and occurrence of it 
		System.out.println("Numberof occurrence of all the characters in the string : ");
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		
				System.out.println(entry.getKey()+ " - " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		numberOfOccurenceOfAllCharacters(str);
	}
}
