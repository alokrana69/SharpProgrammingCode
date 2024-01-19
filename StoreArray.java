package com.sharpnear.org;

public class StoreArray{

    public static int[] store_Array(int n) {
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }

    public static void main(String[] args) {

        int n = 5;

        // Calling the storeArray method to get the result array
        int[] result = store_Array(n);

        // Printing the result array
        System.out.println("Result array:");
        
        for(int i = 0; i < result.length; i++) {
        	
        	System.out.print(result[i] + " ");
        }
    }
}