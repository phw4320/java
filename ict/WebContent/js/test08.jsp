<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 골뱅이 없는 부분은 자바코드가 다 먹힌다. 메소드 빼고는 다 쓸수 있음
	//localhost/js/test08.jsp?id=nana&pwd=1234	// 물음표 기준 왼쪽 요청주소 오른쪽 보내려는 값
	String str = "123";
	str = request.getParameter("id"); // jsp가 제공해주는것 request name이 id인것을 가져옴
	str += "," + request.getParameter("pwd"); //name이 pwd인것을 가져옴.
	out.println(str);
%>

<!--jsp파일을 서버에 호출했을때 순서 = jsp -> java -> class -> excute -->
<%-- <%
	out.write("<html></html>");
%>

<html> ㅋㅋㅋ </html>

//결국 이건 html문장을 작성하여 실행하는것이 아닌 글자로 띄워주는 역할을 한다. --%>

