<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String rPath = request.getContextPath() + "/";
System.out.println(rPath);
%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=rPath%>bs3/css/bootstrap.css">
<link rel="stylesheet" href="<%=rPath%>bs3/css/bootstrap-theme.css">
<link rel="stylesheet" href="<%=rPath%>bs3/css/common.css">
<script src="<%=rPath%>bs3/js/jquery-3.3.1.js"></script>
<script src="<%=rPath%>bs3/js/bootstrap.js"></script>
<script src="<%=rPath%>bs3/js/common.js"></script>

</head>