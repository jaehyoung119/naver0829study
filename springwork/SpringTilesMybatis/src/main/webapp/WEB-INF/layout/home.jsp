<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

.gallery {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	padding: 0;
	margin: 0;
	list-style: none;
	margin-left:80px;
}

.gallery li {
	flex: 0 0 48%; /* flex-basis를 48%로 설정하여 한 줄에 두 개의 아이템이 들어가게 합니다. */
	margin-bottom: 20px; /* 아래쪽 여백을 줍니다. */
	background-color: #f3f3f3; /* 액자 배경색 */
	border: 1px solid #ddd; /* 액자 테두리 */
	padding: 10px; /* 액자 안쪽 여백 */
}

.gallery img {
	width: 100%; /* 이미지를 액자 크기에 맞게 조절합니다. */
	height: auto;
	display: block;
}

@media ( max-width : 600px) {
	.gallery li {
		flex: 0 0 100%;
	}
}
</style>
</head>
<body>
<ul class="gallery">
  <li><img src="./res/photo/하건.jpg" alt="이미지 1"></li>
  <li><img src="./res/photo/하건3.jpg" alt="이미지 2"></li>
  <li><img src="./res/photo/하건2.jpg" alt="이미지 3"></li>
  <li><img src="./res/photo/배경이밎.jpg" alt="이미지 4"></li>
</ul>

</body>
</html>
