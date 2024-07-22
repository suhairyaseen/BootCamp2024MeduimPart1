package com.MergeSortArrayQ27;

public class MergeSort {

	public static void main(String[] args) {
		int[]array = {8,3,5,2,7,9,6,1,4,10};
		
		mergeSort(array);
		
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i] + " ");
		}
		
		}

	private static void mergeSort(int[] array) {
		int length = array.length;
		if(length <= 1) return;//base case
		
		
	     int middle = length / 2 ;
	     int[] leftArray = new int [middle];
	     int[] rightArray = new int [length - middle];
	     
	     int i = 0;//that for left
	     int j = 0;//that for right
	     
	     for(i = 0; i< length ; i++) {
	    	if(i < middle) {
	    		leftArray[i] = array[i];
	    	}
	    	else {
	    		rightArray[j] = array[i]; 
	    		j++;
	     }
	}
	     mergeSort(leftArray);//Keep dividing the array
	     mergeSort(rightArray);
	     merge(leftArray,rightArray,array);
	}
	private static void merge(int[]leftArray,int[]rightArray,int[]array) {
		int leftsize = array.length /2;
		int rightsize = array.length - leftsize;
		int i=0,l=0,r=0;//indices for array and right and left
		
		//check condition for mergeing
		while(l<leftsize && r< rightsize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] =rightArray[r];
				i++;
				r++;
			}
		
			}
		while(l<leftsize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r<rightsize) {
			array[i] = rightArray[r];
			i++;
			r++;
	}
		
}
}
