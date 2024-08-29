package com.arrays.maxsubarray;

public class MaximumSubArraySum {
	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3};
		int n = arr.length;
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				res = Math.max(sum, res);
			}
		}
		System.out.println("The maximum sub array sum of the given array : " +res);
	}
}
