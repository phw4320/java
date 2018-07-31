<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>별명</th>
			<th>나이</th>
		</tr>
		<%
			String[] strs = { "abc", "ddd", "123", "dd", "ㅇㅇ" };
			String[] strs1 = { "fff", "d", "567", "dkk", "ㅗㅗ" };
			String[] strs2 = { "hhh", "dd", "879", "nn", "ㅋㅋ" };

			for (int i = 0; i < strs.length; i++) {
				out.println(i + ". " + strs[i]);
		%>
		<tr>
			<td><%=strs[i]%></td>
			<td><%=strs1[i]%></td>
			<td><%=strs2[i]%></td>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>