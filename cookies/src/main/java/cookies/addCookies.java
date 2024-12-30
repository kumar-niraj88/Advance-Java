package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addCookies")
public class addCookies  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie c1 = new Cookie("email" ,"niraj@gamil.com");
		Cookie c2 = new Cookie("passwords", "12345");
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		c1.setMaxAge(60*60);
		
		PrintWriter out = resp.getWriter();
		out.print("<h1>Cookie added</h1>");
	}
	
	

}
