package com.arrays.oddoreven;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements you want in array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Odd numbers: ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("Even numbers: ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + "");
			}
		}
	}
}
