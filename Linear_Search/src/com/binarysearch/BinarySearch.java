package com.binarysearch;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 5, 9, 1, 3, 7, 8 };
		Arrays.sort(arr);
		System.out.println("The Given array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int find = Arrays.binarySearch(arr, 8);
		System.out.println("Elemet found at " + (find + 1) + " Position.");
	}
}