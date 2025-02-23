package com.sid.logical_Program;

public class MergeArrays {
	//merge arr1 and arr2 and create third array.
	public static void main(String[] args) {
	
		int arr1[]= {6,5,3,7};
		int arr2[]= {9,7,1,7,9};
		
		int arr3[]=new int[arr1.length+arr2.length];
		
		int i=0;
		for (int a1 : arr1) {
			
			arr3[i]=a1;
			i++;
			
		}
		
		for (int a2 : arr2) {
			
			arr3[i]=a2;
			i++;
			
		}
		for (int a3 : arr3) {
			System.out.print(a3+" ");
			
		}
		
		
		
		
		
	}

}
