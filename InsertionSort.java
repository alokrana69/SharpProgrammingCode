package com.sharpnear.org;

//Question:- INSERTION SORT

//Input:-
//
//[4,3,2,5,1]
//
//Output:-
//
//[1,2,3,4,5]

import java.util.Scanner;

public class InsertionSort {

	public static int[] insertion_sort(int[] arr, int len) {
		
		for(int i = 0; i < len; i++) {
			
			int temp = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp) {
				
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
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
		
		int[] output = insertion_sort(arr, n);
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(output[i] + " ");
		}
	}
}
