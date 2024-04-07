package com.training.javahackathon;

public class MergeSortUsingRecussion {
	public static void mergeSort(int[] array) {
		if (array.length <= 1) {
			return;
		}
		int middle = array.length / 2;
		int[] leftarr = new int[middle];
		int[] rightarr = new int[array.length - middle];
//		populate leftArray
		for (int i = 0; i < middle; i++) {
			leftarr[i] = array[i];
		}
//		populate rightArray
		for (int i = middle; i < array.length; i++) {
			rightarr[i - middle] = array[i];
		}
		mergeSort(leftarr);
		mergeSort(rightarr);
		merge(array, leftarr, rightarr);
	}private static void merge(int[] array, int[] leftarr, int[] rightarr) {
		int i = 0, j = 0, k = 0;

		while (i < leftarr.length && j < rightarr.length) {
			if (leftarr[i] <= rightarr[j]) {
				array[k++] = leftarr[i++];
			} else {
				array[k++] = rightarr[j++];
			}
		}
//		copy remaining elements from leftarr, if any
		while (i < leftarr.length) {
			array[k++] = leftarr[i++];
		}
//		copy remaining elements from rightarr, if any
		while (j < rightarr.length) {
			array[k++] = rightarr[j++];
		}
	}
	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Given array :");
		printArray(array);
		
		mergeSort(array);
		
		System.out.println("\nSorted array :");
		printArray(array);
	}
}
