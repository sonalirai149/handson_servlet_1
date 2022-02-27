package com.org.gen1;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloworlsservlet
 */
@WebServlet("/Helloworlsservlet")
public class Helloworlsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
	/**
	 message = "Hello World";
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter pw = response.getWriter();
	      pw.println("<h1>"+ message +"</h1>");
	      pw.println("<hr>");
	     pw.println("<h1>" + message + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
