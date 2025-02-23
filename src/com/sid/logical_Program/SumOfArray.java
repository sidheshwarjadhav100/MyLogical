package com.sid.logical_Program;

public class SumOfArray {

	public static void main(String[] args) {

		int[] arr = { 4, 4, 2, 65, 789, 55 };
		int sum = 0;
		for (int i : arr) {

			sum = sum + i;

		}
		System.out.println("Sum Of Given Array Elements Are= " + sum);

	}

}
