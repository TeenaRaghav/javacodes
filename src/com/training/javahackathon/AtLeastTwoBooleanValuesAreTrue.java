package com.training.javahackathon;

import java.util.*;

public class AtLeastTwoBooleanValuesAreTrue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the boolean value of a : ");
		boolean a = sc.nextBoolean();

		System.out.println("enter the boolean value of b : ");
		boolean b = sc.nextBoolean();

		System.out.println("enter the boolean value of c : ");
		boolean c = sc.nextBoolean();

// count the number of true values
		int count = (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0);
// check if at least two booleans are true
		if (count >= 2) {
			System.out.println("At least 2 out of 3 booleans are true.");
		} else {
			System.out.println("2 out of 3 booleans are not true.");
		}
	}
}
