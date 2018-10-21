package com.Prac.Dec19.main;

public class Dateformatdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date = "10/20/2018";
		if(date.matches("\\d{2}/\\d{2}/\\d{4}"))
		{
			System.out.println("Its a Valid format");
		}
		else
		{
			System.out.println("Its not valid");
		}
	}

}
