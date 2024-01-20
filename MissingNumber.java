package com.sharpnear.org;

import java.util.Scanner;

//Question:-

//Example 1:
//
//Input: nums = [3,4,1]
//
//Output: 2
//
//Explanation: n = 4 since there are 3 numbers, so all numbers are in the range [1,4]. 2 is the missing number in the range since it does not appear in nums.

public class MissingNumber {

	public static int missing_elements(int[] arr) {
		
		int n = arr.length;
		
		int expectedSum = (n + 1) * (n + 2)/2;
		
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			
			total = total + arr[i];
		}
		return expectedSum - total;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the integer element: ");
		
		for(int i= 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int output = missing_elements(arr);
		
		System.out.println("output: " + output);
	}
}
