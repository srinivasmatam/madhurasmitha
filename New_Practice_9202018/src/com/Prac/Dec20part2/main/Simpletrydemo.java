package com.Prac.Dec20part2.main;

import java.io.IOException;

public class Simpletrydemo {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		/*NESTED TRY BLOCKS
		int[] arr= new int[10];
		try{
		
		         try{		
		         arr[10]=90;
		            }catch(ArrayIndexOutOfBoundsException ex)
		              {
			          System.out.println(ex);
		             }
		         int a=10/0;
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("This is End of program");

		}*/
		int[] arr= new int[10];
		try{
			int a=10/2;
			throw new IOException("Wating for the resource");
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				arr[10]=10;
			}catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println(ex);
			}
			System.out.println("This is End of Program");
		}
		
	}
}
