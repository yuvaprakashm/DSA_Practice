package com.arrays.pairsum;

public class PairSum {
	public static void main(String[] args) {
		int a[] = {5, 2, 3, 4, 1, 6, 7};
		int size = a.length;
		int sum = 7;
		pairsum(a, size, sum);
	}

	private static void pairsum(int[] a, int size, int sum) {
		System.out.print("The pairs present are :");
			for(int i = 0; i < size; i++) {
				for(int j = i+1; j < size; j++) {
					if(a[i] + a[j] == sum)
						System.out.print("(" +a[i] + "," +a[j] + ") ");
				}
			}
	}
}	
