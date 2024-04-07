package com.training.javahackathon;

import java.util.*;

public class PositiveNumberCombinations {
	public static void findConsecutiveSums(int N) {
		int start = 1;
		int end = (N + 1)/ 2;

		while (start < end) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				sum += i;
				if (sum == N) {
					printConsecutiveNumbers(start, i);
					break;
				}
				if (sum > N)
					break;
			}
			start++;
		}
	}

	public static void printConsecutiveNumbers(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(i);
			if(i < end)
				System.out.print(" + ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Possible consecutive number combinations:");
//		for(int i = 1; i < num; i++) {
//			int sum = 0;
//			int x = i;
//			String sumCombo = "";
//			while(sum < num) {
//				sum = sum + x;
//				sumCombo = sumCombo + x + "+";
//				x++;
//			}
//			if (sum == num) {
//				System.out.println(sumCombo.substring(0, sumCombo.length() - 1));;
//			}
//		}
		findConsecutiveSums(num);
	}
}
