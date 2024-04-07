package com.training.day2;
import java.util.*;

public class ArrayContainsValue {

	public static boolean containsValue(int[] array, int value) {
//	iterate through each element
		for (int element : array) {
			if (element == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
//		Numeric Array
		int[] arr = { 3, 7, 2, 8, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find it : ");
		int value = sc.nextInt();

		System.out.println("Numeric Array contains " + value + " : " + containsValue(arr, value));
	}

}
