package com.Prac.Dec21and22.main;

import java.util.Scanner;

import com.Prac.Dec21and22.Entity.AgeNotValidException;

public class UserdefinedException {
	
	void checkAge() throws AgeNotValidException
	{
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age");
		age=scan.nextInt();
		if(age<=18)
		{
			throw new AgeNotValidException();
		}
		System.out.println("Given age is valid" +age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         UserdefinedException exp = new UserdefinedException();
         try {
			exp.checkAge();
		} catch (AgeNotValidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
         System.out.println("End Of Program");
	}

}
