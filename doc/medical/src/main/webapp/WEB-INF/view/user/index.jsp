<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Users</title>
</head>
<body>
<table>
<tr>
	<th>名字</th>
	<th>手机号</th>
	<th>是否为会员</th>
	<th>账户余额</th>
</tr>
<c:forEach items="${userlist}" var="item" varStatus="status">
<tr>
	<td>${item.name}</td>
	<td>${item.phone}</td>
	<c:if test="${item.is_vip==0 }"><td>否</td></c:if>
	<c:if test="${item.is_vip==1 }"><td>是</td></c:if>
	<td>${item.account_m}</td>
</tr>
</c:forEach>
</table>
</body>
</html>