package com.training.day3;

public class FindGivenWord {
	public static boolean isWordPresent(String s, String word ) {
		String[] sentence = s.split(" ");
		for(String temp : sentence) {
			if(temp.equals(word)) {
			
			return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String s = "I am learning qa automation testing";
		String word = "am";
		
		if(isWordPresent(s,word)) {
			System.out.println("yes it is present");
		}else {
			System.out.println("No it is not present");
		}
		
		
		
//		boolean result = s.contains(word);
//		System.out.println(result);
	}
}
//2.Check the given word is present in a give String . String S = "I am learning qa automation testing" word ="qa".

