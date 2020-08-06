package com.vivek;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//Dispatcher Servlet
//		int k = (int) req.getAttribute("k");
//		PrintWriter out = res.getWriter();
//		out.println("Square is	" + (k*k));
		
		//Send Redirect
		int k = Integer.parseInt(req.getParameter("k"));
		System.out.println("square called");
		PrintWriter out = res.getWriter();
		out.println("Square is	" + (k*k));
	}
}
