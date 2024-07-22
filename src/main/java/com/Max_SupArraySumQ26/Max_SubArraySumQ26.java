package com.Max_SupArraySumQ26;

public class Max_SubArraySumQ26 {

	public static void main(String[] args) {
	int [] m = {-1,2,-3,4,-5,6,3};
	int maxsum = maxSubArraySum(m);
	System.out.println("the Max of Sub Array :" + maxsum);
	}
	//in this method we will find the max subArray sum
	// we wil use the Kadane's algrithim its maxsofar and maxEndinghere
	//for traking the found and ending in the position
	public static int maxSubArraySum(int[]m) {
		int MaxSoFar = m[0];
		int MaxEndingHere = m[0];
		for(int i=1;i<m.length;i++) {
			MaxEndingHere = Math.max(m[i], MaxEndingHere + m[i]);
			MaxSoFar = Math.max(MaxSoFar , MaxEndingHere);
		}
		return MaxSoFar;
	}
}
