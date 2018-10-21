package com.Prac.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array values");
		for (int i=0;i<5;i++)
		{
			numbers[i]=s.nextInt();
		}
		
		System.out.println("Sorted Array values are");
		/* ASECENDING ORDER SORT
		Arrays.sort(numbers);
		for (int i : numbers)
		{
			System.out.println(i);
		}*/
		
		Arrays.sort(numbers);
		System.out.println(numbers.length);
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println(numbers[i]);
		}
	}

}
