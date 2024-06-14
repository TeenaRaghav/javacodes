package com.training.leetCode;

public class GCDPractise {
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
		
	}
	public static void main(String[] args) {
		int a = 16;
		int b = 8;
	
		int greatestCommonDivisor = gcd(a,b);
		System.out.println(greatestCommonDivisor);
	
	
	}

}
