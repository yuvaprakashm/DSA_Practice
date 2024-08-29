package com.linearsearch;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 12, 8, 5, 18, 11, 3 };
		int item = 18;
		linearSearch(arr, item);

	}

	private static void linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				System.out.println(item + " Found at index :" + i);
				return;
			}
		}
		System.out.println("Not Found");

	}

}
