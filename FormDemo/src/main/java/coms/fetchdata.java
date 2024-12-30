package coms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class fetchdata extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		String num = req.getParameter("id");
		int id = Integer.parseInt(num);
		PrintWriter out = res.getWriter();
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe_db","root","root");
			
			PreparedStatement ps  = c.prepareStatement("select * from employee where id = ?");
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				double sal = rs.getDouble("sal");
				
				out.println("<h1> Id = "+id1 + "\nName = "+name + "\ngender = "+ gender + "\nsalary = "+ sal + "</h1>" );
				
			}else {
				out.print("<h1> Id not found </h1>");
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	
	
}
