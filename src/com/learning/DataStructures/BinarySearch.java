
//Imported files
package com.learning.DataStructures;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6,7,8,9};
		int n = arr.length;
		int x = 6;
		int result = binarySearch(arr, x, 0, n-1);
		if(result == -1) {
			System.out.println("Element not found in the array");
		}else {
			System.out.println("Element found in the array :"+ result);
		}
	}
	public static int binarySearch(int arr[],int x, int low,int high) {
		
		while(low<= high) {
			int mid = low +(high -low)/2;
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] < x)
				low = mid +1;
			else
				high = mid -1;
		}
		return -1;	
		
	}

}
