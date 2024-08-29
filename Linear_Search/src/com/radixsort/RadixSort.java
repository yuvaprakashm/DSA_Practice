package com.radixsort;

import java.util.Arrays;

public class RadixSort {
	public static void main(String[] args) {
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int[][] radixArray = new int[10][arr.length];
		int count[] = new int[10];
		int maxVal = findMax(arr);
		int exp = 1;
		while (maxVal / exp > 0) {
			for (int i = 0; i < arr.length; i++) {
				int val = arr[i];
				int radixIndex = (val / exp) % 10;
				radixArray[radixIndex][count[radixIndex]] = val;
				count[radixIndex]++;
			}
			int pos = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < count[i]; j++) {
					arr[pos] = radixArray[i][j];
					pos++;
				}
				count[i] = 0;
			}
			exp *= 10;
		}
		System.out.println("Sorted Array " + Arrays.toString(arr));
	}
	private static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
