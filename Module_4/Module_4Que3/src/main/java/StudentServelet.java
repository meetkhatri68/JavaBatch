

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServelet")
public class StudentServelet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
			String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");
	        
	        System.out.println("First Name: " + fname);
	        System.out.println("Last Name: " + lname);
	        System.out.println("Email: " + email);
	        System.out.println("Mobile: " + mobile);
	        System.out.println("Gender: " + gender);
	        System.out.println("Password: " + password);
	        
//	        resp.setContentType("text/html");
//	        PrintWriter out = resp.getWriter();
//	        out.println("<html><head><title>Student Servlet</title></head><body>");
//	        out.println("<h1>Student Information Submitted</h1>");
//	        out.println("<p>Thank you for filling the form. Your data has been printed in the console.</p>");
//	        out.println("</body></html>");
//	        out.close();
	}
}
