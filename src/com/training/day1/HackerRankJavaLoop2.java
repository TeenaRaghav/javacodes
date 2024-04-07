package com.training.day1;
import java.util.*;
public class HackerRankJavaLoop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//it reads the input for integer t which represents the number of test cases		
		System.out.println("enter the number of queries");
		int t = sc.nextInt();
		
		System.out.println("enter the value of a , b, n");
//	here, we enter the loop to iterate t times, once for each case
		for(int i = 0; i < t; i++) {
//	inside this, it reads three integers a, b, n i.e initial value, multiplier and iterations respectively.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
//inner loop iterates n times, in each iteration of this loop it calculates a new value for a followed by space.
		for(int j = 0; j < n; j++) {
//	in this line, the (int) is a type cast. it means it is converting the result of Math.pow(2,j) to an integer type.
//	the Math.pow(2,j) gives result in a double value.
			a = a + b * (int) Math.pow(2,j);
			System.out.print(a + " ");
		}
		System.out.println();
		}
		sc.close();
	}
}