package com.arrays.findmajorityelement;

public class FindMajorityElement {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 1, 4, 1, 3, 4, 4, 4, 5, 4 };
		int mostFrequent = findMostFrequentElement(arr);
		System.out.println("The element that occurs most frequently is: " + mostFrequent);
	}

	private static int findMostFrequentElement(int[] arr) {
		int maxCount = 0;
		int mostFrequentElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostFrequentElement = arr[i];
			}
		}
		return mostFrequentElement;
	}
}
