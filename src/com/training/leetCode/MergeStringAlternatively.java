package com.training.leetCode;

public class MergeStringAlternatively {
	public static void main(String[] args) {
		String str1 = "Abc";
		String str2 = "pqrs";
		MergeStringAlternatively merge = new MergeStringAlternatively();
		String result = merge.mergeAlternatively(str1, str2);
		System.out.println(result);
		
	}
	public String mergeAlternatively(String str1, String str2) {
//	Create a StringBuilder to efficiently append characters.
		StringBuilder sb= new StringBuilder();

//Store the lengths of the input strings.		
		int len1 = str1.length();
		int len2 = str2.length();
//Determine the length of the longer string
		int maxLen = Math.max(len1, len2);
//Loop through the indices from 0 to the length of the longer string.
		
		for(int i = 0; i < maxLen ; i++) {
//If the current index is within the bounds of the first string, append the character at this index to the StringBuilder.
			if (i < len1) {
				sb.append(str1.charAt(i));
			}
//If the current index is within the bounds of the second string, append the character at this index to the StringBuilder.		
			if (i < len2) {
				sb.append(str2.charAt(i));
			}
		}
		
//		Convert the StringBuilder to a String and return it.
		return sb.toString();
		
	}

}
