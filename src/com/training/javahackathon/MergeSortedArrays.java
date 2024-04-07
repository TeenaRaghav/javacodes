package com.training.javahackathon;

public class MergeSortedArrays {
	public static void mergeArrays(int[] A, int m , int[] B) {
//		last index of array A
		int i = m - 1;
//		last index of array B
		int j = B.length - 1 ;
//		last index of merged array
		int k = A.length - 1;
		
//		merge A and B fron the end of the arrays
		while (i >= 0 && j >= 0) {
			if (A[i] > B[j]) {
				A[k] =A[i];
				i--;
			}else {
				A[k] = B[j];
				j--;
			}
			k--;
		}
		while (j >= 0) {
			A[k]= B[j];
			j--;
			k--;
		}
	}
	public static void main(String[] args) {
		int[] A = {1, 3, 5, 7, 9, 0, 0, 0, 0};
		int[] B = {2, 4, 6, 8};
		mergeArrays(A,5,B);
		System.out.println("Merged array: ");
		for(int num : A) {
			System.out.print(num + " ");
		}
	}
}
