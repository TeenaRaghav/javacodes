package com.training.javahackathon;

import java.util.*;

public class TotalNumOfRepeatedIntUpperLowercaseInString {
	public static void countOfDuplicateIntUpperLowerInString(String str) {

		Map<Character, Integer> charCounts = new HashMap<>();
		int repeatedIntegers = 0;
		int repeatedUpperCase = 0;
		int repeatedLowerCase = 0;

		for (char count : str.toCharArray()) {

			if (Character.isUpperCase(count)) {
				repeatedUpperCase++;
			}
			if (Character.isLowerCase(count)) {
				repeatedLowerCase++;
			}
			if (Character.isDigit(count)) {
				repeatedIntegers++;
			}
			charCounts.put(count, charCounts.getOrDefault(count, 0) + 1);
		}
		int repeatedCount = 0;
		for (int count : charCounts.values()) {
			if (count > 1) {
				repeatedCount += count;
			}
		}
		System.out.println("Total repeated characters :" + repeatedCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		sc.close();
		countOfDuplicateIntUpperLowerInString(str);

	}
}
///*
//* System.out.println("Total repeated UpperCase characters :" +
//* repeatedUpperCase);
//* System.out.println("Total repeated LowerCase characters :" +
//* repeatedLowerCase); System.out.println("Total repeated Integers:" +
//* repeatedIntegers);
//*/
