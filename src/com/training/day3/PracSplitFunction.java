package com.training.day3;
import java.util.*;
public class PracSplitFunction {
	public static void main(String[] args) {
		String str ="The quick brown fox jumps, over the lazy dog. The dog jumps over the fox.";
		String[] str1 =str.split("");
		
		for(String s : str1 )
		System.out.println(s);
	}
}
