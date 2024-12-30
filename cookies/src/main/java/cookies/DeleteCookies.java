package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookies")
public class DeleteCookies  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //c1  c2
		Cookie arr[] = req.getCookies();
		
		PrintWriter out  = resp.getWriter();
		
		for(Cookie c : arr) {
			if(c.getName().equals("passwords")) {
				c.setMaxAge(0);
				resp.addCookie(c);
				out.print("<h1> Cookies deleted </h1>");
			}
		}
		
	
	}
	

}
