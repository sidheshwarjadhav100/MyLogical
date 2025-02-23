package com.sid.logical_Program;

public class PrimeNumber {

	// it is a number which is divisibe by 1 and itself only

	public void prime(int n) {

		int count = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			System.out.println("this is prime number");

		}else {
			System.out.println("this is not prime number");
		}

	}
	
	public static void main(String[] args) {
		PrimeNumber p=new PrimeNumber();
		p.prime(10);
	}

}
