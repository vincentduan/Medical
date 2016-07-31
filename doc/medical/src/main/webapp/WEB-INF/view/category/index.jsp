<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<title>Index</title>
</head>
<body>
<h3>Category List</h3>
<p>当前目录级别： <c:if test="${pid==0}">主目录</c:if><c:if test="${pid!=0}">${category.title}</c:if>  </p>
<table>
<c:forEach items="${catelist}" var="item" varStatus="status">
<tr>
	<td>${status.count }</td>
	<td><a href="/medical/category/index.do?id=${item.id}">${item.title}</td>
	<td>---${item.intro }</td>
</tr>
</c:forEach>
<tr><td><a href="/medical/category/form.do?pid=${pid}">添加</a></td></tr>
<c:if test="${pid!=0}"><tr><td><a href="/medical/category/index.do?id=${category.pid}">返回上一级</a></td></tr></c:if>
</table>
</body>
</html>