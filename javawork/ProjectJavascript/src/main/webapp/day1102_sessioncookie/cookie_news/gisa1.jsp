<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&family=Permanent+Marker&family=Single+Day&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<style>
body * {
	font-family: 'Jua';
}
</style>
</head>
<%
	Cookie []cookies = request.getCookies();
	boolean find = false;
	if(cookies!=null) {
		for(Cookie ck:cookies) {
			//저장된 쿠키 이름을 얻기
			String name = ck.getName();
			if(name.equals("loginok")) {
				find = true; //해당 쿠키가 존재하면 true
			}
		}
	}
%>
<body>
	<%
	if(!find) {%>
	<script type="text/javascript">
		alert("먼저 로그인을 해주세요")
		histroy.back();
	</script>
	<%} else {%>
	<pre width="400px;">
		바이에른 뮌헨이 이변의 희생양이 됐다. 휴식이 필요했던 대한민국 국가대표 센터백 김민재는 이번에도 선발로 나서야 했다.
		바이에른 뮌헨은 2일 오전 4시 45분(한국시간) 독일 자르브뤼켄에 위치한 루트비히스파르크슈타디온에서 열린 
		DFB 포칼컵 2라운드(32강)에서 자르브뤼켄(3부)에 1-2로 패배했다. 이로써 뮌헨은 두 시즌 연속 포칼에서 조기 탈락했다.
	</pre>
	<br>
	<br>
	<a href="loginmain.jsp">메인페이지로 이동</a>
	<%}
%>
</body>
</html>