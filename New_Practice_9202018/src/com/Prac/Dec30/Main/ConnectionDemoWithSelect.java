package com.Prac.Dec30.Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Prac.Dec30.Entity.ConnectDB;

public class ConnectionDemoWithSelect {

	public static void main(String[] args) throws SQLException {
		Connection con;
		Statement st;
		ResultSet rs;
		
		con=ConnectDB.getConnection();
		st=con.createStatement();
		
		rs=st.executeQuery("select productId,productdesc,price from Product");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
		}
con.close();
	}

}
