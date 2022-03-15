package com.te.javabasics.common;

//public class pattern2 {
//	public static void main(String[] args) {
//		int i, j, k;
//		for (i = 1; i <= 5; i++) {
//			for (j = 5; j > i; j--) {
//				System.out.print("  ");
//			}
//		}
//		for (k = 1; k <= i; k++) {
//			System.out.print("*");
//		}
//		System.out.print("\n");
//	}

public class pattern2 {
	public static void printTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int n = 4;
		 printTriangle(n);
	}
}
