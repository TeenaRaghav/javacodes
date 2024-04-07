package com.training.javahackathon;
import java.util.*;
public class DuplicateCharacterInString {
public static void displayDuplicateCharacters(String str) {
//	convert the string to lowercase to handle case-insensitive duplicates
	str = str.toLowerCase();
	
//	create a hashmap to store characters and their counts
	Map<Character, Integer> charCountMap = new HashMap<>();
	
//	iterate through the string to count occurrences of each character
	for(char c : str.toCharArray()) {
//		exclude non-letter charcters
		if (Character.isLetter(c)) {
//			update the count of the character in the HashMAp
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) +1);
		}
	}
//	iterate through the hashmap to displayduplicate characters
	System.out.println("Duplicate characters in the string : ");
	for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		if (entry.getValue() > 1) {
			System.out.println(entry.getKey());
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		displayDuplicateCharacters(str);
	}

}
