package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FisrtServlet
 */
@WebServlet("/first")
public class FisrtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String accNo=request.getParameter("accNo");
		String accName=request.getParameter("accName");
		HttpSession session=request.getSession();
		session.setAttribute("accNo", accNo);
		session.setAttribute("accName", accName);
		out.println("<html><body bgcolor='cyan'><br><br>");
		out.println("<center><h1>Deposit Form(Cont..)</h1></center><br><br><hr><br><br>");
		out.println("<form method='POST' action='"+response.encodeUrl("./second")+"'>");
		out.println("<pre>");
		out.println("Account Type <input type='text' name='accType'/>");
		out.println();
		out.println("Account Branch <input type='text' name='accBranch'/>");
		out.println();
		out.println(" <input type='submit' value='Next'/>");
		out.println("</pre></form></body></html>");
		}
	

	}

