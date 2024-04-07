package com.training.javahackathon;

import java.util.*;

public class PerformingOperationUsingPlusOperator {
	// Method to perform multiplication using only addition
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
    // Method to perform subtraction using only addition
    public static int subtract(int a, int b) {
        return a + negate(b);
    }
    // Method to negate a number using only addition
    public static int negate(int a) {
        int neg = 0;
        int temp = a < 0 ? 1 : -1;
        while (a != 0) {
            neg += temp;
            a += temp;
        }
        return neg;
    }
    // Method to perform division using only addition
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int quotient = 0;
        int dividend = Math.abs(a);
        int divisor = Math.abs(b);
        while (dividend >= divisor) {
            dividend = subtract(dividend, divisor);
            quotient++;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            quotient = negate(quotient);
        }
        return quotient;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		// Test multiplication
        System.out.println("Multiplication of "+ num1 + " and "+ num2 + " : " + multiply(num1, num2));

        // Test subtraction
        System.out.println("Subtraction of "+ num1 + " and "+ num2 + " : " + subtract(num1, num2));

        // Test division
        System.out.println("Division of " + num1 + " and " + num2 + " : " + divide(num1, num2));
   
		
	}
}
