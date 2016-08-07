<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Doctor</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@ include file="/WEB-INF/cms/common/taglib.jsp"%>
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
					<li><a href="<%=basePath%>cms/doctor/listView">医生列表</a></li>
					<li class="active"><a href="<%=basePath%>cms/doctor/formView"><c:if test="${tagType == 1 }">修改</c:if><c:if test="${tagType == 0 }">添加</c:if>医生</a></li>
				</ul>
				<form:form id="editForm" modelAttribute="doctorVo" action="${ctx}/cms/doctor/modify" method="post" class="form-horizontal">
					<fieldset>
					<form:hidden path="id" />
					<div class="form-group">
						<label class="control-label col-sm-2">医生姓名</label>
						<div class="col-sm-5">
							<form:input path="username" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">英文姓名</label>
						<div class="col-sm-5">
							<form:input path="englishname" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">联系方式</label>
						<div class="col-sm-5">
							<form:input path="telphone" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">所在医院:</label>
						<div class="col-sm-5">
							<form:input path="hospital" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">科室</label>
						<div class="col-sm-5">
							<%-- <form:input path="department_id" htmlEscape="false" maxlength="50" class="form-control" /> --%>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">职务:</label>
						<div class="col-sm-5">
							<form:input path="role" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">评分:</label>
						<div class="col-sm-5">
							<form:input path="score" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">价格:</label>
						<div class="col-sm-5">
							<form:input path="price" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">擅长:</label>
						<div class="col-sm-5">
							<form:input path="advantage" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">个人介绍:</label>
						<div class="col-sm-5">
							<form:input path="brief" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">教育背景:</label>
						<div class="col-sm-5">
							<form:input path="background" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">个人荣誉:</label>
						<div class="col-sm-5">
							<form:input path="achievement" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">从医经历:</label>
						<div class="col-sm-5">
							<form:input path="workingexp" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">是否有个人诊所</label>
						<div class="col-sm-5">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">个人诊所信息</label>
						<div class="col-sm-5">
							<form:input path="personalclinicinfo" htmlEscape="false" maxlength="50" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10s">
							<input type="submit" class="btn btn-primary" type="button" value="保 存">
							<input id="btnCancel" class="btn" type="button" value="取消" onclick="history.go(-1)" />
						</div>
					</div>
					</fieldset>
				</form:form>
			</div>

		</div>

	</div>
</body>
</html>