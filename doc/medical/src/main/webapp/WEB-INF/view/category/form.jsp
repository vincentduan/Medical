<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<p>添加到：${category.title }</p>
<form action="/medical/category/save.do" method="post">
	名称:<input type="text" name="title"></input>
	描述:<input type="text" name="intro"></input>
	<input type="hidden" name="level" value=${category.level+1}>
	<input type="hidden" name="pid" value=${category.id}>
	<input type="submit">
</form>
</body>
</html>