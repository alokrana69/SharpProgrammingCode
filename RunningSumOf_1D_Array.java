package com.sharpnear.org;

import java.util.Scanner;

//Question:-
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


public class RunningSumOf_1D_Array {

    public static int[] runningSum(int[] nums) {
    	
    	for(int i = 1; i < nums.length; i++) {
    		
    		nums[i] = nums[i-1] + nums[i];
    	}
    	return nums;
    }
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value Of n: ");
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] output = runningSum(arr);
		
		for(int i = 0; i < n; i++) {
		  System.out.println(output[i] + " ");
		}
	}
}
