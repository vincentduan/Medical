<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Document Form</title>
</head>
<body>
<h3>添加文章</h3>
<form:form id="inputForm" modelAttribute="document" action="/medical/doc/save.do" method="post" class="form-horizontal">
<div class="control-group">
			<label class="control-label">文章标题:</label>
			<div class="controls">
				<form:input path="title" htmlEscape="false" maxlength="50"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">所属栏目:</label>
			<div class="controls">
				<form:select path="category.id" class="input-medium">
					<form:options items="${catelist}" itemLabel="title" itemValue="id" htmlEscape="false"/>
				</form:select>
			</div>
		</div>
		<form:textarea id="content" htmlEscape="true" path="content" rows="30" maxlength="2000" style="width:800px"/>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
</form:form>
</body>
</html>