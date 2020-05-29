package com.learning.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class TCBigO {

	public static void main(String[] args) {
		
		//O(1) -->1 is constant 
		int num = 1;
		System.out.println(num);
		
		System.out.println("====================================");
		
		//Odd or Even number -->O(1)
		int num1 = 21;
		if(num1 % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		System.out.println("====================================");
		
		//Print list of numbers from 1 to 10
		//Using for loop -> Result of time complexity :O(n)
		for(int i =1; i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("====================================");
		
		//Find the largest number in an array.
		//Sorting the array and then finding the largest element
		//Time complexity is more O(n^2)-> algorithm is slow
		int arr[] = {5,1,10,45,78,0,2,3,6};
		int temp,size;
		size = arr.length;
		for(int i = 0 ;i <size; i++) {
			for(int j = i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}		
		}System.out.println("The largest number in an array is"+ arr[size-1]);
		System.out.println("====================================");
		// O(n)-> Better approach for an unsorted array
		//Using only one for loop and a Max variable
		int arr1[] = {78,5,1,10,45,0,2,3,6};
		int max = 0;
		for(int i =0;i<arr1.length;i++) {
			if(max<arr1[i]) {
				max= arr1[i];
			}
		} System.out.println(max);
		System.out.println("====================================");
		
		//Create a HasMap and fetch the element from the Map: Look Up HasMap
		//Time Complexity is O(1)
		Map<String, Double> hash1= new HashMap<String, Double>();
		hash1.put("Shashi", 3.9);
		hash1.put("Kathan", 3.8);
		hash1.put("Ankit", 3.7);
		hash1.put("Kethan", 3.0);
		hash1.put("Pruthiv", 3.85);
		System.out.println(hash1.get("Shashi"));
		
		System.out.println("====================================");
		
		//Time complexity For matrix operation.->O(n^2)
		for(int i =0;i<=3;i++) {
			for(int j= 0;j<=3;j++) {
				System.out.print(i +""+j +" ");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		//WAP to find the duplicate number in an array
		int dup[] = {1,1,10,12,15,10,12,16,15,30};
		for(int i = 0;i<dup.length;i++) {
			for(int j = 0;j<dup.length;j++) {
				if(i==j) 
					continue;
				if(dup[i]==dup[j]) {
					System.out.println(dup[i]+" Is duplicate");
				}
			}
		}
		
		
		

		
	}

}
