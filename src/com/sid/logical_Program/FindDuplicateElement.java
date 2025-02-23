package com.sid.logical_Program;

public class FindDuplicateElement {
	// WAP to find duplicate number form an Array
	public static void main(String[] args) {

		int arr[] = { 5, 3, 7, 4, 5, 4 };

		for (int el : arr) {
int i=1;
			for (int j = arr[i]; i < arr.length; i++) {

				if (el ==j ) {
					System.out.println(el);
				}

			}

		}
	}
}
