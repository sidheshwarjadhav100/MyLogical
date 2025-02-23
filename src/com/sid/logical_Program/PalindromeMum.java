package com.sid.logical_Program;

public class PalindromeMum {
	// a number which is same form left and write side also eg121

	public void check(int n) {
		int temp = n;
		int rev = 0;
		while (0 < n) {
			int r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;

		}

		if (temp == rev) {
			System.out.println("palindrome num");
		} else {
			System.out.println("not palindrome num");

		}

	}

	public static void main(String[] args) {
		PalindromeMum p = new PalindromeMum();
		p.check(121);
	}

}
