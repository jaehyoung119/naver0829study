

 <%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<form action="./process3" method="post">
		이름 : <input type="text" name="name"><br>
		사진 :
		<select name="photo">
			<option>최애기사7.jpg</option>
			<option>최애기사6.jpg</option>
			<option>최애기사5.jpg</option>
		</select>
		<br>
		랭크 : <input type="text" name="rank"><br>
		나이 : <input type="text" name="age"><br>
		색상 : <input type="color" value="#ccffcc" name="color"><br>
		날짜 : <input tpye="date" name="today" value="2023-12-25"><br>
		<button type="submit">전송#3</button>
	</form>

</body>
</html>
