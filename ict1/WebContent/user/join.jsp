<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	
	*{
		color:orange
	}
	.test1{
		color:blue 
	}
	
	.test2 {
		color:green
	}
		#test3, #test4 {
		color:red
	}
	
	button {
		color:white
	}
</style>
</head>
<body>
	<!-- 
== 회원가입 ==

id : 5글자 이상
pwd : 5글자 이상
pwd check : pwd와 동일해야함.
email : email주소
age : 0~130살까지
name : 이름 2글자 이상 10글자 이하
etc : 비고 100글자 이하
 -->

	<form action="join_ok.jsp" onsubmit = "return sighUp()">	 <!-- 결과값에 따라 전송할것이냐 말것이냐 -->
		<table border="1">
			<tr>
				<th colspan="2" align="center">회원가입</th>
			</tr>

			<tr>
				<th><label for="id" class="test1">ID</label></th>
				<td><input type="text" id="id" name="id" required></td>
			</tr>
			
			<tr>
				<th><label for="pwd" class="test2">PWD</label></th>
				<td><input type="password" id="pwd" name="pwd" required></td>
			</tr>
			
			<tr>
				<th><label for="chPwd">PWD CHECK</label></th>
				<td><input type="password" id="chPwd" name="chPwd" required></td>
			</tr>
			
			<tr>
				<th><label for="mail">E-MAIL</label></th>
				<td><input type="email" id="mail" name="mail" ></td>
			</tr>
			
			<tr>
				<th><label for="age">AGE</label></th>
				<td><input type="number" id="age" name="age" min="0" max="130"></td>
			</tr>
			
			<tr>
				<th><label for="name" id ="test3">NAME</label></th>
				<td><input type="text" id="name" name="name" required></td>
			</tr>
			
			<tr>
				<th><label for="etc" id="test4">ETC</label></th>
				
				<td><textarea name="etc" id="etc" required maxlength="10" ></textarea></td>
			</tr>
			<tr>
				<th><button type = "Button" onclick="signUp()">회원가입</button></th>
				<td align="center"> <input type = "submit" value = "보내기"> </td>
			</tr>
		</table>
	</form>

	<script>
	function signUp() {
		var idObj = document.querySelector('#id');	
		var pwdObj = document.querySelector('#pwd');
		var chPwdObj = document.querySelector('#chPwd');
		var nameObj = document.querySelector('#name');
		var ageObj = document.querySelector('#age');

		var a = parseInt(ageObj.value);
		
		if (idObj.value.trim().length < 5) { 
			alert("아이디는 5글자 이상이어야 합니다.");
			idObj.value = "";
			idObj.focus();
			return false;
		} 
		if (pwdObj.value.trim().length < 6) {
			alert("비밀번호는 6글자 이상이어야 합니다.");
			pwdObj.value = "";
			pwdObj.focus();
			return false;
		}
		
		if (pwdObj.value != chPwdObj.value) {
			alert("비밀번호가 서로 다릅니다. 다시 입력해주세요.");
			pwdObj.value = "";
			chPwdObj.value = "";
			pwdObj.focus();
			return false;
		}
		
		if (nameObj.value.trim().length==0) {
			alert("이름은 빈 문자를 사용할 수 없습니다");
			nameObj.value = "";
			nameObj.focus();
			return false;
		}
		if (a >= 130 || a < 0) {
			alert("0~130의 나이중 올바른 나이를 다시 입력하세요");
			ageObj.value = "";
			ageObj.focus();
			return false;
		} 
		alert("회원가입 완료");
		return true;
	}
	
	</script>
</body>
</html>