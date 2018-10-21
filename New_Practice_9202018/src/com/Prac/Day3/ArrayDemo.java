package com.Prac.Day3;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array values");
		for (int i=0;i<5;i++)
		{
			numbers[i]=s.nextInt();
		}
		
		System.out.println("Array values are");
		for(int i : numbers)
		{
			System.out.println(i);
		}

	}

}
