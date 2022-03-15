package com.te.javabasics.accessmodifiers;

import java.util.Arrays;

public class DuplicateElements {
//	public static void main(String[] args) {

//		int[] arr = { 1, 2, 2, 4, 5, 8, 6, 8, 31 };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("Duplicate elements in given array is " + arr[j]);
//				}
//			}
//		}
//	
	public static void main(String[] args) {
		int a[] = {1,3,2,2,4,3,2,4,5,1,2};
		System.out.println("Duplicate elements in an array is");
		
		for(int j=0;j<a.length;j++) {
			int count =0;
			for(int i=0;i<a.length;i++) {
				if(a[i] == a[j]&& i!=j){
					count++;
					a[i] = '\n';
				}
			}
			if(a[j] !='\n' && count>0) {
				System.out.print(a[j]+" ");
			}
		}
	}	
 
 
		
		
}
