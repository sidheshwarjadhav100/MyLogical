package com.sid.logical_Program;

import java.util.Scanner;

public class CheckArmstrongNum {

	// verify given number is armstrong or not.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = s.nextInt();
		int temp = num;
		int count = 0;
		int dig;
		double pow = 0;
		double amst = 0;

		while (temp > 0) {
			// count num
			count++;
			temp = temp / 10;

		}
		System.out.println("count of num=" + count);

		temp = num;
		while (temp > 0) {

			dig = temp % 10;
			pow = Math.pow(dig, count);
			amst = amst  + pow;
			temp /= 10;

		}
		System.out.println(amst);
		
		if(num==amst) {
			System.out.println("armstrong num");
			
		}
		else {
			System.out.println("not armstrong num");
		}

	}
	


}
