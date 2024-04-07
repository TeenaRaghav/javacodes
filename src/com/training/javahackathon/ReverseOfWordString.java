package com.training.javahackathon;
import java.util.*;

public class ReverseOfWordString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();
		sc.close();
		String[] strArray = str.split(" ");
//	print the reverse of the words string
		System.out.println("reversed words of string :");
		for(int i = strArray.length-1 ; i >= 0; i--) {
			System.out.print( strArray[i] + " ");
		}
	}
}
