package com.sharpnear.org;

//Question:-

//Input:-
//
//[4,3,2,5,1]
//
//Output:-
//
//[5,4,3,2,1]
		
import java.util.Scanner;

public class BubbleSort {

	public static int[] sort_array(int[] arr, int len) {
		
		for(int i = 0; i < len - 1; i++) {
			
			for(int j = 0; j < len - i - 1; j++) {
				
				if(arr[j] < arr[j + 1]) {
					
					//swap 
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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
		
		int[] output = sort_array(arr, n);
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(output[i] + " ");
		}
	}
}
