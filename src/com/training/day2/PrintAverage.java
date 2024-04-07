package com.training.day2;
import java.util.*;
public class PrintAverage {
	public static void printSum(int a, int b, int c ) {
		System.out.println("The sum of a, b, c is :" + (a+b+c));
		}
	public static void findAverage(int a, int b, int c) {
		double avr = (a+b+c)/3;
		System.out.println("The Average of numbers is:" + avr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println("Enter third number :");
		int c = sc.nextInt();
		printSum(a,b,c);
		findAverage(a,b,c);
	}
}
//Accept three numbers from the keyboard and print the sum and average of them

