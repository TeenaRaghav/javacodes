package com.training.leetCode;

public class GCDString {
	public static void main(String[] args) {
		String str1 = "ABCABC";
		String str2 = "ABC";
		
		GCDString gcd = new GCDString();
		String result = gcd.gcdString(str1, str2);
		System.out.println(result);
		
	
	}
	
	public String gcdString(String str1, String str2) {

//String Check: First, we check if the concatenation of str1 and str2 is equal to the concatenation of str2 and str1.
//If not, there is no common divisor string, so we return an empty string.

		if (!(str1 + str2).equals(str2 +str1)) {
			return "";
		}

//GCD Calculation: We find the GCD of the lengths of str1 and str2.
		int gcdLen = gcd(str1.length(),str2.length());

//Substring Extraction: The substring of length gcdLen from the start of str1 is the potential largest common divisor string.		
		return str1.substring(0,gcdLen);
	
	}
//This method calculates the GCD using the Euclidean algorithm.
	
	public static int gcd(int a, int b) {
			while (b !=0) {
				int temp = b;
				b = a%b;
				a = temp;
			}
			return a;

		
	}

}
