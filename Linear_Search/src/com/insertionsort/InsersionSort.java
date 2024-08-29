package com.insertionsort;

import java.util.Arrays;

public class InsersionSort {

	static void insertionSort(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];    
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 10, 12, 1, 5, 6 };
		int n = arr.length;
		insertionSort(arr, n);
		System.out.println("Sorted Array : " +Arrays.toString(arr));
	}

}

//First Iteration (i = 1):
//
//key = 3, j = 0
//Compare 4 > 3: Shift 4 to the right.
//Insert 3 in position arr[0].
//Array: [3, 4, 2, 10, 12, 1, 5, 6]
//Second Iteration (i = 2):
//
//key = 2, j = 1
//Compare 4 > 2: Shift 4 to the right.
//Compare 3 > 2: Shift 3 to the right.
//Insert 2 in position arr[0].
//Array: [2, 3, 4, 10, 12, 1, 5, 6]
//Third Iteration (i = 3):
//
//key = 10, j = 2
//10 is already in the correct position.
//Array: [2, 3, 4, 10, 12, 1, 5, 6]
//Fourth Iteration (i = 4):
//
//key = 12, j = 3
//12 is already in the correct position.
//Array: [2, 3, 4, 10, 12, 1, 5, 6]
//Fifth Iteration (i = 5):
//
//key = 1, j = 4
//Compare 12 > 1: Shift 12 to the right.
//Compare 10 > 1: Shift 10 to the right.
//Compare 4 > 1: Shift 4 to the right.
//Compare 3 > 1: Shift 3 to the right.
//Compare 2 > 1: Shift 2 to the right.
//Insert 1 in position arr[0].
//Array: [1, 2, 3, 4, 10, 12, 5, 6]
//Sixth Iteration (i = 6):
//
//key = 5, j = 5
//Compare 12 > 5: Shift 12 to the right.
//Compare 10 > 5: Shift 10 to the right.
//Insert 5 in position arr[4].
//Array: [1, 2, 3, 4, 5, 10, 12, 6]
//Seventh Iteration (i = 7):
//
//key = 6, j = 6
//Compare 12 > 6: Shift 12 to the right.
//Compare 10 > 6: Shift 10 to the right.
//Insert 6 in position arr[5].
//Array: [1, 2, 3, 4, 5, 6, 10, 12]