// Question

//Example 1:
//
//Input: arr = [1,4,2,5,3]
//Output: 58
//Explanation: The odd-length subarrays of arr and their sums are:
//[1] = 1
//[4] = 4
//[2] = 2
//[5] = 5
//[3] = 3
//[1,4,2] = 7
//[4,2,5] = 11
//[2,5,3] = 10
//[1,4,2,5,3] = 15
//If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

package com.sharpnear.org;

import java.util.Scanner;

public class SumOfOddLengthSubArray {

	public static int sumOddLengthSubarray(int[] arr) {
		
		int n = arr.length;
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			int x = i + 1;
			int y = arr.length - i;
			
			int num_subarrays  = x * y;
			//unary operator 
			
			int odd_subarrays = num_subarrays % 2 == 0 ? num_subarrays/2 : num_subarrays / 2 + 1;
			
			sum = sum + odd_subarrays * arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i= 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int output = sumOddLengthSubarray(arr);
        System.out.println(output);
	}
}
