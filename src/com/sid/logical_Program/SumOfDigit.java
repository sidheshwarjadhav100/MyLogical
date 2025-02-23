package com.sid.logical_Program;

import java.util.Scanner;

public class SumOfDigit {
	
	public static void main(String[] args) {
		
		//calculate the sum of digit of given num 
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=s.nextInt();
		int rem,sum=0;
		
		while(num>0){
			
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			
			
		}
		System.out.println(sum);
		
		
		
	}

}
