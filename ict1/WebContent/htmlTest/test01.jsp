<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<style>
	p {
		font-family:"Times Noew Roman", Times, serif;
		font-size : 20px;
	}
	
	body {
		font-size : 30px;
	}
	
	h1 {
		background-color : red;
		font-size : 2.0em;
	}
	
	p.hi { 
		color : red;
		font-size : medium;
	}
	div.rdiv p{
		color : yellow;
		font-size : large;
		text-shadow: 3px 6px 10px #000;
	}
	#p{
 		width : 10em;
		border : 1px solid blue;
		word-wrap:break-word;
	}
	
</style>
</head>
<body>
	<p>나는 테스트 글자입니다.</p>
	이것은 글씨체 비교 글자입니다
	<h1>나는 부모크기의 두배</h1>
	<p class="hi"> 클래스에 스타일주기 </p>
	<div class = "rdiv">
		<p> 호호히히 </p>
		<h2> 후후하하</h2>
	</div>
		<p id ="p"> 호호히히호호히히호호히히호호히히호호히히호호히히호호히히호호히히히호호히히호호히히호호히히호호히히호호히히호호히히 </p>

</body>
</html>