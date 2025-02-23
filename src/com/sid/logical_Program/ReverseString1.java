package com.sid.logical_Program;

public class ReverseString1 {
	public static void main(String[] args) {

		String originalString = "Sidheshwar";
		String reversedString = "";
		String rev = "";

		for (int i = originalString.length() - 1; i >= 0; i--) {
			rev = rev + originalString.charAt(i);

		}
		System.out.print(rev);

	}

}
