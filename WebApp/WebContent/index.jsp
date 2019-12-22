<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<li><a href="/WebApp/AServlet">servlet 生命周期 配置</a></li>
<li>111</li>
<li>111</li>
<li>111</li>
</ul>
	<h1>JSP 学习</h1>
	<h4>JSP 语法</h4>
	<p>脚本：</p>
	<%
		out.println("ip:" + request.getRemoteHost() + request.getRemotePort() + request.getRemoteAddr());
	%>
	<jsp:scriptlet>out.println("脚本");</jsp:scriptlet>
	<br>
	<p>声明：</p>
	<%!
	int a = 10;
	String b = "我是声明";
	Date date = new Date();
	%>
	<%
	out.println(b + a);
	%>
	<p>表达式：</p>
	<p>今天是：<%= date.toLocaleString() %></p>
	<p>注释：</p>
	<%-- 我是注释 不能被看见 --%>
	<!-- 我是注释 能被看见  -->
	<p>页面跳转：</p>
	<%-- <jsp:forward page="test.jsp">
	<jsp:param value="ly" name="name"/>
	</jsp:forward> --%>
	
</body>
</html>









