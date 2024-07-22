package com.Bootcamp.Easy_Part1_10programing;

public class Check_PrimeNumberQ90 {

	public static void main(String[] args) {
		int a = 9;
		boolean IsPrime = true;
		for (int i=2;i<=a/2;i++) {
			if(a%i ==0) {
				IsPrime = false;
				break;
			}
	}
		if(IsPrime) {
			System.out.println("numer is prime :" +a);
		}
		else {System.out.println("number is not prime :" + a);
	}	
	}

}
