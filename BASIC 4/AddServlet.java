package com.vivek;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		PrintWriter out = res.getWriter();
		out.println("response is "+k);
		//Dispatcher Servlet
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		req.setAttribute("k", k);
//		rd.forward(req, res);

		//Send Redirect
//		res.sendRedirect("sq?k="+k);  // comes under session management(url reqriting)
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
		
		//Cookies
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}