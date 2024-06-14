package com.training.leetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGrtestNumOfCAndies {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		
		KidsWithGrtestNumOfCAndies greatestCandies = new KidsWithGrtestNumOfCAndies();
		List<Boolean> result = greatestCandies.kidsWithCandies(candies,extraCandies);
		System.out.println(result);
	}
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		
//We iterate over the candies array to find the maximum number of candies any kid currently has.
		int maxCandies = 0;
		
		for(int candy : candies) {
			if (candy > maxCandies) {
				maxCandies = candy;
			}
		}
//We create a List<Boolean> to store the results.
//For each kid, we check if their candies plus the extra candies are greater than or equal to the maximum number of candies found earlier.
//If true, we add true to the result list; otherwise, we add false.
		List<Boolean> result = new ArrayList<>();
		
		for(int candy : candies) {
			if (candy + extraCandies >= maxCandies) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		return result;
		
	}
}
