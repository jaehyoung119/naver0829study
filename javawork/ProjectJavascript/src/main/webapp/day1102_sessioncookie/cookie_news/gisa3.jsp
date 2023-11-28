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
	Cookie[] cookies = request.getCookies();
	boolean find = false;
	if (cookies != null) {
		for (Cookie ck : cookies) {
			//저장된 쿠키 이름을 얻기
			String name = ck.getName();
			if (name.equals("loginok")) {
				find = true; //해당 쿠키가 존재하면 true
			}
		}
	}
%>
<body>
	<%
	if (!find) {
	%>
	<script type="text/javascript">
		alert("먼저 로그인을 해주세요")
		histroy.back();
	</script>
	<%
	} else {
	%>
	<pre width="400px;">
	(엑스포츠뉴스 나승우 기자) 에릭 턴하흐 감독이 맨체스터 유나이티드에서 곧 경질될 수도 있다는 전망이 나왔다.
	맨유는 2일(한국시간) 영국 맨체스터에 위치한 올드 트래퍼드에서 열린 뉴캐슬 유나이티드와의 
	2023/24시즌 EFL컵 16강전에서 미겔 알미론, 루이스 홀, 조 윌록에게 연속 실점해 0-3으로 패했다. 
	지난 시즌 대회 우승을 차지했던 맨유는 이번 시즌에는 16강에서 일찌감치 탈락하며 최근 부진을 떨쳐내지 못했다.
	<br>
	<br>
	<a href="loginmain.jsp">메인페이지로 이동</a>
	<%
	}
	%>

</body>
</html>