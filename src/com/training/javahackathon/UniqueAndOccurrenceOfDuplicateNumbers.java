package com.training.javahackathon;

import java.util.*;

public class UniqueAndOccurrenceOfDuplicateNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

		// enter the elements in array
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//count occurrences of each number using HashMap
		Map<Integer, Integer> occurrences = new HashMap<>();
		for (int num : arr) {
			occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
		}
//		print unique numbers and occurences of duplicate numbers
		System.out.println("Unique numbers in the array and their occurences:");
		for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		sc.close();

	}
}

/*
 * for (int num : arr): This is an enhanced for loop, also known as a for-each
 * loop. It iterates over each element num in the array arr. For each iteration,
 * num takes on the value of the current element in the array.
 * 
 * occurrences.put(num, occurrences.getOrDefault(num, 0) + 1): In each iteration
 * of the loop, we perform the following steps:
 * 
 * occurrences.getOrDefault(num, 0): This method retrieves the value associated
 * with the key num in the occurrences map. If num is present as a key in the
 * map, it returns the corresponding value (i.e., the count of occurrences of
 * num). If num is not present, it returns the default value 0. + 1: We add 1 to
 * the count of occurrences retrieved from the map. This effectively increments
 * the count by 1. occurrences.put(num, ... ): This method puts the updated
 * count of occurrences back into the occurrences map, associating it with the
 * key num.
 */
