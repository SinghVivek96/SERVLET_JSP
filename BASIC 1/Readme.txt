This is the basic layout of a servlet.

Important things to note.

AddServlet.java

1. The class will act as a servlet if exteded with HttpServlet.
2. We have used service method for creating HttpServletRequest and HttpServletResponse.
3. To get the parameter from index.html we are using req(request).getParameter("<name of the parameter>").
4. The structure to print out the output.
5. All the library imported.
6. Instead of service() we can use doPost() and doGet() which      will make sure that there is not effect even though thr form    method is changed at client side.(Adds security)
7. To implement the above two methods make sure the form is of    the appropriate type.
8. If condition 7 is not met then submitting the form will    result in an error.

web.xml

1. The basic strucure will include servlet and servelt-mapping tags.
2. In servlet tag we will have servlet-name and servlet-class    tags.
   The name can be anything but make sure its logical and the       class will contain the full path(com.vivek.AddServlet)
3. In servlet-mapping tag we will have servlet-name and url-        pattern tags.
   servlet-name will be the logical name we will be providing       url-pattern for.
   url-patter ofcourse will be the path.(In our case its add).

Index.html

1. Has the basic DOM structure with a form in it containing two    number type input tags and a sumit button.
   The form is of post type.
2. If the form is of get type, then after submitting the form we    will be able to see the values in the address bar.
   If we want to include privacy aspect then better is to use       form type as post.