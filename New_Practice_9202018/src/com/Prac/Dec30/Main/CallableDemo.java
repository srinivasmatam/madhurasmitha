package com.Prac.Dec30.Main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.Prac.Dec30.Entity.ConnectDB;

public class CallableDemo {

	public static void main(String[] args) throws SQLException {
		Connection con;
		Statement st;
		ResultSet rs;
		
		con=ConnectDB.getConnection();
		CallableStatement cst = con.prepareCall("{?=call StoreStudent('?','?','?')}");
		cst.registerOutParameter(1, Types.INTEGER);
		cst.setString(2,"s10090");
		cst.setString(3, "Madhu");
		cst.setString(4, "Java");
		cst.execute();
		int i = cst.getInt(1);
		if(i>0)
		{
			System.out.println("Sucessfully Inserted");
			
		}
		

	}

}
