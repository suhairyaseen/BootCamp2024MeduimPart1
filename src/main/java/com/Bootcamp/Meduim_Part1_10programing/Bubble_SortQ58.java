package com.Bootcamp.Meduim_Part1_10programing;

public class Bubble_SortQ58 {

	public static void main(String[] args) {
	int[]a = {55,8,101,23,7,35};
	int L = a.length;
	System.out.print("Before sorting Array is:" + " ");
	for(int i=0;i<L;i++) {
	System.out.print(a[i] + ",");
	}
	for(int i = 0;i<L;i++) {
		for(int j=1;j<L-i;j++) {
			if(a[j-1] > a[j]) {
				int temp = a[j];
				a[j]= a[j-1];
				a[j-1] = temp;
			}
		}
	}System.out.println();
	System.out.print("the sorted Array is:" + " ");
	for(int i=0;i<L;i++) {
		System.out.print(a[i] + ",");
	}
	}

}
