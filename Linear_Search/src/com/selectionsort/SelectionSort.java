package com.selectionsort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int temp = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[temp]) {
					temp = j;
				}
			}
			int swapTemp = arr[i];
			arr[i] = arr[temp];
			arr[temp] = swapTemp;

		}
	}

}

//First Iteration:
 
//Minimum element in [64, 25, 12, 22, 11] is 11.
//Swap 11 with 64.
//Array after swap: [11, 25, 12, 22, 64]
//Second Iteration:
 
//Minimum element in [25, 12, 22, 64] is 12.
//Swap 12 with 25.
//Array after swap: [11, 12, 25, 22, 64]
//Third Iteration:
 
//Minimum element in [25, 22, 64] is 22.
//Swap 22 with 25.
//Array after swap: [11, 12, 22, 25, 64]

//Fourth Iteration:
//Minimum element in [25, 64] is 25.
//No swap needed as 25 is already in the correct position.
//Array remains the same: [11, 12, 22, 25, 64]