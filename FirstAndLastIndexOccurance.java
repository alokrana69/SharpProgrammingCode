package com.sharpnearProTestLevel2.org;

import java.util.Scanner;

//Example 1:
//
//Input:
//
//n=9, x=5
//
//arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
//
//Output: 2 5
//
//Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.

public class FirstAndLastIndexOccurance {

	public static int[] firstAndlastOccurance(int[] nums, int target) {
		
		// creating empty array...
		int[] ans = new int[2];
		
		int i = 0; int j = nums.length-1;
		
		ans[0] = -1;
		ans[1] = -1;
		
		int count1 = 0;
		int count2 = 0;
		
		while(count1 == 0 && i < j || count2 == 0 && i < j) {
			
			if(nums[j] == target) {
				
				ans[1] = j;
				count2 = 1;
				break;
			}
			else {
				j--;
			}
		}
		while(count1 == 0 && i < nums.length-1) {
			
			if(nums[i] == target) {
				ans[0] = i;
				count1 = 1;
			}
			else {
				i++;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		System.out.println("Enter the Integer value: ");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		
		int[] output = firstAndlastOccurance(nums, target);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
			
		}
	}
}
