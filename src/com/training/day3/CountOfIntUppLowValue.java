package com.training.day3;

public class CountOfIntUppLowValue {
	public static void main(String[] args) {
		
//	we declare a String variable named str and initialize it with value "Hello Java 8", this is the input string we want to analyze
		String str = "Hello Java 8";
		
///	here, we declare three integer variables and initialized to 0. these variables will be used to count the number of
//	uppercase characters, lowercase, integer in the input string
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitCount = 0;
		
//	we used for loop to iterate through each character in the input string
		for(int i = 0; i < str.length(); i++) {
//	inside the loop for each character ch, we use Character.isUpperCase(ch) method to check. if it is, it will increment the count by 1.	
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercaseCount++;			
//	similarly for lowercase
			}else if(Character.isLowerCase(ch)) {
				lowercaseCount++;
//	here as well			
			}else if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		
// print out the counts
		System.out.println("Number of uppercase characters :" + uppercaseCount);
		System.out.println("Number of lowercase characters :" + lowercaseCount);
		System.out.println("Number of digits :" + digitCount);
		
	}

}
//5.WJP to find the number of Integers , uppercase, lowecase characters in a given String "Hello Java 8"
//Integer - 1 uppercase - 2 lowercase - 7

