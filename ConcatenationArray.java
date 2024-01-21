package com.sharpnear_DSA1.org;
//Question:-
//Input: nums = [4,5,1]
//
//Output: [4,5,1,4,5,1]
//
//Explanation: The array ans is formed as follows:
//
//ans = [4,5,1,4,5,1]

import java.util.ArrayList;
import java.util.Scanner;

public class ConcatenationArray {

	public static ArrayList<Integer> getConcatenation(ArrayList<Integer> nums){
		
		int n = nums.size();
		
		ArrayList<Integer> ans = new ArrayList<>(2*n);
		
		ans.addAll(nums);
		ans.addAll(nums);
		
		return ans;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			nums.add(sc.nextInt());
		}
		ArrayList<Integer> ans = getConcatenation(nums);
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
			 
		}
		System.out.println();
	}
}
