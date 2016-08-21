<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ include file="/WEB-INF/cms/common/taglib.jsp"%>
<!-- Start: Header -->
<div class="navbar" role="navigation">
	<div class="container-fluid container-nav">
		<div class="navbar-right">
			<div class="userbox">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					<div class="profile-info">
						<span class="name">${sessionScope.doctor.username }</span>
						<span class="role"><c:if test="${sessionScope.doctor.accounttype == '0' }">Administrator</c:if><c:if test="${sessionScope.doctor.accounttype == '1' }">Doctor</c:if></span>
					</div>			
					<i class="fa custom-caret"></i>
				</a>
				<div class="dropdown-menu">
					<ul class="list-unstyled">
						<li class="dropdown-menu-header bk-bg-white bk-margin-top-15">						
<!-- 							<div class="progress progress-xs  progress-striped active">
								<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
									60%
								</div>
							</div>	 -->						
						</li>	
<!-- 						<li>
							<a href="page-profile.html"><i class="fa fa-user"></i> Profile</a>
						</li>
						<li>
							<a href="#"><i class="fa fa-wrench"></i> Settings</a>
						</li>
						<li>
							<a href="page-invoice"><i class="fa fa-usd"></i> Payments</a>
						</li>
						<li>
							<a href="#"><i class="fa fa-file"></i> File</a>
						</li> -->
						<li>
							<a href="${ctx}/cms/logout"><i class="fa fa-power-off"></i> Logout</a>
						</li>
					</ul>
				</div>			
			</div>
			<!-- 医生后台管理系统 -->
		</div>			
	</div>		
</div>
<!-- End: Header -->