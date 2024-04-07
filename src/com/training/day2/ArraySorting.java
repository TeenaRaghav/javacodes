package com.training.day2;
import java.util.*;
public class ArraySorting {
	public static void main(String[] args) {
		int[][] arr = {{5,7,2,4,8},{7,3,5,2,6}};
		String[][] str = {{"raja","john"},{"teena","queen"}};
		
		String a =Arrays.toString(arr);
		String b =Arrays.toString(str);
		System.out.println("values before sorting"+a);
		System.out.println("vlues before sorting"+ b);
		
		Arrays.sort(arr);
		Arrays.sort(str);
		
		System.out.println("values after sorting"+ a);
		System.out.println("values after sorting"+ b);
	}
}
