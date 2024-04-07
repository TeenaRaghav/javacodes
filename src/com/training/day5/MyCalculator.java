package com.training.day5;

public class MyCalculator {
	long power(int n, int p) throws Exception {
		if (n<0 || p<0)  throw new Exception ("n or p should not be negative");
			if (n == 0 && p == 0) throw new Exception ("n or p should not be zero");
			return (long) Math.pow(n, p);
		}
}
