package com.validatation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class amazonjdbcconnectionproject {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String qry = "select *from chart";
			// Register for a class
		Class.forName("com.mysql.jdbc.Driver");
		//connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chart", "root", "root");
//		Statement
		Statement statement = conn.createStatement();
		//execute
		 ResultSet rs= statement.executeQuery(qry);
	while(rs.next())

		System.out.println( rs.getString(1)   );
		
	}
	//if(rs.next())
	//{
//		System.out.println(rs.getInt(1) + " "+rs.getString(2) +"  " +rs.getString(3));
	//}
		}

	


	
