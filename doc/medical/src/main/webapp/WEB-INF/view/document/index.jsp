<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Document Index</title>
</head>
<body>
<h3>文章列表</h3>
<table>
<tr>
	<th>序号</th>
	<th>标题</th>
	<th>所属栏目</th>
</tr>
<c:forEach items="${doclist}" var="item" varStatus="status">
<tr>
	<td>${status.count }</td>
	<td><a href="/medical/doc/content.do?id=${item.id}">${item.title}</td>
	<td>${item.category.title }</td>
</tr>
</c:forEach>
<tr><td><a href="/medical/doc/form.do">添加</a></td></tr>
</table>
</body>
</html>