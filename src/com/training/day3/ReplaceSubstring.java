package com.training.day3;

public class ReplaceSubstring {
	public static void main(String[] args) {
		String str1 = "Dog chases cat, cat chases rat";
		String str2 = "My cat chases rat.";
		
		String str3 = "abc7d";
		System.out.println("Old String str3: " + str3);
		String update3 = str3.replaceAll("[0-9]", "abcd");
		System.out.println("Updated String : " + update3);

		
		System.out.println("Old String str: " + str1);
		String update1 = str1.replace("cat", "rat");
		System.out.println("Updated String : " + update1);

		System.out.println("Old String str1: " + str2);
		String update2 = str2.replace("chases", "eats");
		System.out.println("updated String : " + update2);
	}
}
//3.WJP to replace each substring Stirng "Dog chases cat , cat chases rat" replace cat with rat.
