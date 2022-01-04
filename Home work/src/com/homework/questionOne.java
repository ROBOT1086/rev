package com.homework;

import java.util.Arrays;

public class questionOne{ 
	
	static void bubbleSort(int array[]) {
		int n = array.length;
		
		for (int i = 0; i < n - 1; i++)
			
			for (int j = 0; j < n - i -1; j++)
				
				if (array[j] > array[j + 1]) {
					
					
					
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				
				}
		
	}
	
	
	public static void main(String args[]) {
		
		int[] data = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		
		questionOne.bubbleSort(data);
		
		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(data));
	}
}
