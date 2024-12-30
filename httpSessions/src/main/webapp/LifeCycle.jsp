<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Welcome to JSP file</h1>
 
 <%! public void jspInit(){
	 System.out.println("hi this is init method");
     }
	 %>
	 
	 <%
	 System.out.println("hi this is service method");
	 %>
	 
	 <%!
	 public void jspDestroy(){
		 System.out.println("hi this is destroy method"); 
	 }
	 %>
 
</body>
</html>