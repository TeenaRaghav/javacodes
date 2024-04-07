package com.training.javahackathon;
import java.util.*;
public class TotalNumberOfLowerCaseUpperCaseAndInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		sc.close();
		
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		 int integerCount = 0;
		 
//we iterate through each character in input string
		 for(int i= 0; i <str.length(); i++) {
			 char ch = str.charAt(i);
			 if(Character.isUpperCase(ch)) {
				 uppercaseCount++; 
			 }if(Character.isLowerCase(ch)) {
				 lowercaseCount++;
			 }if(Character.isDigit(ch)) {
				 integerCount++;
			 }
		 }
		// print out the counts
			System.out.println("Number of uppercase characters :" + uppercaseCount);
			System.out.println("Number of lowercase characters :" + lowercaseCount);
			System.out.println("Number of integer value :" + integerCount);

		
	}
}
