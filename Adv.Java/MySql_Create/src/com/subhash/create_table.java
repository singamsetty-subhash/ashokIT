package com.subhash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table {

	public static void main(String[] args) throws SQLException{
		Connection conn=null;
		Statement stmt=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Jdbc Driver loaded");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("connection created");
		stmt=conn.createStatement();
		System.out.println("Statement is created");
		String query="CREATE TABLE CUSTOMERS("
				+"ID INT(9) PRIMARY KEY,"
				+"NAME VARCHAR(20),"
				+"EMAIL VARCHAR(30),"
				+"PHONE BIGINT(20)"
				+")";
		
		stmt.executeUpdate(query);
		System.out.println("table is created");
		String query2=("INSERT INTO CUSTOMERS VALUES(101,'SUBHASH','singamsettysubhash@gmail.com',8247472841)");
		stmt.executeUpdate(query2);
		System.out.println("Query inserted");

			}
		catch(Exception e) {
			e.printStackTrace()	;
			}
		finally {
						if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
			System.out.println("connection closed");

		}
	}

}
