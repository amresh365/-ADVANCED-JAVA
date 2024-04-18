<% %>@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HELLO JSP</title>
<style type="text/css">
h1{
   background-color: black;}</style>
</head>
		<body>
			<h1>Hello JSP</h1>
			<br/>
			<%= 25*4 %>
			<%=new java.util.Date() %>
			<br/>
			<br/>
			<%
			for(int i=0;i<10;i++)
			{ out.print("<br/>");
				out.println(i);
			}
			%>
			<br/>
		</body>
</html>