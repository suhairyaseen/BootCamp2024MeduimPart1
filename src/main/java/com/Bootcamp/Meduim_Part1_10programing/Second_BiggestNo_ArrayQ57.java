package com.Bootcamp.Meduim_Part1_10programing;

import java.util.Arrays;

public class Second_BiggestNo_ArrayQ57 {

	
		public static int getSecondLargest(int[] a, int total){  
			Arrays.sort(a);  
			return a[total-2];  
			}  
			public static void main(String args[]){  
			int b[]={4,66,100,77,3,22,5};  
			System.out.println("Second Largest: "+getSecondLargest(b,b.length));  
			}}  

