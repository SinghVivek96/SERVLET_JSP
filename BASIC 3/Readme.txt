* Java Servlet:

AddServlet:
1.Instead of RequestDispatcher we will be using SendRedirect this time.
2.It is a response to another servlet thus,
res.sendRedirect("sq?k="+k);
here sq is the url and other parameter is used to send value to another servlet
3.There are 3 ways to do so:
  1. Cookies
  2. URL-Rewriting
  3. Session Management

Here in the example we are following the URL-Rewritting.



SqServlet:
1.int k = Integer.parseInt(req.getParameter("k"));
  To get the value from the addressbar
