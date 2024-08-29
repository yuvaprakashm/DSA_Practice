package com.arrays.pythagoreantriplet;

public class PythagoreanTriplet {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 5, 7, 8 };
		int n = arr.length;
		int result = isTriplet(arr, n);
		if (result == -1) {
			System.out.println("no triples found");
		}
	}

	private static int isTriplet(int[] arr, int n) {
		int x, y, z;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					x = arr[i] * arr[i];
					y = arr[j] * arr[j];
					z = arr[k] * arr[k];
					if (x == y + z || y == x + z || z == x + y) {
						System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
						return 1;
					}
				}
			}
		}
		return -1;
	}
}
