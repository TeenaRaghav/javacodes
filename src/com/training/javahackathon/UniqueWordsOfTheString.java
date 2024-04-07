package com.training.javahackathon;
import java.util.*;
public class UniqueWordsOfTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();
		sc.close();
		String[] words = str.split(" ");
//create a set to tore unique words
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		int count = 0;
//	add words to the map
	for(String word : words) {
		if(!hmap.containsKey(word)) {
			hmap.put(word,+1);
		}else {
			hmap.remove(word);
		}
	}
		
//	print the unique words 
	System.out.println("unique words in the string: ");
	for(Map.Entry<String, Integer> entryset : hmap.entrySet() ) {
		System.out.println(entryset.getKey());
	}
	
	}
}
