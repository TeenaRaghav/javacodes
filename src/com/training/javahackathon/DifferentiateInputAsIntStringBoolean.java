package com.training.javahackathon;

import java.util.*;

public class DifferentiateInputAsIntStringBoolean {

	// Method to check if the input is an integer
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// Method to check if the input is a boolean
	public static boolean isBoolean(String input) {
		return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");
		String input = sc.nextLine();
		sc.close();

		// Check if input is an integer
		if (isInteger(input)) {
			System.out.println("Input is an integer: " + Integer.parseInt(input));
		}
		// Check if input is a boolean
		else if (isBoolean(input)) {
			System.out.println("Input is a boolean: " + Boolean.parseBoolean(input));
		}
		// If not an integer or a boolean, it's considered a string
		else {
			System.out.println("Input is a string: " + input);
		}

	}

}
