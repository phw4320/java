<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<form action="login_ok.jsp" onsubmit="return signUp()">		<!-- 서브밋은 반드시 폼태그 안에 있어야 함 -->
	<fieldset>
	<legend>로그인</legend>
	아이디 : <input type="text" id="id" name="id" required>
	비밀번호 : <input type="password" id="pwd" name="pwd" required>
	<button type ="submit">로그인</button>
	</fieldset>

</form>
<script>

	function signUp(){
		var idObj = document.querySelector('#id');
		var pwdObj = document.querySelector('#pwd');
		
		if (idObj.value.trim().length < 3) {
			alert('아이디는 3글자 이상이어야 합니다.');
			idObj.value = '';
			idObj.focus();
			return false;
		}
		
		if (pwdObj.value.trim().length < 4) {
			alert('패스워드는 4글자 이상이어야 합니다.');
			pwdObj.value = '';
			pwdObj.focus();
			return false;
		}
		return true;
	}
</script>
</body>
</html>