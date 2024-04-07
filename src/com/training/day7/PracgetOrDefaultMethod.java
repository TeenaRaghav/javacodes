package com.training.day7;

import java.util.*;

public class PracgetOrDefaultMethod {
	public static void main(String[] args) {
	Map<String, Integer> wordcountmap = new HashMap<>();
	wordcountmap.put("apple", 2);
	wordcountmap.put("banana", 4);
	wordcountmap.put("orange", 7);

	int applecount = wordcountmap.getOrDefault("apple", 0);
	System.out.println(applecount);
	int bananacount = wordcountmap.getOrDefault("banana", 0);
	System.out.println(bananacount);
	int orangecount = wordcountmap.getOrDefault("orange", 0);
	System.out.println(orangecount);
	int grapescount= wordcountmap.getOrDefault("grapes", 0);
	System.out.println(grapescount);
	}
}
