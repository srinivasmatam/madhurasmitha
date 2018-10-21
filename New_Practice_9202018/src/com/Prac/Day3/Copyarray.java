package com.Prac.Day3;

import java.util.Arrays;

public class Copyarray {

	public static void main(String[] args) {
		
		/*how to copy an array 
		int[] a = {12,13,14,15};
		int[] b = a;
		 System.out.println("Printing b array");
		 for(int i=0;i<=b.length-1;i++)
		 {
			 System.out.println(b[i]);
		 }
		 a[2]=78;
		 System.out.println(b[2]);*/
		
//*******************************************
		 //how to copy an array using for-loop.
		/*int[] a = {12,13,14,15};
		int[] b = new int[4];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Printing b array");
		for (int i : b) {
			System.out.println(i);
		}*/
//*******************************************	
		
	/*	Copying An Array Using copyOf() Method of java.util.Array Class :
		
		int[] a={12,13,14,15};
		int[] b=Arrays.copyOf(a, a.length);
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Printing b array");
		for (int i : b) {
			System.out.println(i);
		}*/
		
//*******************************************			
	/*	Copying An Array Using clone() Method :
		int[] a = {38,23,43,45};
		int[] b = a.clone();
		
		System.out.println("Printing b array");
		for (int i : b) {
			System.out.println(i);
		}*/
		
//*******************************************				
		
		 //Copying An Array Using arraycopy() Method Of System Class :
		/* int a[]={98,23,76,34};
		 int b[]= new int[a.length];
		 
		 System.arraycopy(a, 0, b, 0, a.length);
		 for (int i : b) {
				System.out.println(i);
			}*/
		
//*****************************************	
//sort the array elements
	int[] a = {19,2,34,12,98,34};
	Arrays.sort(a);
	for (int i : a) {
		System.out.println(i);
		
	}
	
	}
	

}
