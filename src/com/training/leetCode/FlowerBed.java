package com.training.leetCode;

public class FlowerBed {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        
        boolean result = canPlaceFlowers(flowerbed, n);
        
        System.out.println(result); // Output: true
    }
    
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count = 0;
        
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                // Check if the previous and next plots are empty or if it is the edge of the array
                boolean emptyPrev = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyNext = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyPrev && emptyNext) {
                    flowerbed[i] = 1; // Plant a flower here
                    count++;
                    
                    // Early exit if we've planted enough flowers
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        
        return count >= n;
    }
}
