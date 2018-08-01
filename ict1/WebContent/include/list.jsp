<%@page import="com.ict.test.DepartService"%>
<%@page import="com.ict.test.UserService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%

	UserService us = UserService.getUserService();
	String searchStr = request.getParameter("searchStr");
	List<HashMap<String,String>> usList = us.getUserList(searchStr);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bt-337/dist/css/bootstrap.css">
<link rel="stylesheet" href="/css/bt-337/dist/css/bootstrap-theme.css">
<style>
	thead>tr>th {
	text-align : center;
	}
	
	tbody td {
	text-align : center;
	}
	
</style>
</head>
<body>
<form action="" method="get">
	부서명 : <input type="text" name = "searchStr">
	<button onclick="test()">검색</button>
</form>
	<div class="container">
		<table class = "table table-hover">
			<thead>
				<tr>
					<th>부서명</th>
					<th>부서코드</th>
					<th>부서인원</th>
				</tr>
			</thead>

			<tbody>

				<%
					for (int i=0; i<usList.size(); i++) {
	
				%>
				<tr>
					<td><a href="#"><%=usList.get(i).get("name")%></a></td>
					<td><%=usList.get(i).get("id")%></td>
					<td><%=usList.get(i).get("age")%></td>
				</tr>
				<%
					}
				
				%>
				
			</tbody>
		</table>
	</div>
</body>
</html>