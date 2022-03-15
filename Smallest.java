package com.te.javabasics.accessmodifiers;

public class Smallest {
//	public static int getSmallest(int[] a, int total){  
//		int temp;  
//		for (int i = 0; i < total; i++)   
//		        {  
//		            for (int j = i + 1; j < total; j++)   
//		            {  
//		                if (a[i] > a[j])   
//		                {  
//		                    temp = a[i];  
//		                    a[i] = a[j];  
//		                    a[j] = temp;  
//		                }  
//		            }  
//		        }  
//		       return a[0];//2nd element because index starts from 0  
//		}  
//		public static void main(String args[]){  
//		int a[]={1,2,5,6,3,2};  
//		int b[]={44,66,99,77,33,22,55};  
//		System.out.println(" smallest: "+getSmallest(a,6));  
//		System.out.println(" smallest: "+getSmallest(b,7));  
//		}}  
public static int getSecondSmallest(int[] a, int total){  
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[0];//2nd element because index starts from 0  
	}  
	public static void main(String args[]){  
	int a[]={1,2,5,6,3,5};  
	int b[]={44,66,99,77,33,22,55};  
	System.out.println("second smallest: "+getSecondSmallest(a,6));  
	System.out.println("second smallest: "+getSecondSmallest(b,7));  
	}}  
