<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&family=Permanent+Marker&family=Single+Day&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<style>
    body * {
        font-family: 'Jua';
    }
</style>
</head>
<body>
<c:set var="today" value="<%=new Date()%>"/>
<h4>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm"/>
</h4>
<h5>프로젝트의 url 주소 얻기</h5>
<c:set var="pathurl" value="<%=request.getContextPath()%>"/>
<h4>${pathurl}</h4>
<hr>
<fmt:requestEncoding value="utf-8"/>
<form action="result3.jsp" method="post">
	<h5>가고싶은 나라는?</h5>
	<input type="text" name="nara"><br>
	<h5>당신의 나이는?</h5>
	<input type="text" name="age"><br>
	<button type="submit">전송</button>
</form>
<h5>
	입력한값 읽기<br>
	나라 : ${param.nara}<br>
	나이 : ${param.age}<br>
</h5>
<c:if test = "${param.age>=20}">
	<h2 style="color:blue">당신은 성인입니다</h2>
</c:if>
<c:if test = "${param.age<20}">
	<h2 style="color:red">당신은 미성년자입니다</h2>
</c:if>
<hr>
<c:choose>
	<c:when test="${param.nara=='하와이'}">
		<h3 style="color:magenta">하와이의 바다는 아름답다</h3>
	</c:when>
	<c:when test="${param.nara=='스위스'}">
		<h3 style="color:skyblue">스위스 가보고싶다</h3>
	</c:when>
	<c:when test="${param.nara=='노르웨이'}">
		<h3 style="color:plum">노르웨이 스키장이 그렇게 이쁘다던데</h3>
	</c:when>
	<c:otherwise>
		<h3 style="color:pink">${param.nara} 는 어떤 나라인가요?</h3>
	</c:otherwise>
</c:choose>
<hr>
<c:set var="str" value="red,green,blue,gray,orange,pink,magenta"/>
<c:forTokens var="color" items="${str}" delims=",">
	<h2 style="color:${color}">${color }</h2>
</c:forTokens>
</body>
</html>