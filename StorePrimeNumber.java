package com.sharpnear.org;

import java.util.Scanner;

public class StorePrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N: ");
		
		int n = sc.nextInt();
		
		int x = 2;
		
		int counter = 0;
		
		int[] a = new int[n];
		
		while(counter < n) {
			
			boolean flag = true;
			
			for(int i = 2; i < x; i++) {
				
				if(x % i == 0) {
					
					flag = false;
					break;
				}
			}
			if(flag) {
				a[counter] = x;
				counter = counter + 1;
				
			}
			x = x + 1;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
