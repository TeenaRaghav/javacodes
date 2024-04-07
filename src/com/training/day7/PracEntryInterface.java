package com.training.day7;
import java.util.*;
public class PracEntryInterface {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("apple", 20);
		map.put("banana", 30);
		map.put("mango", 50);
		map.put("grapes", 20);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();

			System.out.println("key : " + key + "|" +"value: " + value);
		}
	}
}
