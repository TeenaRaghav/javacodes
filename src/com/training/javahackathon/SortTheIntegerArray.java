package com.training.javahackathon;

import java.util.*;

public class SortTheIntegerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

//	enter the elements in array
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		String a = Arrays.toString(arr);
//	for printing array
		System.out.println("array before sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);

		System.out.println("array after sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
