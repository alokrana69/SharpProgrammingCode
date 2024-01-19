package com.sharpnear.org;

import java.util.Scanner;

//Given an array find the maximum in it and return it 
//
//
//
//Example:-
//
//Input:-
//
//Arr=[5, 4, 7, 2, 6]
//
//Ouput:-
//
//7


public class MaximumArray {

	public static int maximumArray(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(max < arr[i]) {
				
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the value of Integer Element: ");
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
		}
		int output = maximumArray(arr);
		
		System.out.println(output);
		
	}
}
