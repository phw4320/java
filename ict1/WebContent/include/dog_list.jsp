<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.ict.test.AnimalService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	AnimalService as = AnimalService.getAnimalService();
	String searchStr = request.getParameter("searchStr");
	List<Map<String, String>> dList = as.getAnimalList(searchStr);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href=/css/bt-337/dist/css/bootstrap.css>
<link rel="stylesheet" href=/css/bt-337/dist/css/bootstrap-theme.css>
<style>
	table {
		text-align:center;
	}
	th {
		text-align:center;
	}
</style>
</head>
<form action="">
	<body>
		���� :
		<input type="text" name="searchStr">
		<button>�˻�</button>
</form>
<div class="container">
		<table class="table table-border table-hover">
		<thead>
			<tr>
				<th>�������̸�</th>
				<th>����</th>
				<th>����</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < dList.size(); i++) {
			%>
			<tr>
				<td><%=dList.get(i).get("name")%></td>
				<td><%=dList.get(i).get("age")%></td>
				<td><%=dList.get(i).get("kinds")%></td>
			</tr>
			<%
				}
			%>

		</tbody>
	</table>

</div>

</body>
</html>