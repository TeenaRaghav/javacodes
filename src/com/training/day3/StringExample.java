package com.training.day3;

public class StringExample {
	public static void main(String[] args) {
//		StringBuilder name = new StringBuilder("Shalini");
//		StringBuffer name = new StringBuffer("Shalini");
		String name = "Teena, jai, pritish";
		String[] name1 = name.split(",");
		for(String str : name1) {
			System.out.println(str);
		}
				
//		name.insert(3, "t");
//		name.append("teena");
//		name.replace(1, 3, "tee");
		 
//		
//		System.out.println(name.toLowerCase());
	}
}
