package com.sid.logical_Program;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is Even Number");
		}
		else {
			System.out.println(n+" is Odd Number");
		}

	}

}
