<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>main</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
</head>
<body>
<div class="container">
	    <h2>后台运营系统</h2>
	    <hr><br>
		<div class="row">
			<div class="col-md-2">
				<ul class="nav nav-pills nav-stacked">
					<li><a href="<%=basePath%>cms/doctor/listView">医生管理</a></li>
					<li><a href="<%=basePath%>index/contrast">文章管理</a></li>
				</ul>
			</div>
			<div class="col-md-10">
				管理员帮助页面
			</div>

		</div>

	</div>
</body>
</html>