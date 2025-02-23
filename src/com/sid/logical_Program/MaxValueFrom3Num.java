package com.sid.logical_Program;

import java.util.Scanner;

public class MaxValueFrom3Num {
	
	//accept three num and find largest number of them.

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" is largest");
		}
		
		else if(n2>n1 && n2>n3) {
			System.out.println(n2+" is largest");
		}
		else {
			System.out.println(n3+ " is largest");
		}


	}

}
