package com.arrays.tripletsum;

import java.util.Arrays;

public class TripletSum {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Array: " + Arrays.toString(arr));
		int sum = 9;
		System.out.println("sum : " + sum);
		System.out.println("Triples :");
		findTriplets(arr, arr.length, sum);
	}

	private static void findTriplets(int[] arr, int n, int sum) {
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
					}
				}
			}
		}
	}
}
