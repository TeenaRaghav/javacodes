package com.training.day3;

public class CharacterCountBetweenStrings {
	public static void main(String[] args) {
//	declare two variables s1 and s2. s2 stores the string "o", which we want to find occurrences of and count characters between them
		String s1 = "I Love Java Programming";
		String s2 = "o";
		
//	find the index of first occurrence of s2 within s1 using indexOf().
//	this ensures we start counting characters after the first occurrence of s2. 
		int startIndex = s1.indexOf(s2) + s2.length();
		
//	we find the index of second occurrence of s2 within s1,starting the search from the index obtained in the previous step.
//	this finds the second occurrence of s2.
		int endIndex = s1.indexOf(s2,startIndex);
		
//	we extract the substring between two occurrences of s2 using substring().
//	this substring contains the characters between the first and the second occurrences of s2.
		String substringBetween = s1.substring(startIndex,endIndex);
		
//	we remove all spaces from the extracted substring using replaceAll() with the regular expression "\\s".
//	we find the length of the substring after removing spaces.
//	this length represents the count of characters between occurrences of s2.
		String substring = substringBetween.replaceAll("\\s","");
				int charCount = substring.length();
		
//		printing out the count of characters
		System.out.println("Number of characters between the occurences of o :" + charCount);
	}
}

