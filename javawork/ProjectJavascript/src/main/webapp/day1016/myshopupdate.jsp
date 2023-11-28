<%@page import="myshop.data.MyShopDto"%>
<%@page import="myshop.data.MyShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
	//한글 엔코딩
	request.setCharacterEncoding("utf-8");

	//dao,dto 선언
	MyShopDao dao=new MyShopDao();
	MyShopDto dto=new MyShopDto();
	
	//num포함 모든 데이타 읽기
	int num = Integer.parseInt(request.getParameter("num"));
	String sangpum=request.getParameter("sangpum");
	String color=request.getParameter("color");
	String photo=request.getParameter("photo");
	int price=Integer.parseInt(request.getParameter("price"));
	
	//dto에 담기
	dto.setNum(num);
	dto.setSangpum(sangpum);
	dto.setColor(color);
	dto.setPhoto(photo);
	dto.setPrice(price);
	
	//updateShop 메서드 호출
	dao.updateShop(dto);
	
	//myshopdetail.jsp 로 이동하기(?로 num 넘겨야함)
	response.sendRedirect("myshopdetail.jsp?num=" + num);

	
%>
</body>
</html>