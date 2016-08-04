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
					<li class="active"><a href="<%=basePath%>cms/doctor/formView">添加医生</a></li>
				</ul>
				<form:form id="editForm" modelAttribute="project"
					action="${ctx}/projects/project/modify.do" method="post"
					class="form-horizontal">
					<form:hidden path="id" />
					<div class="control-group">
						<label class="control-label">项目名称:</label>
						<div class="controls">
							<form:input path="projectname" htmlEscape="false" maxlength="50"
								class="required" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目摘要:</label>
						<div class="controls">
							<form:input path="projectbrief" htmlEscape="false" maxlength="50"
								class="required" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目状态:</label>
						<div class="controls">
							<form:select path="projectstatus" name="projectstatus">
								<form:option value="0" label="发布" />
								<form:option value="1" label="众筹" />
								<form:option value="2" label="验收" />
								<form:option value="3" label="完成" />
							</form:select>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目LOGO:</label>
						<div class="controls" style="width: 50%">
							<form:hidden path="projectlogo" />
							<input name="fileupload" type="file" class="file projectlogo">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">封面图:</label>
						<div class="controls" style="width: 50%">
							<form:hidden path="coverimage" />
							<input name="fileupload" type="file" class="file coverimage">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目发布时间:</label>
						<div class="controls">
							<%-- <form:input path="starttime" readonly="readonly" htmlEscape="false" maxlength="50" class="required times" /> --%>
							<input type="text" readonly id="starttime" name="starttime"
								maxlength="50" class="required times"
								placeholder="<fmt:formatDate value='${project.starttime }' pattern='yyyy-MM-dd'/>" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目众筹时间:</label>
						<div class="controls">
							<input type="text" readonly id="crowdtime" name="crowdtime"
								maxlength="50" class="required times"
								placeholder="<fmt:formatDate value='${project.crowdtime }' pattern='yyyy-MM-dd'/>" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目验收时间:</label>
						<div class="controls">
							<input type="text" readonly id="examinetime" name="examinetime"
								maxlength="50" class="required times"
								placeholder="<fmt:formatDate value='${project.examinetime }' pattern='yyyy-MM-dd'/>" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目结束时间:</label>
						<div class="controls">
							<input type="text" readonly id="endtime" name="endtime"
								maxlength="50" class="required times"
								placeholder="<fmt:formatDate value='${project.endtime }' pattern='yyyy-MM-dd'/>" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">是否允许点赞:</label>
						<div class="controls">
							<form:select path="isallowedagree" name="isallowedagree">
								<form:option value="0" label="不允许对本项目点赞" />
								<form:option value="1" label="允许对本项目点赞" />
								<form:option value="2" label="允许对子项目点赞" />
								<form:option value="3" label="同时允许" />
							</form:select>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">省分:</label>
						<div class="controls">
							<form:select path="provid">
								<%-- <c:forEach items="${fns:getProvList()}" var="prov">
									<form:option value="${prov.uvalue }">${prov.ukey }</form:option>
								</c:forEach> --%>
							</form:select>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">项目描述:</label>
						<div class="controls">
							<form:textarea path="projectcontent" id="projectcontent"
								name="projectcontent" style="width: 600px; height: 200px" />
						</div>
					</div>
					<div class="form-actions">
						<input type="submit" class="btn btn-primary" type="button"
							value="保 存"> <input id="btnCancel" class="btn"
							type="button" value="取消" onclick="history.go(-1)" />
					</div>
				</form:form>
			</div>

		</div>

	</div>
</body>
</html>