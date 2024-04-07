package com.training.day2;

public class MaxAndMinValueInArray {
//	method to find maximum value in an array
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
//	method to find minimum value in an array
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,7,2,8,1};
		
//		find max and min values
		int max = findMax(arr);
		int min = findMin(arr);
		
// 		print the results
		System.out.println("Maximum value:" + max);
		System.out.println("Minimum value:" + min);
	}
}
