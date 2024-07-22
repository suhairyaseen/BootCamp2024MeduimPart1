package com.Bootcamp.DIFFICULT_Part1_10programing;

public class CheckTheString_LongestQ25 {

	public static void main(String[] args) {
		String S1 = "Hello Amarica";
		String S2 = "Amarica";
		System.out.println("The Longest Subsequence :" + longCommonString(S1,S2));
	}
	public static int longCommonString(String S1 , String S2) {
		int a = S1.length();
		int b = S2.length();
		//but the length in array
		int[][] k = new int[a+1][b+1];
		//start to fill the array 
		for(int i=0; i<=a;i++) {
			for(int j=0; j<=b;j++) {
				if(i==0 || j==0) {// here if one of them i or j =0 
					k[i][j]=0;
				}
	else if(S1.charAt(i-1) == S2.charAt(j-1)) {//if char equal 
					k[i][j]= k[i-1][j-1]+1;
	}
	else { k[i][j] = Math.max(k[i-1][j],k[i][j-1]);//
	}
}
}
	return k[a][b];
}
}