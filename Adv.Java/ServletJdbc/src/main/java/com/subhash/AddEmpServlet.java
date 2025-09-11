package com.subhash;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/addSrv")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 *  read the parameters
		 */
		int empno=Integer.parseInt(request.getParameter("empno"));
		String ename=request.getParameter("ename");
		double sal=Double.parseDouble(request.getParameter("sal"));
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		loadDriver();
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			PreparedStatement ps=conn.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?)")
			)
		{
		ps.setInt(1,empno);
		ps.setString(2, ename);
		ps.setDouble(3, sal);
		ps.setInt(4, deptno);
		ps.executeUpdate();
		out.println("<html><head><title>Success</title></head><body><h3>Employee Added Successfully to the Database</h3></body></html>");
		}
	
	catch(Exception ex) {
		out.println("<html><head><title>Failed</title></head><body><h3>Employee insertion failed  to the Database</h3></body></html>");

		ex.printStackTrace();
	}
	}

	private void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
	}

}
