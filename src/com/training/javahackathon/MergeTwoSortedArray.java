package com.training.javahackathon;

import java.util.*;

public class MergeTwoSortedArray {
	public static void mergeArrays(int[] a1, int size1, int[] a2, int size2) {
		int j = 0;
		for (int i = size1; i <= (size1 + size2 - 1); i++) {
//		add elements of array2 to array1
			a1[i] = a2[j];
			j++;
		}
		Arrays.sort(a1);
		System.out.println("Sorted arrays:" + Arrays.toString(a1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1 :");
		int size1 = sc.nextInt();

		System.out.println("Enter the size of array2 :");
		int size2 = sc.nextInt();

		int[] array1 = new int[size1 + size2];
		int[] array2 = new int[size2];
		System.out.println("Enter" + size1 + "sorted elements of Array1:");
		for (int i = 0; i <= size1; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter" + size2 + "sorted elements of Array2:");
		for (int i = 0; i < size2; i++) {
			array2[i] = sc.nextInt();
		}
		mergeArrays(array1, size1, array2, size2);
	}
}
