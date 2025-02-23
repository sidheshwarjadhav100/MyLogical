package com.sid.logical_Program;

import java.util.Scanner;

public class SumOfNumberDigit {
	
	//perform the sum of given number digit.
	

	public static void main(String[] args) {

		System.out.println("Enter Any Number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();// accept the number.
		
		int rem=0,sum=0;

		
		while(num>0) {
			
			rem=num%10;//find the reminder that is last digit of the number
			sum +=rem;// sum of digit perform here
			num=num/10;//find the quotient that is number after loss the last digit.
			
		}
		System.out.println("Sum Of Digit Is= "+sum);//print sum of all digit that are present in the number

	}

}
