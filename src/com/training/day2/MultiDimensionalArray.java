package com.training.day2;
import java.util.Arrays;
import java.util.*;
public class MultiDimensionalArray {
	public static void main(String[] args) {
//		String[] str = {"teena","hema","sita","priya"};
//		int[][] arr1 = {{2,5,3},{8,7,9}};
//		System.out.println(Arrays.deepToString(arr1));
//		System.out.println(Arrays.toString(str));
		
		int[][] arr1 = new int[3][2];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[2][0] = 5;
		arr1[2][1] = 6;
//		if you want to print multidimensional arrays,we use deepToString() from Arrays class  
		System.out.println(Arrays.deepToString(arr1));
		
		
	}
}
