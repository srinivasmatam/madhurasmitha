package com.Prac.Dec20part2.main;

import java.util.Scanner;

public class Excpetiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10/0;
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter any message");
			String msg=scan.nextLine();
			System.out.println(msg);
			
		}
		try
		{
			int[] arr= new int[4];
			arr[5]=2;
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		System.out.println("This is End of Program");
	}

}
