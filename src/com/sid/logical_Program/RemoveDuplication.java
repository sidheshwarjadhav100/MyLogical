package com.sid.logical_Program;

public class RemoveDuplication {
//remove duplication from an array.
	public static void main(String[] args) {

		int a[] = { 44, 76, 34, 44, 76 };
		int temp=0;
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
			for (int j = i + 1; j < a.length; j++) {

				temp = a[i] + a[i];
				a[i] = a[j];
				a[j] = temp;

			}System.out.println(a[i]);

		}
		

	}

}
