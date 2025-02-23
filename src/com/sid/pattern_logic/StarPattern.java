package com.sid.pattern_logic;

public class StarPattern {
//	print bellow star pattern
//	*
//	* *
//	* * *

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" *");

			}
			System.out.println();
		}

	}

}
