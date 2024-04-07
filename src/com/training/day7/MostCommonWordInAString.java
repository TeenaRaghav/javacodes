package com.training.day7;

import java.util.*;

public class MostCommonWordInAString {
	public static void main(String[] args) {
//		input string
		String inputString = "This is a test string. This string contains some repeated words. This is just a test.";

// 		converting input string to lowercase and splitting it into words using split()
//		"\\W+" expression  can be used to split a string into words based on any sequence of non-word characters. 
//		For example, it can be used to split a sentence into individual words by treating spaces, punctuation, etc., as delimiters.
		String[] words = inputString.toLowerCase().split("\\W+");

//		created hashmap named wordcount to count occurrence of each word, where each word is a key 
//		and its count is the value 
		Map<String, Integer> wordcount = new HashMap<>();

//		the loop iterates over each word
//		If the word is already present in the wordcount map, its count is retrieved using getOrDefault() method,
//		incremented by 1, and updated in the map.
//		If the word is not present in the map, its count is set to 1.
		for (String word : words) {
			wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
		}

//        find the most common word
		String commonword = "";
		int maxcount = 0;
//		iterating over each entry and getting a set view 
		for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
			if (entry.getValue() > maxcount) {
				commonword = entry.getKey();
				maxcount = entry.getValue();

			}
		}

		System.out.println("Most common word : " + commonword + "\n frequency : " + " " + maxcount);
	}
}
