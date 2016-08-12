<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CMS</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@ include file="/WEB-INF/cms/common/taglib.jsp"%>
<jsp:include page="/WEB-INF/cms/common/themeHead.jsp"></jsp:include>
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
						<div class="col-lg-12">
							<div class="panel">
								<div class="panel-heading bk-bg-primary">
									<h6><i class="fa fa-table red"></i><span class="break"></span>医生列表</h6>
								</div>
								<div class="panel-body">
									<div>	
										<table class="table table-striped table-bordered bootstrap-datatable datatable">
											<thead>
												<tr>
													<th>医生姓名</th>
													<th>联系方式</th>
													<th>所在医院</th>
													<th>科室</th>
													<th>职务</th>
													<th>用户评分</th>
													<th>操作</th>
												</tr>
											</thead>   
											<tbody>								
												<c:forEach items="${doctors}" var="doctor">
													<tr>
														<td>${doctor.username }</td>
														<td>${doctor.telphone }</td>
														<td>${doctor.hospital }</td>
														<td>${doctor.department }</td>
														<td>${doctor.role }</td>
														<td>${doctor.score }</td>
														<td><a href="${ctx}/cms/doctor/formView?id=${doctor.id }">详情&nbsp;&nbsp;</a><a href="${ctx}/cms/doctor/formView?id=${doctor.id }">修改&nbsp;&nbsp;</a><a href="${ctx}/cms/doctor/delete?id=${doctor.id }">删除&nbsp;&nbsp;</a></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>					
					</div>
				</div>
				<!-- End Main Page -->			
			</div>
		</div><!--/container-->
		
		
		<!-- Modal Dialog -->
		<div class="modal fade" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title bk-fg-primary">Modal title</h4>
					</div>
					<div class="modal-body">
						<p class="bk-fg-danger">Here settings can be configured...</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
				</div>
			</div>
		</div><!-- End Modal Dialog -->		
		
		<div class="clearfix"></div>		
		
		<jsp:include page="/WEB-INF/cms/common/themeFoot.jsp"></jsp:include>
		
</body>
</html>