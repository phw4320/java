<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">	
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bt-337/dist/css/bootstrap.css">
<link rel="stylesheet" href="/css/bt-337/dist/css/bootstrap-theme.css">
</head>
<body>
<div class="container">

	<table class = "table">
	
		<tr>
			
			<th>이름</th>
			<th>나이</th>
		
		</tr>
		<tbody id="tData"></tbody>
	</table>

</div>

<script>
	var list = [];
	//var list = new Array(); 
	var map = {};
	//var map = new Map();
	map['name'] = '홍길동';
	map['age'] = 33;
	list.push(map);
	map = {};
	map['name'] = '김길동';
	map['age'] = 23;
	list.push(map);
	console.log(list);
	
	var tDataObj = document.querySelector('#tData');
	var html = '';
	for (var i=0; i<list.length; i++) {
		html += '<tr>';
		html += '<td>' + list[i].name + '</td>';
		html += '<td>' + list[i].age + '</td>';
		html += '</tr>';
	}
	tDataObj.innerHTML = html;
	
</script>
</body>
</html>