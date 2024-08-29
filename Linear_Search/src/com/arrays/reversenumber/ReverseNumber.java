package com.arrays.reversenumber;

import java.util.Arrays;

public class ReverseNumber {
	public static void main(String[] args) {
//		int inputArray[] = { 2, 4, 6, 8, 10 };
//		System.out.println("Array without reverse :" + Arrays.toString(inputArray));
//		reverse(inputArray);
//	}
//
//	private static void reverse(int[] inputArray) {
//		for (int left = 0, right = inputArray.length - 1; left < right; left++, right--) {
//			int temp = inputArray[left];
//			inputArray[left] = inputArray[right];
//			inputArray[right] = temp;
//		}
//		System.out.println("Reverse Array :" + Arrays.toString(inputArray));
//
//	}

		String inputArray[] = { "India", "UK", "Pakistan", "Australia" };
		System.out.println("Initial String array :" + Arrays.toString(inputArray));
		reverse(inputArray);
	}

	private static void reverse(String[] inputArray) {
		for (int left = 0, right = inputArray.length - 1; left < right; left++, right--) {
			String temp = inputArray[left];
			inputArray[left] = inputArray[right];
			inputArray[right] = temp;
		}
		System.out.println("Reverse Array :" + Arrays.toString(inputArray));
	}
}
