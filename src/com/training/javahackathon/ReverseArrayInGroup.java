package com.training.javahackathon;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInGroup {
	public static void reverse(int[] arr, int grp) {
		int len = arr.length;
		for(int i = 0; i < len; i =i+grp) {
			int start = i;
			int end = Math.min(i+grp-1, len-1);
			while(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the number of grouping:");
		int grp = sc.nextInt();
		
		System.out.println("Original Array elements are: " +Arrays.toString(arr));
		reverse(arr, grp);
		System.out.println("Array elements after reversing in group:");
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
