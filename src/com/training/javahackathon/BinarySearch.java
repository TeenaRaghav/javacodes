package com.training.javahackathon;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] binaryArray = new int[5];
		System.out.println("Enter 5 array elements in ascending order");
		for (int i = 0; i < 5; i++) {
			binaryArray[i] = sc.nextInt();
		}

//		input the target element to search

		System.out.println("Enter the target element to search");
		int target = sc.nextInt();

		int first = 0;
		int last = binaryArray.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;

			if (binaryArray[mid] == target) {
				System.out.println("Element is found in the index :" + mid);
				break;
			} else if (binaryArray[mid] > target) {
//		search in the right half
				last = mid - 1;
			} else {
//				search in the left half
				first = mid + 1;
			}
//			element not found
			if (first > last) {
				System.out.println("Element is not found in the array");

			}

		}
	}
}