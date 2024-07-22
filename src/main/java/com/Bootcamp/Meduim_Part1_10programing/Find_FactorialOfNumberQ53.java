package com.Bootcamp.Meduim_Part1_10programing;

public class Find_FactorialOfNumberQ53 {

	public static void main(String[] args) {
	//6!=6*5*4*3*2*1 =720
	//factorial:its multiplay preceding number.	
System.out.println(factorial(6));
	}
	public static int factorial(int n) {
	if(n == 1) {
		System.out.println("factorial (" + n +") = 1");
		return 1;
	}else 
		System.out.println("factorial(" + n +") = * factorial(" + (n-1) + ")");
		return n * factorial(n-1);
		
		
		
	}

}
