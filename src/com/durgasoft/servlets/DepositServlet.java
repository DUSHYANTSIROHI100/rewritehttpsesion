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
 * Servlet implementation class DepositServlet
 */
@WebServlet("/deposit")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		
			String deptName=request.getParameter("deptName");
			HttpSession session=request.getSession();
			String accNo=(String)session.getAttribute("accNo");
			String accName=(String)session.getAttribute("accName");
			String accType=(String)session.getAttribute("accType");
			String accBranch=(String)session.getAttribute("accBranch");
			out.println("<html><body bgcolor='lightblue'><br><br>");
			out.println("<center><table>");
			out.println("<tr><td colospan='2'><center><b><font size='6' color='red'>");
			out.println("<u>Transaction Details</u><font></b></center></td></tr>");
			out.println("<tr><td>Transaction Id</td><td>:t1</td></tr>");
			out.println("<tr><td>Transaction Name</td><td>:Deposit</td></tr>");
			out.println("<tr><td>Account Name</td><td>:"+accNo+"</td></tr>");
			out.println("<tr><td>Account Type</td><td>:"+accType+"</td></tr>");
			out.println("<tr><td>Account Branch</td><td>:"+accBranch+"</td></tr>");
			out.println("<tr><td>Depositor Name</td><td>:"+deptName+"</td></tr>");
			out.println("<tr><td>Account Number</td><td>SUCCESS</td></tr>");
			out.println("</table></body></html>");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
