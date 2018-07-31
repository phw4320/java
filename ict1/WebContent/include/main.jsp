<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{padding:0;
		margin:0;
	}
	.container{
		width:800px;
		margin:0 auto;
		float:left;
	}
	.left{
		width:300px;
		border: 1px solid blue;	
		float:left;
	}
	.right{
		width:300px;
		border: 1px solid red;	
		float:right;
	}
</style>
</head>
<body>
<div class ="container">
	<div class="left">
		<jsp:include page="/include/left.jsp"></jsp:include>
	</div>
	<div class="right">
		<jsp:include page="/include/right.jsp"></jsp:include>
	</div>
</div>
</body>
</html>