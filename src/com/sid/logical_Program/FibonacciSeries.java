package com.sid.logical_Program;

import java.util.Scanner;

public class FibonacciSeries {
	
	//Fibonacci series for n num.

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range");
		int range=s.nextInt();
				range-=2;
		
		int n1=0,n2=1,add=0;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=1;i<=range;i++) {

			add=n1+n2;
			n1=n2;
			n2=add;
			System.out.print(add+" ");
			
		}

	}

}
