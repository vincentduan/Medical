<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>main</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@include file="/WEB-INF/cms/common/taglib.jsp"%>
<jsp:include page="/WEB-INF/cms/common/loginHead.jsp"></jsp:include>
</head>
<body>
<!-- Start: Content -->
		<div class="container-fluid content">
			<div class="row">
				<!-- Main Page -->
				<div class="body-login">
					<div class="center-login">
						<a href="#" class="logo pull-left hidden-xs">
							<img src="<%=basePath%>resources/theme/assets/img/logo.png" height="45" alt="NADHIF Admin" />
						</a>

						<div class="panel panel-login">
							<div class="panel-title-login text-right">
								<h2 class="title"><i class="fa fa-user"></i> Login</h2>
							</div>
							<div class="panel-body">
								<form action="<%=basePath%>cms/login" method="post">
									<div class="form-group">
										<label>Username</label>
										<div class="input-group input-group-icon">
											<input name="username" type="text" class="form-control bk-noradius" />
											<span class="input-group-addon">
												<span class="icon">
													<i class="fa fa-user" style="font-size: 20px;"></i>
												</span>
											</span>
										</div>
									</div>

									<div class="form-group">
										<label>Password</label>									
										<div class="input-group input-group-icon">
											<input name="password" type="password" class="form-control bk-noradius" />
											<span class="input-group-addon">
												<span class="icon">
													<i class="fa fa-lock" style="font-size: 20px;"></i>
												</span>
											</span>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-sm-8">
											<div class="checkbox-custom checkbox-default bk-margin-bottom-10">
												<input id="RememberMe" name="rememberme" type="checkbox"/>
												<label for="RememberMe">Remember Me</label>
											</div>
										</div>
										<div class="col-sm-4 text-right">
											<button href="index.html" type="submit" class="btn btn-primary hidden-xs">Login</button>
											<button href="index.html" type="submit" class="btn btn-primary btn-block btn-lg visible-xs bk-margin-top-10">Login</button>
										</div>
									</div>
									<br />
									<div class="text-with-hr">
										<span>or</span>
									</div>
									<br />
									<div class="bk-margin-bottom-10 bk-margin-top-10 text-center">
										<a href="#" class="fa"><img src="<%=basePath%>resources/image/weibo.png" width="45px" height="45px" alt="weibo"></a>
										<a href="#" class="fa"><img src="<%=basePath%>resources/image/weixin.png" width="45px" height="45px" alt="weixin"></a>
										<a href="#" class="fa fa-facebook facebook-bg"></a>
										<a href="#" class="fa"><img src="<%=basePath%>resources/image/qq.png" width="45px" height="45px" alt="qq"></a>
									</div><br />
									<p class="text-center">Don't have an account yet? <a href="<%=basePath%>cms/register"><small>Register!</small></a>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!-- End Main Page -->
			</div>
		</div><!--/container-->
		
		
		<!-- start: JavaScript-->
		
		<!-- Vendor JS-->				
		<script src="<%=basePath%>resources/theme/assets/vendor/js/jquery.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/js/jquery-2.1.1.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/js/jquery-migrate-1.2.1.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/vendor/skycons/js/skycons.js"></script>	
		
		<!-- Plugins JS-->
		
		<!-- Theme JS -->		
		<script src="<%=basePath%>resources/theme/assets/js/jquery.mmenu.min.js"></script>
		<script src="<%=basePath%>resources/theme/assets/js/core.min.js"></script>
		
		<!-- Pages JS -->
		<script src="<%=basePath%>resources/theme/assets/js/pages/page-login.js"></script>
		
		<!-- end: JavaScript-->
</html>