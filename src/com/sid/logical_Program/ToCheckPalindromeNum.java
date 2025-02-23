package com.sid.logical_Program;

import java.util.Scanner;

public class ToCheckPalindromeNum {
	
	//num= 121 reverse is=same of that num is palindrome num
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) {
			
			int rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
			
			
			
			
		}
		if(temp==rev) {
			System.out.println(temp+" Is Palindrome Number");
		}else {
			System.out.println(temp+" Not Is Palindrome Number");

		}
	}
	

}
