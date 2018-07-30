<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!//선언부 메서드 멤벼변수 선언가능 단, 실행은 안됨.
	public PrintWriter out1;

	public void test() {
		out1.println("hello");
	}%>

<%
	out1 = response.getWriter();
	test();
	
%>