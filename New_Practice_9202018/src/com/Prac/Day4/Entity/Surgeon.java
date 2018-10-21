package com.Prac.Day4.Entity;

public class Surgeon extends Doctor{
	int a=90;
	
	public Surgeon(String name)
	{
		super(name);
		System.out.println("Surgeon defualt constructor" + name);
		System.out.println(super.a);
		
	}
	

	public void treatpatient()
	{
		super.treatpatient();
		System.out.println("Surgeon Treat patient");
	}
	
	public void incision()
	{
		System.out.println("Surgeon incision");
	}
	
	public void getA()
	{
		System.out.println(a);
	}

}
