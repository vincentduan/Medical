<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
<script type="text/javascript">
	function submitForm(){
		$("#formAdd").submit();
	}
</script>
</head>
<body>
sdfsdfsd
<form id="formAdd" action="<%=basePath%>cms/doctor/modify" method="post"><input type="text" name="username">
<button type="button" class="bk-margin-5 btn btn-default" onclick="submitForm()">添加医生</button>
</form>
</body>
</html>