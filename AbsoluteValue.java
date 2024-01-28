package com.sharpnearMockInterview2.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Input:-
//
//Arr - [9,5,1, 11,14]
//
//Target - 2
//
//
//
//Output:-
//
//[0, 3]
//
//Explanation:- 
//
//Absoulte value of(9-11) is 2 = target.

public class AbsoluteValue {

	public static int[] target_hitting(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] result = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			
			int currNum = nums[i];
			
			int possibleNum1 = currNum + target;
			
			int possibleNum2 = currNum - target;
			
			if(map.containsKey(possibleNum1)) {
				result[0] = map.get(possibleNum1);
				result[1] = i;
				return result;       
			}
			if(map.containsKey(possibleNum2)) {
				result[0] = map.get(possibleNum2);
				result[1] = i;
				return result;
			}
			map.put(currNum, i);
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the Integer value: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the targer value: ");
		int target = sc.nextInt();
		
		int[] output = target_hitting(arr, target);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
