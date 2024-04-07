package com.training.javahackathon;

import java.util.*;
public class AscendingorderSelectionSort {
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
//			swap the found minimum  with the first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
//			System.out.println(arr[i]);
		}
	}
	public static void printingArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
//		enter the elements of the array
		System.out.println("enter the elements to an array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//		printing the array
		System.out.println("Array before selection sort : ");
		printingArray(arr);
//		calling selection sort function
		selectionSort(arr);
//		printing the array
		System.out.println("Array after selection sort : ");
		printingArray(arr);
	}
}
