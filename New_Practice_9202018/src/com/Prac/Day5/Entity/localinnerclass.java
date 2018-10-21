package com.Prac.Day5.Entity;

public class localinnerclass {
	
	private int age=10;
	
	public void showAge()
	{
		 class Innerclass{
			
			 public int getAge()
			 {
				 return age;
			 }
		}
		 
		 System.out.println("Age is" +age);
		 Innerclass inobj = new Innerclass();
		 System.out.println(inobj.getAge());
	}

}
