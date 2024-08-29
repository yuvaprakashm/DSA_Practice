package com.countingsort;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {
		int arr[] = { 4, 2, 2, 8, 3, 3, 1 };
		countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void countingSort(int[] arr) {
		if (arr.length == 0) {
			return; // Handle empty array
		}

		// Step 1: Find the maximum value in the array
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// Step 2: Create and initialize the count array
		int[] count = new int[max + 1];

		// Step 3: Fill the count array with frequencies
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		// Step 4: Overwrite the original array with sorted values
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr[index++] = i;
				count[i]--;
			}
		}
	}
}
