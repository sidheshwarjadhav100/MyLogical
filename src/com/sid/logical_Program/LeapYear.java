package com.sid.logical_Program;

import java.util.Scanner;

public class LeapYear {
	// leap year program
	// year that is fully divisible by 4 and should not be divisible by 100 or
	// divisible by 400.

	public static void main(String[] args) {

		System.out.println("Enter Year");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " Is Leap Year");
		} else {
			System.out.println(year + " Is Not Leap Year");
		}

	}

}
