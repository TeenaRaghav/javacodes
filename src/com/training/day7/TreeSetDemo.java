package com.training.day7;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ob = new TreeSet<Integer>();

		ob.add(22);
		ob.add(2);
		ob.add(6);
		ob.add(17);
//		ob.add(null);
//		ob.add(null);
		ob.add(22);
		ob.add(27);
		System.out.println(ob.size());

		Iterator<Integer> it = ob.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
