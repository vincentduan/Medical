<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="<%=basePath%>resources/theme/assets/ico/favicon.ico"
	type="image/x-icon" />
<link rel="apple-touch-icon" href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon.png" />
<link rel="apple-touch-icon" sizes="57x57"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-57x57.png" />
<link rel="apple-touch-icon" sizes="72x72"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-72x72.png" />
<link rel="apple-touch-icon" sizes="76x76"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-76x76.png" />
<link rel="apple-touch-icon" sizes="114x114"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-114x114.png" />
<link rel="apple-touch-icon" sizes="120x120"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-120x120.png" />
<link rel="apple-touch-icon" sizes="144x144"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-144x144.png" />
<link rel="apple-touch-icon" sizes="152x152"
	href="<%=basePath%>resources/theme/assets/ico/apple-touch-icon-152x152.png" />

<!-- start: CSS file-->

<!-- Vendor CSS-->
<link href="<%=basePath%>resources/theme/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/vendor/skycons/css/skycons.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<!-- Plugins CSS-->

<!-- Theme CSS -->
<link href="<%=basePath%>resources/theme/assets/css/jquery.mmenu.css" rel="stylesheet" />

<!-- Page CSS -->
<link href="<%=basePath%>resources/theme/assets/css/style.css" rel="stylesheet" />
<link href="<%=basePath%>resources/theme/assets/css/add-ons.min.css" rel="stylesheet" />

<style>
footer {
	display: none;
}
</style>

<!-- end: CSS file-->


<script src="<%=basePath%>resources/theme/assets/plugins/modernizr/js/modernizr.js"></script>
