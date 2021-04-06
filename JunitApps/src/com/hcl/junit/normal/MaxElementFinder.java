package com.hcl.junit.normal;

public class MaxElementFinder {
public int FindMax(int arr[]){
	int max=Integer.MIN_VALUE;
	for(int num:arr) {
		if(num>max) {
			max=num;
		}
	}
return max;
	
}
}
