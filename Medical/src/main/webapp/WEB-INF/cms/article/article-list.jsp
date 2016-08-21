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
		<jsp:include page="/WEB-INF/cms/common/navbar.jsp"></jsp:include>
		<div class="copyrights">医生后台管理系统</a></div>
		<!-- Start: Content -->
		<div class="container-fluid content">	
			<div class="row">
			
				<jsp:include page="/WEB-INF/cms/common/sidebar.jsp"></jsp:include>
		
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
									<h6><i class="fa fa-table red"></i><span class="break"></span>文章列表</h6>
								</div>
								<div class="panel-body">
									<div>	
										<table class="table table-striped table-bordered bootstrap-datatable datatable">
											<thead>
												<tr>
													<th>文章标题</th>
													<th>所属分类</th>
													<th>发布时间</th>
													<th>审核状态</th>
													<th>操作</th>
												</tr>
											</thead>   
											<tbody>								
												<c:forEach items="${articles}" var="article">
													<tr>
														<td>${article.title }</td>
														<td>${article.category }</td>
														<td>${article.hospital }</td>
														<td>${article.department }</td>
														<td>${article.role }</td>
														<td>${doctor.score }</td>
														<td><c:if test="${doctor.status == '1' }">已审核</c:if><c:if test="${doctor.status == '0' }">未审核</c:if></td>
														<td><a href="${ctx}/cms/doctor/formView?id=${doctor.id }">详情&nbsp;&nbsp;</a><a href="${ctx}/cms/doctor/formView?id=${doctor.id }">修改&nbsp;&nbsp;</a><a href="${ctx}/cms/doctor/delete?id=${doctor.id }">删除&nbsp;&nbsp;</a></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<div class="bk-margin-5 btn-group">
											<button type="button" class="btn btn-default">pre</button>
											<button type="button" class="btn btn-primary">1</button>
											<button type="button" class="btn btn-default">2</button>
											<button type="button" class="btn btn-default">3</button>
											<button type="button" class="btn btn-default">4</button>
											<button type="button" class="btn btn-default">5</button>
											<button type="button" class="btn btn-default">next</button>
										</div>
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