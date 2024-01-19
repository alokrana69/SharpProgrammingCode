package com.sharpnear.org;

import java.util.Scanner;

public class MinimumArray {

	public static int minimumArray(int[] arr) {
		
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(min > arr[i]) {
				
				min = arr[i];
			}
		}
		return min;
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
		int output = minimumArray(arr);
		
		System.out.println(output);
		
	}
}
