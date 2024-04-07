package com.training.javahackathon;

import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		StringBuffer buffer = new StringBuffer(sc.nextLine());
		System.out.println(buffer.reverse());
		
	}
}
