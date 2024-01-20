package com.sharpnear.org;

import java.util.Scanner;

//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//
//Output: 6
//
//Explanation:
//
//1st customer has wealth = 1 + 2 + 3 = 6
//
//2nd customer has wealth = 3 + 2 + 1 = 6
//
//Both customers are considered the richest with a wealth of 6 each, so return 6.
//		
public class Maximum_2D_Array {

	public static int maximumWealth(int[][] arr) {
		
		int res = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int temp = 0;
			for(int j = 0; j < arr[i].length; j++) {
				
				temp += arr[i][j];
			}
			res = Math.max(res, temp);
		}
		return res;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value Of n: ");
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[n][c];
		
		for(int i = 0; i < n; i++) {
			arr[i][i] = sc.nextInt();
		}
		int output = maximumWealth(arr);
		
		
	}
}
