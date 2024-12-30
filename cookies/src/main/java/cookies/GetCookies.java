package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getCookies")
public class GetCookies  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out  = resp.getWriter();
		Cookie arr[] = req.getCookies();//c1  c2
		
		for(Cookie c : arr) {
			out.print("<h1>" + c.getName() + " : "+ c.getValue() + " </h1>"); 
		}
		
		
	}

}
