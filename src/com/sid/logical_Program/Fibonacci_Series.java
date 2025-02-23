package com.sid.logical_Program;

import java.util.Scanner;

public class Fibonacci_Series {
	// Generate the fibbonicci series for n numbers.
	// starts with 0 and 1 it is fixed.
	// next number is the addition of the previous two number as so on.

	public static void main(String[] args) {

		System.out.println("Enter Any Number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// accept the number.
		int n1 = 0, n2 = 1, sum = 0;

		System.out.print(n1 + " " + n2 + " ");
		n -= 2;// because we already print n1 and n2.
		for (int i = 1; i <= n; i++) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;

		}

	}

}
