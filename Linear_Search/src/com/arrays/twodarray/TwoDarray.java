package com.arrays.twodarray;

public class TwoDarray {
	public static void main(String[] args) {
		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Element at x[" + i + "][" + j + "]: " + x[i][j]);
			}
		}
	}
}
