package com.sharpnearMockInterview2.org;

import java.util.Scanner;

//Test Case 1:
//
//4
//
//1 3 5 6
//
//5
//
//Output: 2
//
//Explanation: In the given list [1, 3, 5, 6], the target value 5 is already present at index 2. Therefore, the expected output is 2, indicating that the target should be inserted at index 2 to maintain the sorted order.

public class SearchIndex {

	public static int searchInsert(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			
			int mid = left + (right - left)/2;
			
			if(nums[mid] == target) {
				return mid;
				
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return left;
	}
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the value of n: ");	
    	int n = sc.nextInt();
    	
    	int[] nums = new int[n];
    	System.out.println("Enter the Integer value: ");
    	for(int i= 0; i < n; i++) {
    		nums[i] = sc.nextInt();
    	}
    	System.out.println("Enter the Target Value: ");
    	int target = sc.nextInt();
    	int result = searchInsert(nums, target);
    	System.out.println("Output: " + result);
    	
    	
	}
}
