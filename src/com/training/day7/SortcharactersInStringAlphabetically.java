package com.training.day7;

import java.util.*;

public class SortcharactersInStringAlphabetically {
	public static void main(String[] args) {
	String inputString = "Dog chases cat.";
	String[] str = inputString.toLowerCase().split("");
	List<String> str1 = new ArrayList<String>(Arrays.asList(str));
	Collections.sort(str1);
	System.out.println(str1);

	

	
	
	
	}
}
