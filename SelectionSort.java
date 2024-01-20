package com.sharpnear.org;

//Question:- SELECTION SORT

//Input:-
//
//[4,3,2,5,1]
//
//Output:-
//
//[5,4,3,2,1]


import java.util.Scanner;

public class SelectionSort {

	public static int[] selection_sort(int[] arr, int len) {
		
		for(int i = 0; i < len - 1; i++) {
			
			int min = i;
			int temp = 0;
			
			for(int j = i + 1; j < len; j++) {
				
				if(arr[j] > arr[min]) {
					
					min  = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
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
		
		int[] output = selection_sort(arr, n);
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(output[i] + " ");
		}
	}
}
