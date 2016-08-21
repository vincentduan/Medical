<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ include file="/WEB-INF/cms/common/taglib.jsp"%>
<div class="sidebar">
	<div class="sidebar-collapse">
		<!-- Sidebar Header Logo-->
		<div class="sidebar-header">
			<img src="<%=basePath%>resources/theme/assets/img/logo.png"
				class="img-responsive" alt="" />
		</div>
		<!-- Sidebar Menu-->
		<div class="sidebar-menu">
			<nav id="menu" class="nav-main" role="navigation">
				<ul class="nav nav-sidebar">
					<div class="panel-body text-center">
						<div class="bk-avatar">
							<img src="<%=basePath%>resources/theme/assets/img/avatar.jpg"
								class="img-circle bk-img-60" alt="" />
						</div>
						<div class="bk-padding-top-10">
							<i class="fa fa-circle text-success"></i> <small>Administrator</small>
						</div>
					</div>
					<div class="divider2"></div>
					<li>
						<a href="page-inbox.html"> <span class="pull-right label label-primary">165</span>
							<i class="fa fa-envelope" aria-hidden="true"></i><span>Mail</span>
						</a>
					</li>
					<c:if test="${sessionScope.doctor.accounttype == '0' }">
						<li class="nav-parent active">
							<a> <i class="fa fa-list-alt" aria-hidden="true"></i><span>医生管理</span></a>
							<ul class="nav nav-children">
								<li><a href="<%=basePath%>cms/doctor/listView"><span class="text"> 医生列表</span></a></li>
								<li><a href="<%=basePath%>cms/doctor/add"><span class="text"> 添加医生</span></a></li>
							</ul>
						</li>
						</c:if>
					<li class="nav-parent"><a> <i class="fa fa-file-text" aria-hidden="true"></i><span>文章管理</span> </a>
						<ul class="nav nav-children">
							<li><a href="page-activity.html"><span class="text">文章列表</span></a></li>
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
			<li><a href="<%=basePath%>cms/doctor/listView">Terms</a></li>
			<li><a href="<%=basePath%>cms/doctor/listView">Privacy</a></li>
			<li><a href="<%=basePath%>cms/doctor/listView">Help</a></li>
			<li><a href="<%=basePath%>cms/doctor/listView">About</a></li>
		</ul>
		<div class="copyright text-center">
			<small>vincent <i class="fa fa-coffee"></i>医生后台管理系统
			</small>
		</div>
	</div>
	<!-- End Sidebar Footer-->
</div>
