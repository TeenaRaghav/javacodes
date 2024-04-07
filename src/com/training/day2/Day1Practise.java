package com.training.day2;
import java.util.*;
public class Day1Practise {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean a = sc.nextBoolean();
		
		while(true) {
			int number = (int) (Math.random() * 10);
			if(number == 5) {
				continue;
			}
			System.out.println(number);
		}
	
	}
		
}
