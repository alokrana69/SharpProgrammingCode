package com.sharpnearProTestLevel2.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Example 1: 

//Input:-
//
//[3,2,3]
//
//Output:-
//
//3
//
//Explanation:- the class 3 is of 2 students which is maximum from given array

public class MajorityElement {

	public static int findMajority(int[] arr) {
		
		Map<Integer, Integer> classCounts = new HashMap<>();
		
		int majorityClass = 0;
		int maxCount = 0;
		
		for(int classNumber : arr) {
			
			int count = classCounts.getOrDefault(classNumber, 0) + 1;
			
			classCounts.put(classNumber, count);
			
			if(count > maxCount) {
				
				majorityClass = classNumber;
				maxCount = count;
			}
		}
		return majorityClass;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value Of n: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the Integer value: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int output = findMajority(arr);
		System.out.println("Output: " + output);
	}
}
