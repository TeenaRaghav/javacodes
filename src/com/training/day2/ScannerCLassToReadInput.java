package com.training.day2;

import java.util.*;

public class ScannerCLassToReadInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	Read Integer value
		System.out.println("Enter an integer: ");
		int a = sc.nextInt();
//	Read Double value
		System.out.println("Enter a double: ");
		double b = sc.nextDouble();
//	Read Float value
		System.out.println("Enter a float: ");
		float c = sc.nextFloat();
		System.out.println("Enter a boolean value : ");
		boolean d = sc.nextBoolean();

//	Printing the values	
		System.out.println("Int value :" + a);
		System.out.println("Double value :" + b);
		System.out.println("Float value :" + c);

//		perform arithmetic
		int sum = (int) (a + b + c);
		float product = (float) (a * b * c);
		double divide = a / b;

		if (a < b) {
			System.out.println("The boolean value is " + d);
		} else {
			d= false;
			System.out.println(d);
		}

		System.out.println("Sum of INteger,double,float: " + sum);
		System.out.println("Product of INteger,double,float: " + product);

	}
}
