package com.Bootcamp.Meduim_Part1_10programing;

public class Binary_SearchQ61 {

	public static void main(String[] args) {
     int []a = {10,20,30,40,50,60};
     System.out.println(binarySearch(a ,10));


	}
public static int binarySearch(int[]n , int x) {
	int low = 0;
	int high = n.length -1;
	
	
	while(low<=high) {
		int mid = (low+high)/2;
		int midnumber = n[mid];
		if(x == midnumber) {
			return mid;
		}
		if( x < midnumber) {
			high = mid -1;
		}
		else {
			low = mid+1;
		}
	}
   return -1;
}
}
