package com.training.day7;

import java.util.*;
import java.util.Map.Entry;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {
		ArrayList<Integer> listWithDuplicate = new ArrayList<Integer>();
		listWithDuplicate.add(11);
		listWithDuplicate.add(9);
		listWithDuplicate.add(12);
		listWithDuplicate.add(11);
		listWithDuplicate.add(22);
		listWithDuplicate.add(27);

		Set<Integer> setWithoutDuplicates = new TreeSet<>(listWithDuplicate);
//		Collections.sort(setWithoutDuplicates);

		List<Integer> listWithoutDuplicate = new ArrayList<>(setWithoutDuplicates);
//		Collections.sort(listWithoutDuplicate);

		System.out.println("with duplicates : " + listWithDuplicate);
		System.out.println("without duplicates : " + listWithoutDuplicate);
		/// to remove duplicates from list we can convert list into set because set
		// interface do not support
//		duplicate values first, then convert it back to list 

	}
}
