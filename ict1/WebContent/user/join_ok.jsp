<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String chPwd = request.getParameter("chPwd");
String email = request.getParameter("mail");
String age = request.getParameter("age");
String name = request.getParameter("name");
String etc = request.getParameter("etc");
out.println("입력한 아이디 : "+ id);
out.println("<br>입력한 비밀번호 : "+ pwd);
out.println("<br>비밀번호 확인 : "+ chPwd);
out.println("<br>입력한 이메일 : "+ email);
out.println("<br>입력한 나이 : "+ age);
out.println("<br>입력한 이름 : "+ name);
out.println("<br>입력한 비고 : "+ etc);
%>
</body>
</html>