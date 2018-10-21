package com.Prac.Dec30.Entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	
	public static Connection getConnection()
	{
	Connection con = null;
	try
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Devi7890");
		System.out.println("connected to DB");
	}
	catch(Exception ex){
		
		ex.printStackTrace();
	}
	
		return con;
		
	}

}
