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
					<li><a href="<%=basePath%>cms/doctor/add">添加医生</a></li>
				</ul>
				<form:form id="searchForm" modelAttribute="doctor" action="${ctx}/cms/doctor/listView" method="get" class="breadcrumb form-search form-inline">
						<div style="margin-top: 8px;">
							<label>医生姓名：</label>
							<form:input path="username" htmlEscape="false" maxlength="50" class="input-small form-control" />
							<input id="btnSubmit" class="btn btn-primary btn-query" type="submit" value="查询" />
						</div>
				</form:form>
				<table id="contentTable" class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>医生姓名</th>
							<th>联系方式</th>
							<th>所在医院</th>
							<th>科室</th>
							<th>职务</th>
							<th>用户评分</th>
							<th>&nbsp;&nbsp;&nbsp;&nbsp;操&nbsp;&nbsp;作&nbsp;&nbsp;&nbsp;&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${doctorVos}" var="doctorVo">
							<tr>
								<td>${doctorVo.username }</td>
								<td>${doctorVo.telphone }</td>
								<td>${doctorVo.hospital }</td>
								<td>${doctorVo.departmentInfo.name }</td>
								<td>${doctorVo.role }</td>
								<td>${doctorVo.score }</td>
								<td><a href="${ctx}/cms/doctor/formView?id=${doctorVo.id }">详情&nbsp;&nbsp;</a><a href="${ctx}/cms/doctor/formView?id=${doctorVo.id }">修改&nbsp;&nbsp;</a><a href="${ctx}/cms/doctor/delete?id=${doctorVo.id }">删除&nbsp;&nbsp;</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>