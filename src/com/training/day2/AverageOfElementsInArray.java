package com.training.day2;

public class AverageOfElementsInArray {
//	method to calculate average of an array
	public static double calculateAverage(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum/ arr.length;
		
	}
	public static void main(String[] args) {
		int[] arr = {3,7,2,8};
//		calculate average
		double average = calculateAverage(arr);
		
		System.out.println("Average of the array elements:" + average);

	}

}
