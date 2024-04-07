package com.training.day3;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		boolean isPalindrome = true;
		
		for(int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println(s+" "+ "is a palindrome string.");
		}else {
			System.out.println(s+" " + "is not a palindrome string.");
		}
		
	}
}

