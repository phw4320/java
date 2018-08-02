<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="rDiv" style="width:2000px; height:1000px"></div>

	<script type="text/javascript">
		var rdiv = document.querySelector('#rDiv');
		var r,g,b;
		var interval;
		var count = 0;
		 
		function start(){
		    interval = setInterval(function(){
		    	var rdiv = document.querySelector('#rDiv');
				var r = Math.floor(Math.random() * 255);

				var g = Math.floor(Math.random() * 255);

				var b = Math.floor(Math.random() * 255);
				rdiv.style.backgroundColor = 'rgb(' + r + ',' + g + ',' + b + ')';
		        count++;
		        if (count == 1000) stop();
		    },50);
		}
		 
		function stop(){
		    clearInterval(interval);
		}
		 
		start();

		
		function check() {
			var rdiv = document.querySelector('#rDiv');
			var r = Math.floor(Math.random() * 255);

			var g = Math.floor(Math.random() * 255);

			var b = Math.floor(Math.random() * 255);
			rdiv.style.backgroundColor = 'rgb(' + r + ',' + g + ',' + b + ')';
		}

	</script>
</body>
</html>