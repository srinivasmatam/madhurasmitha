package com.Prac.Day2;

import java.util.Scanner;

public class For_loop_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int no,sum=0;
		for(int i=0;i<=5;i++)
		{
			System.out.println("Enter Number value");
			no=s.nextInt();
			if(no>0)
			{
				sum=sum+no;
			}
			else{
				continue;
		}

			
	}

		System.out.println("Sum of 5 positive Numbers " + sum);
	}

}
