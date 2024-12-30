<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>  <!-- Script let tags -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP Page</h1> 
<% Date d = new Date(); %>
<h1>Current Date And Time = <%= d %> </h1>   <!-- Expression tags -> printing -->
<% int i = 10; %>  <!-- acts as local variable -->
<%! int i = 20; %>  <!--  acts as global variable -->

<%= this.i %>
</body>
</html>