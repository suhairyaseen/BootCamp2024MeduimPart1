package com.Bootcamp.Meduim_Part1_10programing;

public class String_NoWord_Q62 {

	public static void main(String[] args) {
		String S = "Sunday and saturday are weekend";
		int L = S.length();
		int count = 0;
		for(int i = 0;i<L;i++) {
			if(S.charAt(i) == ' ' && Character.isLetter(S.charAt(i+1)) && (i>0)){
				count++;
			}
		}
		count++;
		System.out.println("No of Word :" + count);
	}

}

