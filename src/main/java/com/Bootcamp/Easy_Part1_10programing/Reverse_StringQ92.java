package com.Bootcamp.Easy_Part1_10programing;

public class Reverse_StringQ92 {

	public static void main(String[] args) {
		
	String S = "Helow Amarica";
	int L = S.length();
	System.out.println("Reverse of String : " + S + "is");
	
	for(int i = 0; i < L; i++) {
		System.out.print(S.charAt(L - i - 1));
	}
	}
}
