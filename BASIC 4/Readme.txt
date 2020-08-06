---------------------------------------------------
This is SendRedirect using Session Management.

Java Servlet

HttpSession session = req.getSession();
session.setAttribute("k", k);
res.sendRedirect("sq");
int k = (int) session.getAttribute("k");
session.removeAttribute("k");

---------------------------------------------------
This is SendResirect using Cookies.

Java Servlet

Add:
Cookie cookie = res.getCookies("k",k+"");
res.addCookie(cookie);
res.sendRedirect("sq");
Sq:
int k=0;
Cookie cookies[] = req.getCookies();
for(Cookie c:cookies){
if(c.getName().equals("k")){
k=c.getValue();
}}
PrintWriter out = res.getWriter();
out.println("The square using cookies is "+k*k);
---------------------------------------------------              