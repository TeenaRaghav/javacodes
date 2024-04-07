package com.training.javahackathon;

import java.util.*;

public class ConvertStringToInt {
	public static void StringToInt(String str) {
		try {
			int number = Integer.valueOf(str);
//		int  number = Integer.parseInt(str);
		System.out.println("String: " + str);
		System.out.println("integer: " + number);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Input!");
		}
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str= sc.nextLine();
		sc.close();
		StringToInt(str);
	}
}
