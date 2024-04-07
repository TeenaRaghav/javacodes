package com.training.javahackathon;

import java.util.Scanner;

public class FactorialUsingRecurssion {
	public static int findFactorial(int n) {
		if (n == 0) {
			return 1;
			
		}else {
			return n * findFactorial(n-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int result = findFactorial(n);
		System.out.println("The factorial of " + n + " is :" + result);

		sc.close();
	}
}
