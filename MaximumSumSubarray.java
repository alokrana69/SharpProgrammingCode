package com.sharpnear.org;

import java.util.Scanner;

//Question:-

//Given an array find the maximum sum subarray. Return the maximum sum of the subarray.
//
//Input:-
//
//[5,2,-4,-5, 3,-1,2,3,1]
//
//Output:-
//
//8
//
//Reason :- 3,-1,2,3,1 is the maximum subarray possible.

public class MaximumSumSubarray {

	public static int find_maximum_subarray(int[] arr) {
		
		int max_so_for = Integer.MIN_VALUE;
		
		int max_ending_here = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			max_ending_here = max_ending_here + arr[i];
			
			if(max_so_for < max_ending_here) {
				
				max_so_for = max_ending_here;
			}
			if(max_ending_here < 0) {
				
				max_ending_here = 0;
			}
		}
		return max_so_for;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value Of n: ");
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = find_maximum_subarray(arr);
		System.out.println(max);
	}
}
