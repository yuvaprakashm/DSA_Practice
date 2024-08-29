package com.arrays.sortwaveformarray;

import java.util.Arrays;

public class SortWaveFormArray {
	public static void main(String[] args) {
		int arr[] = { 5, 8, 1, 4, 6, 3, 2, 7 };
		int n = arr.length;
		makeWaveForm(n, arr);
	}

	private static void makeWaveForm(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i = i + 2) {
			if (i < n - 1) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("Array in waveform pattern :");
		System.out.println(Arrays.toString(arr));
	}

}
