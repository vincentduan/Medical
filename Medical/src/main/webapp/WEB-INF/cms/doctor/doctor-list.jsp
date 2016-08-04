<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Doctor</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@ include file="/WEB-INF/cms/common/taglib.jsp"%>
<script type="text/javascript">
	console.log()
</script>
</head>
<body>
	<div class="container">
		<h2>后台运营系统</h2>
		<hr>
		<br>
		<div class="row">
			<div class="col-md-2">
				<ul class="nav nav-pills nav-stacked">
					<li class="active"><a href="<%=basePath%>cms/doctor/listView">医生管理</a></li>
					<li><a href="<%=basePath%>index/contrast">文章管理</a></li>
				</ul>
			</div>
			<div class="col-md-10">
				<ul class="nav nav-tabs">
					<li class="active"><a href="<%=basePath%>cms/doctor/listView">医生列表</a></li>
					<li><a href="<%=basePath%>cms/doctor/formView">添加医生</a></li>
				</ul>
				<%-- <form:form id="searchForm"action="<%=basePath %>cms/doctor/view" method="post" class="breadcrumb form-search">
					<div style="margin-top: 8px;">
						<label>项目名称：</label>
						<input id="btnSubmit" class="btn btn-primary btn-query" type="submit" value="查询" />
						<a href="javascript:void(0);" data-toggle="modal" onclick="checkFlag();return false" class="btn btn-primary" style="float: right; margin-right: 10px;">上传项目</a>
						<a href="<%=basePath%>/projects/project/downloadfile.do" target="_blank" class="btn btn-link" style="float: right; margin-right: 10px;">下载模板</a>
					</div>
				</form:form> --%>
				<form>
					<div style="margin-top: 8px;">
						<label>医生姓名：</label>
						<input id="btnSubmit" class="btn btn-primary btn-query" type="submit" value="查询" />
					</div>
				</form>
			</div>

		</div>

	</div>
</body>
</html>