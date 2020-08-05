Servlet.java
1. If we have 2 servlets, can we call one from another ?
   Yes, we can do the same using requestDispatcher(if another       request is on the same page) or we can use redirect

Request Dispatcher

S1-RequestDispatcher rd = req.getRequestDispatcher("sq"); // Me
S1-req.setAttribute("k", k);
S1-rd.forward(req, res);
S2-req.getAttribute("k");

Redirect


Web.xml
1. Make sure you have added the mapping for 2nd servlet