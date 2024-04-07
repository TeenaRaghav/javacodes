package com.training.day3;

import java.util.*;

public class FirstLetterUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1)) +" "+
				B.substring(0, 1).toUpperCase().concat(B.substring(1)));
}
}
