package com.training.javahackathon;

import java.util.*;

public class CheckPalindromeForNumAndString {
	public static boolean isPalindromeNumber(int num) {
		String numStr = String.valueOf(num);
		String[] numArr = numStr.split("");
		int left = 0;
		int right = numArr.length - 1;
		while (left < right) {
			if (!numArr[left].equals(numArr[right])) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static boolean isPalindromeString(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number : ");
		int num = sc.nextInt();
		System.out.println("enter the String : ");
		String str = sc.next();

		if (isPalindromeNumber(num)) {
			System.out.println("it is an palindrome number.");
		} else {
			System.out.println("it is not palindrome number.");
		}
		if (isPalindromeString(str)) {
			System.out.println("it is an palindrome String.");
		} else {
			System.out.println("it is not palindrome String.");
		}

	}
}
