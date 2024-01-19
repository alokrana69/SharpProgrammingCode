package com.sharpnear.org;

//Question

// i/p :- [1,2,3,4,5]

import java.util.Scanner;

public class SubArrays {
 
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the value Of N:");
		 
		 int n = sc.nextInt();
		 
		 int[] arr = new int[n];
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 arr[i] = sc.nextInt();
			 
		 }
		 for(int i= 0; i < arr.length; i++) {
			 
			 for(int j = i; j < arr.length; j++) {
				 
				 for(int k = i; k <= j; k++) {
					 
					 System.out.print(arr[k]);
				 }
				 System.out.println();
			 }
		 }
	}
}
