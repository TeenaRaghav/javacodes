package com.training.javahackathon;

import java.util.Scanner;

public class RemoveCharacterFromTheString {
	public static String removeCharacter(String str,char ch) {
//		create a stringBuffer to store the modified string
		StringBuffer buffer = new StringBuffer();
//		iterate through each character in the input string
		for(int i = 0; i < str.length(); i++) {
//			if the charcter is no equal to the given character,
//			append it to the string buffer
			if(str.charAt(i) != ch) {
				buffer.append(str.charAt(i));
			}
		}
//		convert the stringbuffer back to a string and return it
		return buffer.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		System.out.println("Enter the character to remove :");
//		read the first character of the input
		char charToRemove = sc.next().charAt(0);
		
		sc.close();
		System.out.println("Original String : " + str);
		String result = removeCharacter(str,charToRemove);
		System.out.println("Modified string:" + result);
		

	}
}
