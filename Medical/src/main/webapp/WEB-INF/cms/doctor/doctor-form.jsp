<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CMS</title>

<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@include file="/WEB-INF/cms/common/taglib.jsp"%>
<jsp:include page="/WEB-INF/cms/common/themeHead.jsp"></jsp:include>
<script type="text/javascript" src="<%=basePath%>resources/js/jquery.validate.js"></script>
<script type="text/javascript">
$(function(){
	
});
</script>
<style type="text/css">
.valerror{
color: #a94442;
}
</style>
</head>
<body>
<!-- Start: Header -->
<div class="navbar" role="navigation">
	<div class="container-fluid container-nav">
		<div class="navbar-right" style="font-size:20px;">
			医生后台管理系统
		</div>			
	</div>		
</div>
<!-- End: Header -->
		<div class="copyrights">医生后台管理系统</a></div>
		<!-- Start: Content -->
		<div class="container-fluid content">	
			<div class="row">
			
				<!-- Sidebar -->
				<div class="sidebar">
					<div class="sidebar-collapse">
						<!-- Sidebar Header Logo-->
						<div class="sidebar-header">
							<img src="<%=basePath%>resources/theme/assets/img/logo.png" class="img-responsive" alt="" />
						</div>
						<!-- Sidebar Menu-->
						<div class="sidebar-menu">						
							<nav id="menu" class="nav-main" role="navigation">
								<ul class="nav nav-sidebar">
									<div class="panel-body text-center">								
										<div class="bk-avatar">
											<img src="<%=basePath%>resources/theme/assets/img/avatar.jpg" class="img-circle bk-img-60" alt="" />
										</div>
										<div class="bk-padding-top-10">
											<i class="fa fa-circle text-success"></i> <small>Administrator</small>
										</div>
									</div>
									<div class="divider2"></div>
									<li>
										<a href="page-inbox.html">
											<span class="pull-right label label-primary">165</span>
											<i class="fa fa-envelope" aria-hidden="true"></i><span>Mail</span>
										</a>
									</li>
									<li class="nav-parent active">
										<a>
											<i class="fa fa-list-alt" aria-hidden="true"></i><span>医生管理</span>
										</a>
										<ul class="nav nav-children">
											<li><a href="<%=basePath %>cms/doctor/listView"><span class="text"> 医生列表</span></a></li>
											<li><a href="<%=basePath %>cms/doctor/add"><span class="text"> 添加医生</span></a></li>						
										</ul>
									</li>
									<li class="nav-parent">
										<a>
											<i class="fa fa-file-text" aria-hidden="true"></i><span>文章管理</span>
										</a>
										<ul class="nav nav-children">
											<li><a href="page-activity.html"><span class="text"> 文章列表</span></a></li>
										</ul>
									</li>
								</ul>
							</nav>
						</div>
						<!-- End Sidebar Menu-->
					</div>
					<!-- Sidebar Footer-->
					<div class="sidebar-footer">	
						<ul class="sidebar-terms">
							<li><a href="<%=basePath %>cms/doctor/listView">Terms</a></li>
							<li><a href="<%=basePath %>cms/doctor/listView">Privacy</a></li>
							<li><a href="<%=basePath %>cms/doctor/listView">Help</a></li>
							<li><a href="<%=basePath %>cms/doctor/listView">About</a></li>
						</ul>
						<div class="copyright text-center">
							<small>vincent <i class="fa fa-coffee"></i>医生后台管理系统</small>
						</div>					
					</div>
					<!-- End Sidebar Footer-->
				</div>
				<!-- End Sidebar -->
		
				<!-- Main Page -->
				<div class="main ">
					<!-- Page Header -->
					<div class="page-header">
						<div class="pull-left">
							<ol class="breadcrumb visible-sm visible-md visible-lg">								
								<li><a href="index.html"><i class="icon fa fa-home"></i>Home</a></li>
								<li class="active"><i class="fa fa-list-alt"></i>医生管理</li>
							</ol>						
						</div>
						<div class="pull-right">
							<h2>Doctor</h2>
						</div>					
					</div>
					<!-- End Page Header -->								
					<div class="row">
						<div class="col-md-3">
						</div>
						<div class="col-md-6">
							<div class="panel">
								<div class="panel-heading bk-bg-primary">
									<h6><i class="fa fa-indent red"></i>添加医生信息</h6>							
								</div>
								<div class="panel-body">
									<form id="formAdd" action="<%=basePath%>cms/doctor/modify" method="post" class="form-horizontal">
										<input type="hidden" name="id" value="${doctor.id}">
										<div class="form-group">
											<label class="col-md-3 control-label">医生姓名</label>
											<div class="col-md-9">
												<input type="text" id="username" name="username" class="form-control" value="${doctor.username}" placeholder="Username">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">英文名</label>
											<div class="col-md-9">
												<input type="text" id="englistName" name="englistName" class="form-control" value="${doctor.englishname}" placeholder="Englist Name">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">联系方式</label>
											<div class="col-md-9">
												<input type="text" id="telphone" name="telphone" class="form-control" value="${doctor.telphone}" placeholder="telphone">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">所在医院</label>
											<div class="col-md-9">
												<input type="text" id="hospital" name="hospital" class="form-control" value="${doctor.hospital}" placeholder="hospital">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">科室</label>
											<div class="col-md-9">
												<input type="text" id="department" name="department" class="form-control" value="${doctor.department}" placeholder="department">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">职务</label>
											<div class="col-md-9">
												<input type="text" id="role" name="role" class="form-control" value="${doctor.role}" placeholder="role">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">评分</label>
											<div class="col-md-9">
												<input type="text" id="score" name="score" class="form-control" value="${doctor.score}" placeholder="score">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">价格</label>
											<div class="col-md-9">
												<input type="text" id="price" name="price" class="form-control" value="${doctor.price}" placeholder="price">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">擅长</label>
											<div class="col-md-9">
												<input type="text" id="advantage" name="advantage" class="form-control" value="${doctor.advantage}" placeholder="advantage">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">教育背景</label>
											<div class="col-md-9">
												<input type="text" id="background" name="background" class="form-control" value="${doctor.background}" placeholder="background">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">个人荣誉</label>
											<div class="col-md-9">
												<input type="text" id="achievement" name="achievement" class="form-control" value="${doctor.achievement}" placeholder="achievement">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">从医经历</label>
											<div class="col-md-9">
												<input type="text" id="workingexp" name="workingexp" class="form-control" value="${doctor.workingexp}" placeholder="workingexp">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">是否有个人诊所</label>
											<div class="col-md-9">
												<div class="radio-custom radio-inline">													
													<input type="radio" id="Yes" name="haspersonalclinic" value="1" <c:if test='${doctor.haspersonalclinic == 1 || empty doctor.id }'>checked</c:if>>
													<label for="Yes">Yes</label>
												</div>
												<div class="radio-custom radio-inline">													
													<input type="radio" id="No" name="haspersonalclinic" value="0" <c:if test='${doctor.haspersonalclinic == 0 }'>checked</c:if>> 
													<label for="No">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="text-input">个人诊所信息</label>
											<div class="col-md-9">
												<input type="text" id="personalclinicinfo" name="personalclinicinfo" class="form-control" value="${doctor.personalclinicinfo}" placeholder="personalclinicinfo">
											</div>
										</div>
										<!-- <div class="form-group">
											<label class="col-md-3 control-label" for="email-input">Email Input</label>
											<div class="col-md-9">
												<input type="email" id="email-input" name="email-input" class="form-control" placeholder="Email address">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 control-label" for="password-input">Password</label>
											<div class="col-md-9">
												<input type="password" id="password-input" name="password-input" class="form-control" placeholder="Password">
												<span class="help-block">Please enter a complex password</span>
											</div>
										</div> -->
										<div class="form-group">
											<div class="col-md-5"></div>
											<div class="col-md-7">
												<button  type="submit" class="bk-margin-5 btn btn-default" ><c:if test="${empty doctor.id }">添加医生</c:if><c:if test="${!empty doctor.id }">修改医生</c:if></button>
											</div>
										</div>
										<br>
									</form>
								</div>	
							</div>	
						</div>
					</div>
				</div>
				<!-- End Main Page -->			
			</div>
		</div><!--/container-->
		<div class="clearfix"></div>
		
		<jsp:include page="/WEB-INF/cms/common/themeFoot.jsp"></jsp:include>
		
<script type="text/javascript" src="<%=basePath%>resources/js/form-validate.js"></script>
</body>
</html>