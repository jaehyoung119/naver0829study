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
   
   .business-card {
    box-sizing: border-box;
    width: 200px; /* 실제 크기에 맞게 조정하세요 */
    padding: 20px;
    background-color: #f3f3f3; /* 연한 회색 배경 */
    border-radius: 8px; /* 모서리를 둥글게 */
    font-family: 'Arial', sans-serif;
    color: #003366; /* 어두운 파란색 텍스트 */
    margin: 0 auto;
    text-align: center;
  }

  .company-name {
    font-size: 24px;
    font-weight: bold;
    margin-bottom: 5px;
  }

  .tagline {
    font-size: 16px;
    color: #0077CC; /* 밝은 파란색 텍스트 */
    margin-bottom: 20px;
  }

  .contact-info {
    display: flex;
    align-items: center;
    justify-content: center;
    gap: 10px;
    margin-bottom: 10px;
  }

  .contact-info img {
    width: 20px; /* 아이콘 크기 */
    height: auto;
  }

  .contact-info span {
    font-size: 18px;
  }
</style>
</head>
<body>
<div class="business-card">
  <div class="company-name">BITCAMP</div>
  <div class="tagline">Connecting Professionals</div>
  <div class="contact-info">
    <span>02-555-6666</span>
  </div>
  <div class="contact-info">
    <span>김재형</span>
  </div>
</div>

</body>
</html>
