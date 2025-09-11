package com.subhash;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatement_function {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter Emp no 1 to calculate bonus");
		int empno=scan.nextInt();
		System.out.println("enter Emp no2 to calculate bonus");

		int empno2=scan.nextInt();
		
		getbonus(empno);//7708
		getbonus(empno2);//70607708
		
	}

	private static void getbonus(int empno) {
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				CallableStatement cs=conn.prepareCall("{? = call return_Bonus(?)}")){
			cs.registerOutParameter(1, Types.DECIMAL);
			cs.setInt(2, empno);
			cs.execute();
			double bonus=cs.getDouble(1);
			System.out.println("empno:"+empno+","+"Bonus:"+bonus);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
