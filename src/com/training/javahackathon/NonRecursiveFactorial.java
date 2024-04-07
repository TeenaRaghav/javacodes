package com.training.javahackathon;

import java.util.*;

public class NonRecursiveFactorial {
	public static int findFactorial(int n) {
		if (n == 0) {
			System.out.println("enter the valid number.");
		}
		int result =  1;
		for (int i = n; i >= 1; i--) {
			result = result * i;
		}
		return result;
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
