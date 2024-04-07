package com.training.day5;
import java.util.*;
public class SolutionsForMyCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCalculator my_cal = new MyCalculator();
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			
			try {
				System.out.println(my_cal.power(n, p));
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	
}
