package com.Bootcamp.Meduim_Part1_10programing;

public class Check_Number_IsPalindromeQ54 {

	public static void main(String[] args) {
		System.out.println(isPalindromeQ54(1221));
	}//palindrome: mean that the number or string can read the same from forword and backword
public static boolean isPalindromeQ54( int x) {
	int temp = x;
	int rev = 0;
	while(x>0)
	{
		int digit = x%10;
		rev = (rev*10)+digit;
		x=x/10;
	}
	if(rev ==temp) {
		return true;
	}
 return false;
}

	
}

