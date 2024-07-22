package com.Bootcamp.Meduim_Part1_10programing;

public class Insertion_SortQ60 {

	public static void main(String[] args) {
int[]a = {32,4,67,109,11,19,35};
int L = a.length;

System.out.print(" Before sorting the  Array :" );
for(int i=0; i<L;i++) {
	System.out.print(a[i] + " ,");
	//the insertion sort :its compare the element with the previous element and swap it 
}
for(int i=1;i<L;i++) {
	int temp = a[i];
	int j = i-1;
	
	while(j>=0 && a[j] > temp) {
		a[j+1] = a[j];
		j--;
	}
	a[j+1] = temp;
} 
System.out.println();
System.out.print("After sorting the Array:" );
for(int i=0; i<L;i++) {
	System.out.print(a[i] + " ,");
	}
	}
}
