package com.training.javahackathon;

import java.util.*;

public class ConvertIntToString {
	public static void intToString(int n) {
		try {
			
			String str = Integer.toString(n);
			System.out.println("integer value :"+ n);
			System.out.println("String value :"+ str);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("invalid input!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value :");
		int num = sc.nextInt();
		sc.close();
		intToString(num);
		
	}
}
