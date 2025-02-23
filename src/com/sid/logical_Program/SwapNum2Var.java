package com.sid.logical_Program;

import java.util.Scanner;

public class SwapNum2Var {

	public static void main(String[] args) {
		
		System.out.println("Enter Number a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter Number b");
		int b=s.nextInt();
		
		System.out.println("Before Swapping a= "+a);
		System.out.println("Before Swappng b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a= "+a);
		System.out.println("After Swappng b= "+b);
			
		

	}

}
