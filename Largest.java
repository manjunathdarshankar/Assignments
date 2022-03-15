package com.te.javabasics.accessmodifiers;

//public class Largest {
//	public static int getLargest(int[] a, int total) {
//		int temp;
//		for (int i = 0; i < total; i++) {
//			for (int j = i + 1; j < total; j++) {
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		return a[total - 2];
//	}
//
//	public static void main(String args[]) {
//		int a[] = { 1, 2, 5, 6, 3, 2 };
//		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
//		System.out.println(" Largest: " + getLargest(a, 6));
//		System.out.println(" Largest: " + getLargest(b, 7));
//	}
//}


public class Largest{
	public static void main(String[] args) {
		int[] arr = {25,34,7,88,99};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest element in the array is "+max);
	}
}

