package com.training.day7;

import java.util.*;

public class PracArraysAsListMethod {
	public static void main(String[] args) {
		String[] str = {"apple","banana","grapes"};
		List<String> str1 = new ArrayList<String>(Arrays.asList(str));
		System.out.println(str1);
	}
}
