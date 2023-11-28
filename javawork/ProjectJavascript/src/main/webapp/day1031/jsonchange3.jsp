<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name1="김재형";
	String addr1="판교";
	String name2="손흥민";
	String addr2="강남";
	String name3="김민재";
	String addr3="전주";
	
	JSONObject ob1 = new JSONObject();
	ob1.put("name",name1);
	ob1.put("addr",addr1);
	
	JSONObject ob2 = new JSONObject();
	ob2.put("name",name2);
	ob2.put("addr",addr2);
	
	JSONObject ob3 = new JSONObject();
	ob3.put("name",name3);
	ob3.put("addr",addr3);
	
	JSONArray arr = new JSONArray();
	arr.add(ob1);
	arr.add(ob2);
	arr.add(ob3);
%>
<%=arr.toString()%>