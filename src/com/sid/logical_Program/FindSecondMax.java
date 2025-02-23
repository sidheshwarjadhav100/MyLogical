package com.sid.logical_Program;

import java.util.Iterator;

public class FindSecondMax {
	// find max and second max element of given array
	public static void main(String[] args) {
		int a[] = { 97, 6, 78, 3, 78, 97, };

		int max = 0;
		int secondMax = 0;

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				secondMax = max;
				max = a[i];

			}
			// if there is duplication in our array then use this extra if 
			if (a[i] >= secondMax && a[i] != max) {

				secondMax = a[i];

			}

		}
		System.out.println("max is: " + max);
		System.out.println("second max is: " + secondMax);

	}

}
