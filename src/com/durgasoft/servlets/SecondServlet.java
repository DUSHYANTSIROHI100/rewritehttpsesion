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
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String accType=request.getParameter("accType");
		String accBranch=request.getParameter("accBranch");
		HttpSession session=request.getSession();
		session.setAttribute("accType", accType);
		session.setAttribute("accBranch", accBranch);
		out.println("<html><body bgcolor='cyan'><br><br>");
		out.println("<center><h1>Deposit Form(Cont..)</h1></center><br><br><hr><br><br>");
		out.println("<form method='POST' action='"+response.encodeUrl("./deposit")+"'>");
		out.println("<pre>");
		out.println("Depositer Amount <input type='text' name='deptAmt'/>");
		out.println();
		out.println("Depositer Name<input type='text' name='deptName'/>");
		out.println();
		out.println(" <input type='submit' value='Deposit'/>");
		out.println("</pre></form></body></html>");

	}

}
