<%@page import="simpleboard.data.AnswerBoardDao"%>
<%@page import="simpleboard.data.AnswerBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글 엔코딩
	request.setCharacterEncoding("utf-8");
	//answerdto 선언
	AnswerBoardDto dto=new AnswerBoardDto();
	//dao 선언
	AnswerBoardDao dao=new AnswerBoardDao();
	//데이타 읽어서 dto 에 담기
	String num=request.getParameter("num");
	String nickname=request.getParameter("nickname");
	String content=request.getParameter("content");
	
	dto.setNum(num);
	dto.setNickname(nickname);
	dto.setContent(content);
	
	//insert 메서드 호출
	dao.insertAnswer(dto);
	
	//content 로 이동(num 를 필요로 한다)
	response.sendRedirect("content.jsp?num="+num);	
%>