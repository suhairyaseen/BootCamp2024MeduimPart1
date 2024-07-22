package com.QuickSortQ22;

public class QuickSort {

	public static void main(String[] args) {
		int [] array = {2,8,5,3,9,6,7,1,4};
		quickSort(array , 0, array.length-1);
		for(int i : array) {
			System.out.println(i + " ");
		}
//quick sort = moves smaller elements to the left of pivot
		//time Complexitly best and avarage 0(n(log(n))
	}

	private static void quickSort(int[] array, int start, int end) {
		if(end <= start) 
			return;//base case
		int pivot = partirtion(array,start,end);//
		quickSort(array,start,pivot-1);
		quickSort(array, pivot+1, end);
	}
	private static int partirtion(int[] array, int start, int end) {
	int	pivot = array[end];
	int i = start -1;
	
	for(int j= start;j<=end-1;j++) {
		if(array[j] < pivot) {
			i++;
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		
		
		return i;
		
	}
}