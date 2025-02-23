package com.sid.logical_Program;

//WAP to reverse given array
public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 7, 5, 3, 98, 43 };
		int rev[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {

			// store in array
			System.out.print(" " + arr[i]);

		}

	}
}
