package com.training.interviewcodes;

public class countofCharactersInYourName {
public static void main(String[] args) {
	String name = "Teena Raghav";
//	char[] str = name.toCharArray();
//	int count=0;
//	for(char letter : str) {
//		if (letter != ' ') {
//		count++;
//		}
//	}
//	System.out.println(count);
	
	int uppercasecount = 0;
	int lowercasecount = 0;
	for(int i = 0; i < name.length(); i++) {
		char c = name.charAt(i);
		if(c != ' ') {
		if(Character.isUpperCase(c)) {
			uppercasecount++;
		}else {
			lowercasecount++;
		}
		}
	}
	System.out.println("uppercase letters are :" + uppercasecount);
	System.out.println("uppercase letters are :" + lowercasecount);
}
}
