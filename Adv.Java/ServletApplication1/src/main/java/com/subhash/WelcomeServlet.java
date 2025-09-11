package com.subhash;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>");
		out.println("Welcome to Servelet");
		out.println("</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		}
	
	}
