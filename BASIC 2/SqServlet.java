package com.vivek;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = (int) req.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println("Square is	" + (k*k));
	}
}
