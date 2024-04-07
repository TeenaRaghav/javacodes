package com.training.day2;
import java.util.*;
public class ArithmeticOperations {
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int subtract(int a, int b) {
		return a-b;
	}
	
	
	public static double divide(int a, int b) {
		return a/b;
	}
	
	public static int mod(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		
		System.out.println("sum of a and b is:" + sum(a,b));
		System.out.println("Multiplication of a and b is: "+multiply(a,b));
		System.out.println("Difference of a and b is : " + subtract(a,b));
		System.out.println("division of a and b is: " + divide(a,b));
		System.out.println("Modulo of a and b is : " + mod(a,b));
	}
}
//to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//