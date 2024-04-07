package com.training.day2;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
	public static void areaOfRectangle(int w, int h) {
		int area = w * h;
		System.out.println("Area of Rectangle is :" + area);
	}
	
	public static void perimeterOfRectangle(int w, int h) {
		int perimeter = 2 * (w + h);
		System.out.println("Perimeter of Rectangle is :" + perimeter);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width :");
		int w = sc.nextInt();
		
		System.out.println("Enter Height :");
		int h = sc.nextInt();
		
		areaOfRectangle(w,h);
		perimeterOfRectangle(w,h);
	}
}
//to print the area(width*height) and perimeter(2*(width+height)) of a rectangle
//
