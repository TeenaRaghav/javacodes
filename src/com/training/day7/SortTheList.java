package com.training.day7;

import java.util.*;

public class SortTheList {
	public static void main(String[] args) {
		ArrayList<Integer> unsortedlist = new ArrayList<Integer>();
		unsortedlist.add(11);
		unsortedlist.add(9);
		unsortedlist.add(12);
		unsortedlist.add(11);
		unsortedlist.add(22);
		unsortedlist.add(27);
		System.out.println("unsorted list : "+ unsortedlist);
		Set<Integer> setwithsortedList = new TreeSet<>(unsortedlist);
		ArrayList<Integer> sortedlist = new ArrayList<>(setwithsortedList);
		System.out.println("sorted list :" + sortedlist);

	}
}
