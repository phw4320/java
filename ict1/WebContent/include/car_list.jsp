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
	CarService cs = CarService.getCarService();
	String searchStr = request.getParameter("searchStr");
	List<Map<String, String>> cList = cs.getCarList(searchStr);
	%>
<%!private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String id = "ictu";
	private static String pwd = "12345678";
	private static String driver = "oracle.jdbc.driver.OracleDriver";
%>

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
	<form action="" method="get">
		차종류 : <input type="text" name="searchStr">
		<button>검색</button>
	</form>
	<div class="container">

		<table class="table">
			<thead>
				<tr>
					<th>자동차 종류</th>
					<th>가격</th>
					<th>회사명</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (Map<String, String> car : cList) {
				%>
				<tr>
					<td><a href="#"><%=car.get("name")%></a></td>
					<td><%=car.get("price")%></td>
					<td><%=car.get("vender")%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>

	</div>
</body>
</html>