package com.training.day5;
import java.util.*;
public class ExceptionHandleDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int result = x / y;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
	}
}
