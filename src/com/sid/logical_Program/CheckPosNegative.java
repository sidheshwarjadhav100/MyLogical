package com.sid.logical_Program;

import java.util.Scanner;

public class CheckPosNegative {
	
	//check given num is positive,negative or zero.

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=s.nextInt();
		
		if(num>0) {
			System.out.println(num +" is positive num");
		}
		else if(num<0) {
			System.out.println(num+" is negative num");
		}
		else {
			System.out.println("num is zero");
		}

	}

}
