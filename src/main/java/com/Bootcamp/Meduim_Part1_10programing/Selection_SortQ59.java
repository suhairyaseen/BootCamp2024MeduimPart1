package com.Bootcamp.Meduim_Part1_10programing;

public class Selection_SortQ59 {

	public static void main(String[] args) {
		int[]a = {54,9,99,21,12,55};
		int L = a.length;
		//Selecation sort: its sorting an array by repeatedly findinf the min element and put i in the begining
		System.out.println(" Before Sorted array is :" + " ");
		for(int i=0;i<L;i++) {
			System.out.print(a[i] + " ' ");
		}
		for(int i=0;i<L-1;i++) {
			int minIndex= i;
			for(int j=i+1;j<L;j++) {
				if(a[minIndex] > a[j]) 
					minIndex = j;
			}
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		
		System.out.println();
		System.out.println("Sorted array is :" + " ");
		for(int i=0;i<L;i++) {
			System.out.print(a[i] + " ' ");
		}
	}
}
		
	
	

