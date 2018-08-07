<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  trimDirectiveWhitespaces = false; jsp로 생성되는 공백줄들을 없애준다.-->
<%
ArrayList<String> al = new ArrayList<String>(); // ctrl + space bar로 임포트쉽게 시킬 수 있다.
	String str = "여기는 form1.jsp";
	out.println(str);
	
	String[] name = request.getParameterValues("name");
	
	out.println("보낸 이름: "+ name[0]);
	out.println("<br>보낸 이름: "+ name[1]);	
%>

<input type="text" value = "<%=str+"aaa"+"ㅋㅋㅋ"%> "> 