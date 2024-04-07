package com.training.day3;
import java.util.*;
public class AnagramsStrings {
	public static boolean isAnagrams(String a, String b) {
		String A = a.toLowerCase();
		String[] arr1 = A.split("");
		Arrays.sort(arr1);
		
		String B = b.toLowerCase();
		String[] arr2 = B.split("");
		Arrays.sort(arr2);
		
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	String s2 = sc.next();
	sc.close();
	boolean result = isAnagrams(s1,s2);
	System.out.println((result) ? "Anagrams" : "Not Anagrams");
}
}


// two words are anagrams of each other if they contain the same letters in a different order and of same length.