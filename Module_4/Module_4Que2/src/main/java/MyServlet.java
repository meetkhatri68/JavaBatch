import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet extends HttpServlet 
{
  
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    
    response.setContentType("text/html");   
    PrintWriter out = response.getWriter();
    
    ServletContext cont = getServletContext();
    String name = cont.getInitParameter("name");
    String phone = cont.getInitParameter("phone");
    out.println("My Name is: " + name);
    out.println("My Phone is " + phone);
    
  }
}
