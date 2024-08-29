package com.arrays.reorderarrayusingindexes;

import java.util.Arrays;

public class ReorderArrayUsingIndexes {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int index[] = { 3, 1, 4, 0, 2 };
		int temp[] = new int[5];
		for (int i = 0; i < 5; i++) {
			temp[i] = arr[index[i]];
		}
		for (int i = 0; i < 5; i++) {
			arr[i] = temp[i];
		}
		System.out.println("Reordered array :" + Arrays.toString(arr));

	}
}
