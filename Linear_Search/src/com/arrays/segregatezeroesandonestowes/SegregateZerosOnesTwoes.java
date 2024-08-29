package com.arrays.segregatezeroesandonestowes;

import java.util.Arrays;

public class SegregateZerosOnesTwoes {
	public static void main(String[] args) {
		int arr[] = { 2, 0, 1, 2, 0, 1, 0, 2, 1 };
		int n = arr.length;
		System.out.println("Array: " + Arrays.toString(arr));
		segregate(arr, n);
		System.out.println("Segregated array: " + Arrays.toString(arr));

	}

	private static void segregate(int[] arr, int n) {
		int count_0 = 0, count_1 = 0, count_2 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count_0++;
			} else if (arr[i] == 1) {
				count_1++;
			} else if (arr[i] == 2) {
				count_2++;
			}
		}
		int i = 0;
		while (count_0 > 0) {
			arr[i] = 0;
			count_0--;
			i++;
		}
		while (count_1 > 0) {
			arr[i] = 1;
			count_1--;
			i++;
		}
		while (count_2 > 0) {
			arr[i] = 2;
			count_2--;
			i++;
		}
	}
}
