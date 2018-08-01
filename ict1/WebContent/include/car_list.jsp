<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.ict.test.CarService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	CarService cs = CarService.getCarService();
	String searchStr = request.getParameter("searchStr");
	List<Map<String, String>> csList = cs.getCarList(searchStr);
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
	차종류 : <input type="text" name = "searchStr">
	<button>검색</button>
</form>
	<div class="container">

		<table class="table table-border table-hover">
			<thead>
				<tr>
					<th>자동차 종류</th>
					<th>가격</th>
					<th>회사명</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i=0; i<csList.size(); i++) {
				%>
					<tr>
					<td><a href="#"><%=csList.get(i).get("carName")%></a></td>
					<td><%=csList.get(i).get("carPrice")%></td>
					<td><%=csList.get(i).get("carCompany")%></td>
					</tr> 
				<%
					}
				%>
			</tbody>
		</table>
		
	</div>
</body>
</html>