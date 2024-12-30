package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class StaticServlet extends  GenericServlet{
	@Override
	public void service(ServletRequest Req , ServletResponse Res) throws IOException {
		 
		String html = "<html> <body> <h1> Welcome to static servert</h1></body> </html>";
		PrintWriter out = Res.getWriter();
		out.println(html);
	}
}
