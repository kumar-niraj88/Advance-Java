package httpSessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		
		String ex_email = "tom@gmail.com";
		String ex_pwd = "12345";
		
		PrintWriter out = resp.getWriter();
		if(email.equals(ex_email)) {
			if(pwd.equals(ex_pwd)) {
				//create session
				HttpSession session = req.getSession(true);
				out.print("<h1> Login Sucessfully!!</h1>");
				out.print("<h1> Session Created!!</h1>");
			}else {
				out.print("<h1> incorrect Password </h1>");
			}
		}else {
			out.print("<h1> Email not found </h1>");
		}
		
	}

}
