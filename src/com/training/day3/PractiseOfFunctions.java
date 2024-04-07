package com.training.day3;
import java.util.*;
public class PractiseOfFunctions {
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine(); 
		  String s1 =sc.nextLine();
//		String sb = s.substring(4);
//		System.out.println(s.repeat(3));
//		System.out.println(sb);
//		System.out.println(s.charAt(3));
//		System.out.println(s.compareTo(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.startsWith("te"));
		System.out.println(s.endsWith("h"));
		if (s.isEmpty()== true) {
			System.out.println("String is empty.");
		}else {
			System.out.println("String is not empty.");
		}
		System.out.println(s.replaceAll("pritish","teena"));
		System.out.println(s.substring(2, 4));
		System.out.println(s.equals(s1));
	}
}

