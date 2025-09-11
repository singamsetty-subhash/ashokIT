package com.subhash;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchEmpServlet
 */
@WebServlet("/searchSrv")
public class SearchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * read parameter
		 */
		int empno=Integer.parseInt(request.getParameter("empno"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		loadDriver();
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM EMP WHERE EMPNO=(?)")
			)
		{
		ps.setInt(1,empno);
		ResultSet  rs=ps.executeQuery();
		if(rs!=null) {
			rs.next();
			out.println("<html><head><title></title></head><body>");
			out.println("Empno: "+rs.getInt(1));
			out.println("<br>");
			out.println("Ename: "+rs.getString(2));
			out.println("<br>");
			out.println("Sal: "+ rs.getDouble(3));
			out.println("<br>");
			out.println("Deptno: "+ rs.getInt(4));
			out.println("<br>");
			out.println("</body></html>");

			
		}
		else {
			out.println("<html><head><title></title></head><body>");
			out.println("<h2> No Records Found</h2>");
			out.println("</body></html>");
		}
	}
	catch(Exception ex) {
		out.println("<html><head><title></title></head><body> Error Occured</body></html>");
		ex.printStackTrace();
	}
		out.close();

}

	private void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception ex) {
				ex.printStackTrace();
			}		
	}
}