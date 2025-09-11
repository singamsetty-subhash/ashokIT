package com.subhash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table_creation {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Jdbc Driver loaded");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		System.out.println("connection created");
		Statement stmt=conn.createStatement();
		System.out.println("Statement is created");
		String query="CREATE TABLE CUSTOMER("
				+"ID NUMBER(9) PRIMARY KEY,"
				+"NAME VARCHAR2(20),"
				+"EMAIL VARCHAR2(30),"
				+"PHONE NUMBER(20)"
				+")";
		stmt.executeUpdate(query);
		System.out.println("table is created");
		stmt.close();
		conn.close();
		System.out.println("connection closed");
	}

}
