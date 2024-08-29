package com.arrays.segregatezeroesandones;

import java.util.Arrays;

public class SegregateZeroesAndOnes {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 1, 1, 0, 1, 1 };
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("Segregated array: ");
		segregate(arr, n);
	}

	private static void segregate(int[] arr, int n) {
		int count_0 = 0, count_1 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count_0++;
			} else {
				count_1++;
			}
		}
		for (int i = 0; i < count_0; i++) {
			System.out.print("0 ");
		}
		for (int i = count_0; i < n; i++) {
			System.out.print("1 ");
		}
	}
}
