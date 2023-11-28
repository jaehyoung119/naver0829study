<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name="김 재형";
	int age=22;
	
	StringBuffer sb = new StringBuffer();
	sb.append("{\name\":\""+name+"\"");
	sb.append("\"age\":"+age+"}");
%>
<%=sb.toString()%>