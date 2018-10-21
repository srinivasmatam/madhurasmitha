package com.Prac.Dec27.Main;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console con = System.console();
		System.out.println("Enter User Name");
		String Username = con.readLine();
		System.out.println("Enter password");
		String pwd = new String(con.readPassword());
		
		if(pwd.equals("admin@123"))
		{
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("Invalid User");
		}
		

	}

}
