package com.training.day4;

public class FinallyConcept {
	public static void main(String[] args) {
		
		try {
		
		int [] array = new int[5];
		System.out.println(array[6]);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("test complete");
		}
	}
}
