package com.Bootcamp.Easy_Part1_10programing;

import java.util.Scanner;

public class Scanner_CalculatorQ93 {
	
	public static void main (String[]args) {
		
		int num1,num2;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Number");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Enter Operator(+,-,*,/):"); 
		
		char calcu = scan.next().charAt(0);
		int A = 0;
		
		switch(calcu) {
		case '+':
			A = num1 + num2;
			break;
			
		case '-':
			A = num1 - num2;
			break;
		case '*':
			A = num1 * num2;
			break;
		case '/':
			A = num1 / num2;
			break;
			
			default:
				System.out.println("No results");
		}
		
		System.out.println("The results is : ");
		System.out.println();
		System.out.println((num1 + " " + calcu + " " + num2 + "=" + A ));
	}
	
}
