package com.sid.pattern_logic;

public class AlphabetPattern {

//	print below pattern
//	A
//	A B
//	A B C

	// we print this pattern by using ASSCI value and we print
	// firstly we generate the number and then print the ascii value of that number
	public static void main(String[] args) {

		for (int i = 65; i <= 67; i++) {

			for (int j = 65; j <= i; j++) {

				System.out.print(" " + (char) j);

			}
			System.out.println();
		}

	}

}
