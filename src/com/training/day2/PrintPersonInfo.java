package com.training.day2;

//this line import the scanner class from java.util package to use scanner class to take input from user
import java.util.*;

public class PrintPersonInfo {
	public static void main(String[] args) {
//		this line creates a new scanner object and assigned it to variable sc
		Scanner sc = new Scanner(System.in);

//		this line prompts the user to enter their name.the user's input is then stored in variable name 
		System.out.println("Enter Name: ");
		String name = sc.nextLine();

//		this line prompts  the user to input their age. the user's input is then stored in variable age	
		System.out.println("Enter Age: ");
		String age = sc.nextLine();

//		this line prompts the user to enter their gender and then user's input is then stored in variable gender
		System.out.println("Enter Gender: ");
		String gender = sc.nextLine();

//		this line prompts the user to enter their address and then user'sinput is then stored in variable address
		System.out.println("Enter Address: ");
		sc.close();
//	to read the address that contain whitespace characters, you can use next method. next method reads the next token fron the input.
//	A token is a sequence of characters that are seperated by whitespace characters.
		String address = sc.nextLine();

// 	this will read the address one token at a time, and it will concatenate the tokens together to form a single string.
//		the loop will continue to read tokens until there are no more tokens
//		while(sc.hasNext()){
//			address += sc.nextLine();
//			break;
//		}
//		
//		this line splits the address string into the array of strings using space character as a delimiter, this means that each element 
//		of the array is the word from address

		String[] addresslines = address.split(" ");

//		this loop will iterate over addresslines array and print each line of the address to the console
		for (String line : addresslines) {
			System.out.println(line);
		}
//		
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Gender :" + gender);
		System.out.println("Address :" + address);

	}
}
