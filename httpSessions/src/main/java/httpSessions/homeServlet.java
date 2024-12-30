package httpSessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/home")
public class homeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		PrintWriter out  = resp.getWriter();
		
		
		if(session != null) {
			String html = "<html>" 
					+ "<body>"
					+ "<table border = '2px'>"
					+ "<tr>"
					+      "<th>ID</th>"
					+       "<th>NAME</th>"
					+		"<th>AGE</th>"
					+		"<th>GENDER</th>"
					+ "</tr>"
					+  "<tr>"
					+      "<td>1</td>"
					+       "<td>niraj </td>"
					+		"<td>24 </td>"
					+		"<td>male </td>"
					+ "</tr>"
					+  "<tr>"
					+      "<td>2</td>"
					+       "<td>suraj </td>"
					+		"<td>20 </td>"
					+		"<td>male </td>"
					+ "</tr>"
					+ "</table>"
					+"</body>"
					+"</html>";
			
			out.print(html);
		}else {
			out.print("go and login frist?");
		}
	}

}
