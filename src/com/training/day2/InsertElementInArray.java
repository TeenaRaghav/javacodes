package com.training.day2;
import java.util.*;
public class InsertElementInArray {
	// The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize an integer array 'arr'.
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] arr1 = new int [arr.length + 1];
        // Define the position where the new element will be inserted.
        int Index_position = 2;
        
        // Define the value of the new element to be inserted.
        int newValue = 5;

        // Print the original array using Arrays.toString() method.
        System.out.println("Original Array : " + Arrays.toString(arr));     
        
        for(int i = 0; i< arr1.length; i++ ) {
        	arr1[i]=arr[i];
        }
        // Loop to shift elements to make space for the new element.
        for (int i = arr1.length-1; i > Index_position; i--) {
            arr1[i] = arr1[i - 1];
        }
        
        // Insert the new element at the specified position.
        arr1[Index_position] = newValue;
        
        
        // Print the modified array with the new element.
        System.out.println("New Array: " + Arrays.toString(arr1));
    }
}
