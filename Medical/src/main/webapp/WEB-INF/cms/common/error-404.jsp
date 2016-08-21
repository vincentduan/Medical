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
	<!-- Start: Content -->
	<div class="container-fluid content">
		<div class="row">
			<!-- Main Page -->
			<div id="content" class="col-sm-12 full">
				<div class="row box-error">
					<div class="col-lg-12 col-md-12 col-xs-12">
						<div class="text-center">
							<h1>404</h1>
							<h2>Oh! Bad request ...</h2>
							<p>The request cannot be fulfilled due to bad syntax.</p>
							<a href="javascript: history.go(-1)">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-chevron-left"></i> Go Back
								</button>
							</a> <a href="<%=basePath%>cms/login">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-lock"></i> Login
								</button>
							</a> <a href="page-profile.html">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-envelope"></i> Contact Admin
								</button>
							</a>
						</div>
					</div>
				</div>
			</div>
			<!-- End Main Page -->


		</div>
	</div>
	<!--/container-->


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
	<script src="<%=basePath%>resources/theme/assets/js/pages/page-404.js"></script>

	<!-- end: JavaScript-->

</body>

</html>