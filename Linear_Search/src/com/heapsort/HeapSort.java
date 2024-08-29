package com.heapsort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int arr[] = { 10, 4, 5, 3, 2, 1 };
		heapSort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);

		}
		for (int i = n - 1; i > 0; i--) {
			int t = arr[0];
			arr[0] = arr[i];
			arr[i] = t;
			heapify(arr, i, 0);
		}
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int rigth = 2 * i + 2;
		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}
		if (rigth < n && arr[rigth] > arr[largest]) {
			largest = rigth;
		}
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}
	}
}
//max heap -> root node always greater than or equal to leaf or right
//swap -> swap two nodes
//remove
//max heap