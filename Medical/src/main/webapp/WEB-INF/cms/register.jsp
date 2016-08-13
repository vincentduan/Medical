<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>main</title>
<%@include file="/WEB-INF/cms/common/head.jsp"%>
<%@include file="/WEB-INF/cms/common/taglib.jsp"%>
<jsp:include page="/WEB-INF/cms/common/registerHead.jsp"></jsp:include>
</head>
<body>
<!-- Start: Content -->
		<div class="container-fluid content">
			<div class="row">
				<!-- Main Page -->
				<div class="body-register">
					<div class="center-register">
						<a href="#" class="logo pull-left hidden-xs">
							<img src="<%=basePath%>resources/theme/assets/img/logo.png" height="45" alt="NADHIF Admin" />
						</a>

						<div class="panel panel-register">
							<div class="panel-title-register text-right">
								<h2 class="title text-uppercase"><i class="fa fa-user"></i> Register</h2>
							</div>
							<div class="panel-body">
								<form>
									<div class="form-group">
										<label>Name</label>
										<input name="name" type="text" class="form-control" />
									</div>

									<div class="form-group">
										<label>E-mail Address</label>
										<input name="email" type="email" class="form-control" />
									</div>

									<div class="form-group">
										<div class="row">
											<div class="col-sm-6">
												<label>Password</label>
												<input name="pwd" type="password" class="form-control" />
											</div>
											<div class="col-sm-6">
												<label>Password Confirmation</label>
												<input name="pwd_confirm" type="password" class="form-control" />
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-sm-8">
											<div class="checkbox-custom checkbox-default">
												<input id="AgreeTerms" name="agreeterms" type="checkbox"/>
												<label for="AgreeTerms">I agree with <a href="#"><small>terms of use</small></a></label>
											</div>
										</div>
										<div class="col-sm-4 text-right">
											<button href="index.html" type="submit" class="btn btn-primary hidden-xs bk-margin-top-10">Register</button>
											<button href="index.html" type="submit" class="btn btn-primary btn-block btn-lg visible-xs bk-margin-top-10">Register</button>
										</div>
									</div>

									<div class="text-with-hr">
										<span>or use your another account</span>
									</div>
									<br />
									<div class="bk-margin-bottom-10 bk-margin-top-10 text-center">
										<a href="#" class="fa"><img src="<%=basePath%>resources/image/weibo.png" width="45px" height="45px" alt="weibo"></a>
										<a href="#" class="fa"><img src="<%=basePath%>resources/image/weixin.png" width="45px" height="45px" alt="weixin"></a>
										<a href="#" class="fa fa-facebook facebook-bg"></a>
										<a href="#" class="fa"><img src="<%=basePath%>resources/image/qq.png" width="45px" height="45px" alt="qq"></a>
									</div><br />
									<p class="text-center">Already have an account? <a href="<%=basePath%>cms/login"><small>Login!</small></a>
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
		<script src="<%=basePath%>resources/theme/assets/js/pages/page-register.js"></script>
		
		<!-- end: JavaScript-->
</body>
</html>