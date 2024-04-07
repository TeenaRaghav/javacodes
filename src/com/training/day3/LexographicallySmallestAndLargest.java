package com.training.day3;
import java.util.*;
public class LexographicallySmallestAndLargest {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0,k);
		
		for(int i =1; i <= s.length()-k; i++) {
			String sb = s.substring(i, i+k);
			if(sb.compareTo(smallest) < 0) {
				smallest = sb;
			}
			if (sb.compareTo(largest) > 0) {
				largest = sb;
			}
			
		}
		return smallest+ "\n" + largest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k= sc.nextInt();
		sc.close();
		System.out.println(getSmallestAndLargest( s, k));

	}
	
}
