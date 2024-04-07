package com.training.javahackathon;

import java.util.*;

public class IntegerArrayIsPalindrome {
	public static boolean isPalindrome(int[] arr) {
//		use two pointers to compare elements from the start and end of the array
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

		// enter the elements in array
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		boolean isboolean = isPalindrome(arr);
		if (isboolean == true) {
			System.out.println("Array is palindrome");
		} else {
			System.out.println("Array is not palindrome");
		}

	}
}
