package com.vivek;
import javax.servlet.ServletResponse;
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
//		int k = Integer.parseInt(req.getParameter("k"));
//		System.out.println("square called");
//		PrintWriter out = res.getWriter();
//		out.println("Square is	" + (k*k));
		
		//Using Session Management
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
//		PrintWriter out = res.getWriter();
//		out.println("Square of number using session management is " + (k*k));
		
		//Using Cookie
		int k=0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies){
			if(c.getName().equals("k")){
				k=Integer.parseInt(c.getValue());	
			}
		}
		PrintWriter out =  res.getWriter();
		out.println("The square using cookies is "+k*k);
		
	}
}
