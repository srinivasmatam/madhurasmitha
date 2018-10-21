package com.Prac.Day5.Entity;

public class Outerclass {

		private int age=10;
	
	public void showAge(){
		System.out.println("Age is "+age);
	}
	
	public class Innerclass
		{
	
		public int getAge()
		{
			System.out.println("This is getAge method" );
			return age;
		}
	}
}
