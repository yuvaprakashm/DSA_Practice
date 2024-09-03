package com.arrays.maxconsecutiveonesafterflips;

public class MaxConsecutiveOnesAfterFlips {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 1, 1, 0, 1, 1, 1 };
		int k = 2;
		int max_consecutive_ones = findZerosToFlip(arr, k);
		System.out.println("Max consecutive ones after flipping zeroses : " + max_consecutive_ones);
	}

	private static int findZerosToFlip(int arr[], int k) {
		int start = 0, zeroCount = 0, maxConsecutiveOne = 0;

		for (int end = 0; end < arr.length; end++) {
			if (arr[end] == 0) {
				zeroCount++;
			}
			while (zeroCount > k) {
				if (arr[start] == 0) {
					zeroCount--;
				}
				start++;
			}
			maxConsecutiveOne = Math.max(maxConsecutiveOne, end - start + 1);
		}
		return maxConsecutiveOne;
	}
}
