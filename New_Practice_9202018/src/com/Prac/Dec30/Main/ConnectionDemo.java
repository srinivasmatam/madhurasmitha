package com.Prac.Dec30.Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Prac.Dec30.Entity.ConnectDB;

public class ConnectionDemo {

	public static void main(String[] args) throws SQLException {
		Connection con;
		Statement st;
		ResultSet rs;
		
		con=ConnectDB.getConnection();
		st=con.createStatement();
		int i = st.executeUpdate("insert into student vaues('s10098','Madhu','Java')");
		if(i>0)
		{
			System.out.println("Data Inserted Sucessfully");
		}
		con.close();

	}

}
