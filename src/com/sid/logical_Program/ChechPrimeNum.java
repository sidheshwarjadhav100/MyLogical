package com.sid.logical_Program;

import java.util.Scanner;

//check given number is prime number or not.
//Prime number:- A number which is divisible by 1 and itself only that number is called prime number.

public class ChechPrimeNum {

	public static void main(String[] args) {

		System.out.println("Enter Any Number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();// accept the number.
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println(num + " Is Prime Number");
		} else {
			System.out.println(num + " Is Not Prime Number");
		}

	}

}
