package com.RotatedSortedArrayQ28;

public class SortedArray {

	
public static  int sortArrayCode(int [] a , int target) {
	int L = 0 , H = a.length - 1, M = 0;
	
	while(L <= H) {
		M = (L+H)/2;
		if(target == a[M]) {
			return M;
		}
		else if(a[L] <= a[M]) {
			if( target >=a[L] && target < a[M]) {
				H= M-1;
			}
			else {
				L = M+1;
			}
		}
		else {
			if(target > a[M] && target <= a[H]) {
				L = M+1;
			}
			else {
				H = M-1;
			}
		}
	
	}
	return -1;
	
}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int [] S= {4,5,6,7,8,1,2};
		System.out.println(sortArrayCode(S ,1));

	}

}
