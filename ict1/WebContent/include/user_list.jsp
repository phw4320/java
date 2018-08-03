<%@page import="com.ict.test.UserService2"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.ict.test.CarService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	UserService2 us = UserService2.getUserService();
	String searchStr = request.getParameter("searchStr");
	String[] check = request.getParameterValues("check");
	List<Map<String, String>> uList = us.getUserList(searchStr,check);
%>
<%!private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String id = "ictu";
	private static String pwd = "12345678";
	private static String driver = "oracle.jdbc.driver.OracleDriver";%>

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bt-337/dist/css/bootstrap.css">
<link rel="stylesheet" href="/css/bt-337/dist/css/bootstrap-theme.css">
<style>
thead th, td {
	text-align: center;
}

.table td:hover {
	font-weight: bold;
	color: red;
}
</style>
</head>
<body>

	<div class="container">
		<form action="" method="get">
			<input type="checkbox" name="name" value="name" id="name">이름
			<input type="checkbox" name="age" value="age" id="age">나이 <input
				type="checkbox" name="id" value="id" id="id">아이디 :<input
				
				type="text" name="searchStr"
				value="<%=searchStr != null ? searchStr : ""%>">
			<button>검색</button>
		</form>
		<table class="table">
			<thead>
				<tr>
					<th>이름</th>
					<th>아이디</th>
					<th>비밀번호</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (Map<String, String> user : uList) {
				%>
				<tr>
					<td><a href="#"><%=user.get("name")%></a></td>
					<td><%=user.get("id")%></td>
					<td><%=user.get("pwd")%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>

	</div>
</body>
</html>