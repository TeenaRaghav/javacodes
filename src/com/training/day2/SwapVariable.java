package com.training.day2;

public class SwapVariable {
	public static void main(String[] args) {
		System.out.println("Before Swapping");
		int a = 6;
		System.out.println("a = " + a);
		int b = 5;
		System.out.println("b = " + b);

		/*
		 * int c = a; a = b; b = c;
	
		 */
//		without using 3rd variable
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("After Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
