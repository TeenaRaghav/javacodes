package com.training.day2;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
	public static void areaOfCircle(int r) {
		double area = Math.PI * r* r;
		System.out.println("Area of Circle is :" + area);
	}
	
	public static void perimeterOfCircle(int r) {
		double perimeter = 2 * Math.PI * r;
		System.out.println("Perimeter of Circle is :" + perimeter);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		int r = sc.nextInt();
		
		areaOfCircle(r);
		perimeterOfCircle(r);
	}
}
