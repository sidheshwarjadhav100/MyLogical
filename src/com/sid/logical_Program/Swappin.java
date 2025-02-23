package com.sid.logical_Program;

import java.util.Scanner;

public class Swappin {

	public static void main(String[] args) {
		
		//WAP to swap two num using third variable.
		
		
		int temp;
		System.out.println("Enter Number  a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter Number b");
		int b=s.nextInt();
		System.out.println("Before Swapping a= "+a);
		System.out.println("Before Swapping b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a= "+a);
		System.out.println("After Swapping b= "+b);


		

	}

}
