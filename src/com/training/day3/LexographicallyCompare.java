package com.training.day3;
import java.util.*;
public class LexographicallyCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean results = A.equalsIgnoreCase(B);
//		if A is larger than B ;i.e string A comes after string B in alphabetical order then its lexicographically larger than B
		if(results == true) {
		System.out.println("yes");}
//		}if(results==0) {
//			System.out.println("equal");
//		}
		else {
			System.out.println("No");
		}
	}
}

/*
 * Here's how lexicographic order works:
 * 
 * Comparison by Characters: Strings are compared character by character from
 * left to right. First Different Character: If two strings have the same
 * characters up to a certain point, but one string is longer than the other,
 * the longer string is considered greater. Case Sensitivity: By
 * default,uppercase letters are considered less than lowercase letters. For
 * example,'A' comes before 'a'. Unicode Values: If all characters are the same,
 * the string with the smaller Unicode value (in terms of its first differing
 * character) comes first. For example:
 * 
 * "apple" comes before "banana" because 'a' comes before 'b'. "apple" comes
 * before "apples" because "apple" is shorter than "apples". "Apple" comes
 * before "apple" because 'A' comes before 'a' in Unicode. In Java, you can
 * compare strings lexicographically using the compareTo() method or by using
 * the <, <=, >, >=, equals(), and equalsIgnoreCase() operators.
 * Additionally,the String class provides the compareToIgnoreCase() method to
 * perform a lexicographic comparison while ignoring case differences
 */