package com.arrays.maxconsecutiveonesafterflips;

public class MaxConsecutiveOnesAfterFlips {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 1, 1, 0, 1, 1, 1 };
		int n = arr.length;
		int zeros = 1;
		int max_consecutive_ones = findZerosToFlip(arr, n, zeros);
		System.out.println("Max consecutive ones after flipping " + zeros + " zeroses : " + max_consecutive_ones);
	}

	private static int findZerosToFlip(int[] arr, int n, int zeros) {
		int left = 0, right = 0, zeroCount = 0, maxOnes = 0;
		while (right < n) {
			if (arr[right] == 0) {
				zeroCount++;
			}
			while (zeroCount > zeros) {
				if (arr[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			maxOnes = Math.max(maxOnes, right - left + 1);
			right++;
		}
		return maxOnes;
	}

}
