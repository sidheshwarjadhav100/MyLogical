package com.sid.logical_Program;

public class FindPrimeNumberFromArray {

	public static void main(String[] args) {

		int arr[] = { 43, 5, 7, 11, 33, 76, 9, 5, 90 };
		for (int digit : arr) {
			int count = 0;
			for (int i = 1; i <= digit; i++) {

				if (digit % i == 0) {
					count++;
				}

			}

			if (count == 2) {
				System.out.print(digit + " ");
			}
		}

	}

}
