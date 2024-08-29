package com.arrays.roratearray;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int arr2[] = arr1.clone();
		int r = 3;

		System.out.println("Input Array Before Rotation :");
		System.out.println(Arrays.toString(arr1));
		RotateArray m = new RotateArray();
		m.rightRotate(arr1, r);
		m.leftRotate(arr2, r);
	}

	private void leftRotate(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("Input array after left rotation by " + n + " Positions :");
		System.out.println(Arrays.toString(arr));
	}

	private void rightRotate(int[] arr, int n) {
		for (int i = 1; i <= n; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		System.out.println("Input array after right rotation " + n + " Positions :");
		System.out.println(Arrays.toString(arr));
	}
}
